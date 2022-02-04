package com.it.msencuesta.application.service;

import com.it.msencuesta.domain.SurveyAnswerStatistics;
import com.it.msencuesta.infrastructure.exception.SurveyException;
import com.it.msencuesta.application.port.interactor.ISurveyService;
import com.it.msencuesta.application.port.output.ISurveyRepository;
import com.it.msencuesta.domain.Survey;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SurveyService implements ISurveyService {

    private final ISurveyRepository encuestaRepository;

    @Override
    public void create(Survey survey) {

        if(encuestaRepository.existsByMail(survey.getMail())) {
            throw new SurveyException(String.format("El email %s ya ha votado", survey.getMail()), HttpStatus.BAD_REQUEST);
        }

        encuestaRepository.create(survey);
    }

    @Override
    public List<SurveyAnswerStatistics> getAnswerStatistics() {
        return encuestaRepository.groupAllByMusicalStyle();
    }


}

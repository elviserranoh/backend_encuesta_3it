package com.it.msencuesta.infrastructure.repository;

import com.it.msencuesta.application.port.output.ISurveyRepository;
import com.it.msencuesta.domain.Survey;
import com.it.msencuesta.domain.SurveyAnswerStatistics;
import com.it.msencuesta.infrastructure.mapper.SurveyEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Primary
@RequiredArgsConstructor
public class SurveyRepository implements ISurveyRepository {

    private final SpringDataSurveyRepository springDataSurveyRepository;
    private final SurveyEntityMapper mapper;

    @Override
    public void create(final Survey survey) {

        SurveyEntity entity = mapper.toDbo(survey);

        springDataSurveyRepository.save(entity);
    }

    @Override
    public boolean existsByMail(String mail) {
        return springDataSurveyRepository.existsById(mail);
    }

    @Override
    public List<SurveyAnswerStatistics> groupAllByMusicalStyle() {
        return  springDataSurveyRepository.groupByAllByMusicalStyle();
    }
}

package com.it.msencuesta.application.port.interactor;

import com.it.msencuesta.domain.Survey;
import com.it.msencuesta.domain.SurveyAnswerStatistics;

import java.util.List;

public interface ISurveyService {
    void create(Survey survey);
    List<SurveyAnswerStatistics> getAnswerStatistics();
}

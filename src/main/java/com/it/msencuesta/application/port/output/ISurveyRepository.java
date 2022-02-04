package com.it.msencuesta.application.port.output;

import com.it.msencuesta.domain.Survey;
import com.it.msencuesta.domain.SurveyAnswerStatistics;

import java.util.List;

public interface ISurveyRepository {

    void create(final Survey survey);
    boolean existsByMail(final String mail);
    List<SurveyAnswerStatistics> groupAllByMusicalStyle();
}

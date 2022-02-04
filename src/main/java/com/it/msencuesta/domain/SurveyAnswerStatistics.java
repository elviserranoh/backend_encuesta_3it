package com.it.msencuesta.domain;

import lombok.*;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Getter
@Setter
public class SurveyAnswerStatistics {

    @Enumerated(EnumType.STRING)
    private MusicalStyleType musicalStyle;

    private Long cnt;

    public SurveyAnswerStatistics(MusicalStyleType musicalStyle, Long cnt) {
        this.musicalStyle = musicalStyle;
        this.cnt  = cnt;
    }
}

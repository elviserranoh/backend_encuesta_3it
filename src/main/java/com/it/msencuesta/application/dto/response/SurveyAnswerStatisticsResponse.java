package com.it.msencuesta.application.dto.response;

import com.it.msencuesta.domain.SurveyAnswerStatistics;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
public class SurveyAnswerStatisticsResponse {
    private final List<SurveyAnswerStatistics> data;
}
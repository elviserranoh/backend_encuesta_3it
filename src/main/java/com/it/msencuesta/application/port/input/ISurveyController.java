package com.it.msencuesta.application.port.input;

import com.it.msencuesta.application.dto.request.CreateSurveyRequest;
import com.it.msencuesta.application.dto.response.CreateSurveyResponse;
import com.it.msencuesta.application.dto.response.GetMusicalStyleResponse;
import com.it.msencuesta.application.dto.response.SurveyAnswerStatisticsResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import javax.validation.Valid;

public interface ISurveyController {
    ResponseEntity<CreateSurveyResponse> create(@RequestHeader HttpHeaders headers,
                                                @Valid @RequestBody CreateSurveyRequest request);
    ResponseEntity<GetMusicalStyleResponse> getMusicalStyles();
    ResponseEntity<SurveyAnswerStatisticsResponse> getAnswerStatistics();
}

package com.it.msencuesta.infrastructure.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZonedDateTime;

@ControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(value = {SurveyException.class})
    public ResponseEntity<Object> handleApiRequestException(SurveyException e) {
        SurveyExceptionModel surveyExceptionModel = new SurveyExceptionModel(e.getMessage(),
                e.getHttpStatus(),
                ZonedDateTime.now());

        return new ResponseEntity<>(surveyExceptionModel, e.getHttpStatus());
    }

}

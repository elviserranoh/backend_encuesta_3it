package com.it.msencuesta.infrastructure.exception;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Setter
@Getter
public class SurveyException extends RuntimeException {

    private final HttpStatus httpStatus;

    public SurveyException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }


}

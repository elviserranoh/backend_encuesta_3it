package com.it.msencuesta.application.dto.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class CreateSurveyResponse {
    private final String mail;
}

package com.it.msencuesta.application.dto.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.it.msencuesta.domain.Survey;
import lombok.Getter;

import javax.validation.constraints.NotNull;

@Getter
public class CreateSurveyRequest {

    @NotNull private Survey survey;

    @JsonCreator
    public CreateSurveyRequest(@JsonProperty("survey") @NotNull final Survey survey) {
        this.survey = survey;
    }

}

package com.it.msencuesta.infrastructure.mapper;

import com.it.msencuesta.domain.Survey;
import com.it.msencuesta.infrastructure.repository.SurveyEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SurveyEntityMapper {
    Survey toDomain(SurveyEntity surveyEntity);
    SurveyEntity toDbo(Survey survey);
}

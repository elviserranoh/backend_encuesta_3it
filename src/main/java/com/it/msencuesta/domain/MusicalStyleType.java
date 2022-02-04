package com.it.msencuesta.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.it.msencuesta.infrastructure.exception.SurveyException;
import org.springframework.http.HttpStatus;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum MusicalStyleType {

    ROCK("ROCK"),
    POP("POP"),
    JAZZ("JAZZ"),
    CLASICA("CLASICA");

    private static final Map<String, MusicalStyleType> COMPARE_ENUM_WITH_STRING = Stream
            .of(MusicalStyleType.values())
            .collect(Collectors.toMap(Enum::name, Function.identity()));

    private final String musicalStyle;

    MusicalStyleType(String musicalStyle) {
        this.musicalStyle = musicalStyle;
    }

    @JsonCreator
    public static MusicalStyleType fromString(String string) {
        return Optional
                .ofNullable(COMPARE_ENUM_WITH_STRING.get(string))
                .orElseThrow(() -> new SurveyException(String.format("El estilo musical %s no existe", string), HttpStatus.BAD_REQUEST));
    }

}

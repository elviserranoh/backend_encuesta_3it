package com.it.msencuesta.application.dto.response;

import com.it.msencuesta.domain.MusicalStyleType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
public class GetMusicalStyleResponse {
    private final List<MusicalStyleType> musicalStyles;
}

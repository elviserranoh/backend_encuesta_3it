package com.it.msencuesta.infrastructure.controller;

import com.it.msencuesta.application.dto.request.CreateSurveyRequest;
import com.it.msencuesta.application.dto.response.CreateSurveyResponse;
import com.it.msencuesta.application.dto.response.GetMusicalStyleResponse;
import com.it.msencuesta.application.dto.response.SurveyAnswerStatisticsResponse;
import com.it.msencuesta.application.port.input.ISurveyController;
import com.it.msencuesta.application.port.interactor.ISurveyService;
import com.it.msencuesta.domain.MusicalStyleType;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/survey")
@RequiredArgsConstructor
public class SurveyController implements ISurveyController {

    private final ISurveyService encuestaService;

    @ApiOperation(value = "Realizar votacion por estilo musical")
    @PostMapping(value = "vote")
    @Override
    public ResponseEntity<CreateSurveyResponse> create(HttpHeaders headers, CreateSurveyRequest request) {
        encuestaService.create(request.getSurvey());
        return ResponseEntity.ok(new CreateSurveyResponse(request.getSurvey().getMail()));
    }

    @ApiOperation(value = "Obtener estilos musicales")
    @GetMapping(value = "musical/styles")
    @Override
    public ResponseEntity<GetMusicalStyleResponse> getMusicalStyles() {
        return ResponseEntity.ok(new GetMusicalStyleResponse(Arrays.asList(MusicalStyleType.values())));
    }

    @ApiOperation(value = "Obtener las estadisticas de los estilos musicales")
    @GetMapping(value = "answers/statistics")
    @Override
    public ResponseEntity<SurveyAnswerStatisticsResponse> getAnswerStatistics() {
        return ResponseEntity.ok(new SurveyAnswerStatisticsResponse(encuestaService.getAnswerStatistics()));
    }
}

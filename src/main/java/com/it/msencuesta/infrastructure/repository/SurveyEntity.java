package com.it.msencuesta.infrastructure.repository;

import com.it.msencuesta.domain.MusicalStyleType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "TBL_ENCUESTA")
public class SurveyEntity {

    @Id
    private String mail;

    @Enumerated(EnumType.STRING)
    @Column(name = "musical_style")
    private MusicalStyleType musicalStyle;

}
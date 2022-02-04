package com.it.msencuesta.infrastructure.repository;

import com.it.msencuesta.domain.SurveyAnswerStatistics;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpringDataSurveyRepository extends CrudRepository<SurveyEntity, String> {

    @Query("SELECT " +
            "    new com.it.msencuesta.domain.SurveyAnswerStatistics(e.musicalStyle, COUNT(e)) " +
            "FROM " +
            "    SurveyEntity e " +
            "GROUP BY " +
            "    e.musicalStyle")
    List<SurveyAnswerStatistics> groupByAllByMusicalStyle();

}

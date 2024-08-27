package com.survey.surveyProject.dao;

import com.survey.surveyProject.entity.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RestController;

@RepositoryRestResource
public interface AnswerRepo extends JpaRepository<Answer,Long> {
}

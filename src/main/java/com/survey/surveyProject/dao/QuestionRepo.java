package com.survey.surveyProject.dao;

import com.survey.surveyProject.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface QuestionRepo extends JpaRepository<Question,Long> {
}

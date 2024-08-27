package com.survey.surveyProject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name= "answer")
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String answer;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question questionId;

    @ManyToOne
    @JoinColumn(name = "survey_response_id")
    private SurveyResponse survey;
}

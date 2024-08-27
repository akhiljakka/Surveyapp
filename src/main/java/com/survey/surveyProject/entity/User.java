package com.survey.surveyProject.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "user")
@Data
@Getter
@Setter
public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
    private  Long id;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "email")
    private String email;
    @CreationTimestamp
    @Column(name = "creation_date")
    private Date creationDate;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "user")
    private Set<SurveyResponse> surveyResponses = new HashSet<>();
}

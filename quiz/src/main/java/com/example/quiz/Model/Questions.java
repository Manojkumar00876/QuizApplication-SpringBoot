package com.example.quiz.Model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="questions")
public class Questions {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "category")
    private String category;

    @Column(name = "difficulty")
    private String difficulty;

    @Column(name = "question_title")
    private String title;

    @Column(name = "option_1")
    private String option1;

    @Column(name = "option_2")
    private String option2;

    @Column(name = "option_3")
    private String option3;

    @Column(name = "option_4")
    private String option4;

    @Column(name = "correct_answer")
    private String answer;
}

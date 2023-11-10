package com.example.quiz.Dao;

import com.example.quiz.Model.Questions;
import jdk.jfr.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface QuestionsDao extends JpaRepository<Questions,Integer> {

    @Query("SELECT q FROM Questions q WHERE q.category = :category")
    List<Questions> findByCategory(String category);
}

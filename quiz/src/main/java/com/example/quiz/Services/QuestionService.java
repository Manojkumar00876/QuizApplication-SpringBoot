package com.example.quiz.Services;

import com.example.quiz.Dao.QuestionsDao;
import com.example.quiz.Model.Questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionsDao questionsDao;

    public List<Questions> getAll() {
        return questionsDao.findAll();
    }

    public List<Questions> getByCategory(String category) {
      return questionsDao.findByCategory(category);
    }
}

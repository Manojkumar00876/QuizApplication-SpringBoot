package com.example.quiz.Controller;

import com.example.quiz.Model.Questions;
import com.example.quiz.Services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Questions")
public class questionController {

    @Autowired
    QuestionService questionService;


    @GetMapping("/getAll")
    public List<Questions> getAll(){
        return questionService.getAll();
    }

    @GetMapping("/category/{category}")
        public List<Questions> getByCategory(@PathVariable(value = "category") String category){
        return questionService.getByCategory(category);
        }

        @PostMapping("/save")
        public String addQuestions(@RequestBody Questions questions){
        return questionService.addQuestions(questions);
        }

}

package com.stackoverflow.api.controller;

import com.stackoverflow.api.dto.QuestionItem;
import com.stackoverflow.api.dto.StackExchangeQuestion;
import com.stackoverflow.api.service.StackOverflowService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/questions")
public class StackExchangeController {

    private final StackOverflowService stackOverflowService;

    public StackExchangeController(StackOverflowService stackOverflowService) {
        this.stackOverflowService = stackOverflowService;
    }

    @GetMapping
    public QuestionItem getQuestionDetails() {
        return stackOverflowService.getFirstQuestionDetails();
    }
    @GetMapping("/{tagged}")
    public StackExchangeQuestion getQuestions(@PathVariable String tagged) {
        return stackOverflowService.getQuestions(tagged);
    }
}
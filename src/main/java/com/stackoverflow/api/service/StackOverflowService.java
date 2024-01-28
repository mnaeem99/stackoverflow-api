package com.stackoverflow.api.service;

import com.stackoverflow.api.dto.QuestionItem;
import com.stackoverflow.api.dto.StackExchangeQuestion;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
public class StackOverflowService {

    private final RestTemplate restTemplate;

    public StackOverflowService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public QuestionItem getFirstQuestionDetails() {
        String apiUrl = "https://api.stackexchange.com/2.3/questions?page=1&pagesize=1&order=desc&sort=creation&tagged=spring-boot&site=stackoverflow&filter=!)QWRa9I-CAn0PqgUwq7)DVTM";
        StackExchangeQuestion stackExchangeApiResponse = null;

        try {
            stackExchangeApiResponse = restTemplate.getForObject(apiUrl, StackExchangeQuestion.class);
        } catch (RestClientException e) {
            e.printStackTrace();
        }

        // Check if response and items are not null
        if (stackExchangeApiResponse != null && stackExchangeApiResponse.getItems() != null && !stackExchangeApiResponse.getItems().isEmpty()) {
            return stackExchangeApiResponse.getItems().get(0);
        }

        // Return an error message if something goes wrong
        return null;
    }

    public StackExchangeQuestion getQuestions(String tagged) {
        String apiUrl = "https://api.stackexchange.com/2.3/questions?order=desc&sort=creation&tagged="+tagged+"&site=stackoverflow&filter=!)QWRa9I-CAn0PqgUwq7)DVTM";
        StackExchangeQuestion stackExchangeApiResponse = null;

        try {
            stackExchangeApiResponse = restTemplate.getForObject(apiUrl, StackExchangeQuestion.class);
        } catch (RestClientException e) {
            e.printStackTrace();
            return null;
        }
        return stackExchangeApiResponse;
    }
}


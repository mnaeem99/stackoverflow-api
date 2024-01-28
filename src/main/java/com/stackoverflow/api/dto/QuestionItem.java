package com.stackoverflow.api.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QuestionItem {
    public ArrayList<String> tags;
    public boolean is_answered;
    public int score;
    public int creation_date;
    public int question_id;
    public String link;
    public String title;
    public String body;

}

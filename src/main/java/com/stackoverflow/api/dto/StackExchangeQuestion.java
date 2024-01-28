package com.stackoverflow.api.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StackExchangeQuestion{
    @JsonProperty("items")
    public ArrayList<QuestionItem> items;
//    public boolean has_more;
//    public int quota_max;
//    public int quota_remaining;

    public ArrayList<QuestionItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<QuestionItem> items) {
        this.items = items;
    }

//    public boolean isHas_more() {
//        return has_more;
//    }
//
//    public void setHas_more(boolean has_more) {
//        this.has_more = has_more;
//    }
//
//    public int getQuota_max() {
//        return quota_max;
//    }
//
//    public void setQuota_max(int quota_max) {
//        this.quota_max = quota_max;
//    }
//
//    public int getQuota_remaining() {
//        return quota_remaining;
//    }
//
//    public void setQuota_remaining(int quota_remaining) {
//        this.quota_remaining = quota_remaining;
//    }
}

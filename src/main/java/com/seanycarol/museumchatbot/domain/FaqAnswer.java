package com.seanycarol.museumchatbot.domain;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class FaqAnswer {
    private List<String> keywords;
    private String answer;
}

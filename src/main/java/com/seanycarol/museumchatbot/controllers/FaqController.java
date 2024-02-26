package com.seanycarol.museumchatbot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seanycarol.museumchatbot.dtos.MessageRequest;
import com.seanycarol.museumchatbot.dtos.MessageResponse;
import com.seanycarol.museumchatbot.services.FaqService;

@RestController
@RequestMapping("/api/chat")
public class FaqController {
    
    @Autowired
    private FaqService faqService;

    @PostMapping
    public ResponseEntity<MessageResponse> answerQuestion(@RequestBody MessageRequest request) {
        String answer = this.faqService.getAnswer(request.message());
        MessageResponse response = new MessageResponse(answer);
        return ResponseEntity.ok(response);
    }
}
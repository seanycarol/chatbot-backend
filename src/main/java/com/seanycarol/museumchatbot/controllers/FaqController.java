package com.seanycarol.museumchatbot.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seanycarol.museumchatbot.dtos.MessageRequest;

@RestController
@RequestMapping("/api/chat")
public class FaqController {
    
    @PostMapping
    public ResponseEntity<String> answerQuestion(@RequestBody MessageRequest request) {
        System.out.println(request.message());
        return ResponseEntity.ok("oi deu certo");
    }
}
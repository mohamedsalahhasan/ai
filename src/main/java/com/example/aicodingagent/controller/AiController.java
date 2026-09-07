package com.example.aicodingagent.controller;

import com.example.aicodingagent.tools.FileTools;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AiController {

    private final ChatClient chatClient;

    public AiController(
            ChatClient.Builder chatClientBuilder,
            FileTools fileTools) {

        this.chatClient = chatClientBuilder
                .defaultTools(fileTools)
                .build();
    }

    @GetMapping("/ai")
    public String askAI(@RequestParam String message) {

        return chatClient
                .prompt()
                .user(message)
                .call()
                .content();
    }
}
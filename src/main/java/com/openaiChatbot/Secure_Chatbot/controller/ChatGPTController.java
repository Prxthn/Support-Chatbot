package com.openaiChatbot.Secure_Chatbot.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.openaiChatbot.Secure_Chatbot.service.ChatGPTService;
import com.openaiChatbot.Secure_Chatbot.dto.PromptRequest;
import com.openaiChatbot.Secure_Chatbot.dto.ChatGPTResponse;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/chat")
public class ChatGPTController {
    private final ChatGPTService chatGPTService;
    
    public ChatGPTController(ChatGPTService chatGPTService) {
        this.chatGPTService = chatGPTService;
    }

    @PostMapping
    public String chat(@RequestBody PromptRequest promptRequest) {
        return chatGPTService.getChatResponse(promptRequest);
    }
}

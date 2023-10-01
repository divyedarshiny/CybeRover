package com.project.chatbot;

import com.project.chatbot.bot.ChatBot;
import org.springframework.stereotype.Service;

@Service
public class ChatbotService {

    private final ChatBot chatBot;

    public ChatbotService() {
        chatBot = new ChatBot();
    }

    public String getResponse(String userInput) {
        // Use the ChatBot instance to get a response
        return chatBot.getResponse(userInput);
    }
}
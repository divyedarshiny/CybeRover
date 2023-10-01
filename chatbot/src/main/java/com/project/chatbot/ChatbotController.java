package com.project.chatbot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ChatbotController {

    @Autowired
    private ChatbotService chatbotService;

    private List<ChatMessage> messages = new ArrayList<>();

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("messages", messages);
        return "index"; // This will return the "index.html" template.
    }

    @PostMapping("/chat")
    public String chat(String userInput, Model model) {

        messages.add(new ChatMessage(userInput, true));

        String botResponse = chatbotService.getResponse(userInput);

        messages.add(new ChatMessage(botResponse, false));

        model.addAttribute("messages", messages);

        return "index";
    }
}
package com.project.chatbot.bot;

import java.util.*;

public class ChatBot {
    private Map<String, List<String>> responses;

    public ChatBot() {
        responses = new HashMap<>();
        responses.put("hello", Arrays.asList("Hello! How can I assist you?", "Hi there!"));
        responses.put("how are you", Arrays.asList("I'm just a computer program, but I'm here to help!", "I'm doing well!"));
        responses.put("bye", Arrays.asList("Goodbye! Have a great day!", "Farewell!"));
        responses.put("hey", Arrays.asList("Hello! How can I assist you?", "Hi there!"));
        responses.put("hi", Arrays.asList("Hello! How can I assist you?", "What's up?"));
    }

    public String getResponse(String userInput) {
        userInput = userInput.toLowerCase();
        List<String> possibleResponses = responses.get(userInput);
        if (possibleResponses != null) {
            // Randomly select a response
            int randomIndex = new Random().nextInt(possibleResponses.size());
            return possibleResponses.get(randomIndex);
        }
        return "I'm not sure how to respond to that.";
    }

    public static void main(String[] args) {
        ChatBot chatbot = new ChatBot();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chatbot: Hello! Type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("bye")) {
                System.out.println("Chatbot: Goodbye!");
                break;
            }

            String response = chatbot.getResponse(userInput);
            System.out.println("Chatbot: " + response);
        }

        scanner.close();
    }
}
package com.project.chatbot;

public class ChatMessage {
    private String content;
    private boolean user;

    public ChatMessage(String content, boolean user) {
        this.content = content;
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public boolean isUser() {
        return user;
    }
}
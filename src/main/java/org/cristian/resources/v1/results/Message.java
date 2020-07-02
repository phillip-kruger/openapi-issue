package org.cristian.resources.v1.results;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class Message {
    private String message;
    private String description;

    public Message() {
    }

    public Message(String message) {
        this.message = message;
    }

    public Message(String message, String description) {
        this.message = message;
        this.description = description;
    }

    public String getMessage() {
        return message;
    }

    public String getDescription() {
        return description;
    }

}
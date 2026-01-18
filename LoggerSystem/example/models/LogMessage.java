package org.example.models;

import org.example.enums.LogLevel;

public class LogMessage {
    private final LogLevel level;
    private final String message;
    private final long timestamp;

    public LogMessage(LogLevel level, String message, long timestamp) {
        this.level = level;
        this.message = message;
        this.timestamp = timestamp;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public LogLevel getLevel() {
        return level;
    }

    public String getMessage() {
        return message;
    }
}

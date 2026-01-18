package org.example.formatters;

import org.example.models.LogMessage;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class JSONFormatter implements LogFormatter{
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Override
    public String format(LogMessage message) {
        String formattedTime = LocalDateTime.ofInstant(
                Instant.ofEpochMilli(message.getTimestamp()),
                ZoneId.systemDefault()
        ).format(formatter);
        return String.format("{\"timestamp\": %s, \"level\":%s, \"message\":\"%s\"}");
    }
}

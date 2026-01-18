package org.example.formatters;

import org.example.models.LogMessage;

import java.time.format.DateTimeFormatter;

public interface LogFormatter {
    String format(LogMessage message);
}

package org.example.appenders;

import org.example.formatters.LogFormatter;
import org.example.models.LogMessage;

public class ConsoleAppender implements LogAppender{
    private final LogFormatter logFormatter;

    public ConsoleAppender(LogFormatter logFormatter) {
        this.logFormatter = logFormatter;
    }

    public void append(LogMessage message){
        System.out.println(logFormatter.format(message));
    }
}

package org.example.handlers;

import org.example.enums.LogLevel;
import org.example.handlers.LogHandler;

public class InfoHandler extends LogHandler {

    public boolean canHadle(LogLevel level){
        return (level == LogLevel.INFO);
    }
}

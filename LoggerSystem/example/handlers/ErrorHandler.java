package org.example.handlers;

import org.example.enums.LogLevel;

public class ErrorHandler extends LogHandler {

    public boolean canHadle(LogLevel level){
        return (level == LogLevel.ERROR);
    }
}

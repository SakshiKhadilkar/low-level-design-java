package org.example.handlers;

import org.example.enums.LogLevel;

public class FatalHandler extends LogHandler{
        public boolean canHadle(LogLevel level){
            return (level == LogLevel.FATAL);
        }
}

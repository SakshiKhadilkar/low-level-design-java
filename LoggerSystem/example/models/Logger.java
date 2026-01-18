package org.example.models;

import org.example.enums.LogLevel;
import org.example.handlers.LogHandler;

public class Logger {
    private static final Logger logger = new Logger();
    private final LogHandler handlerChain;

    private Logger(){
        handlerChain = LogHandlerConfiguration.build();
    };

    public static Logger getInstance(){
        return logger;
    }

    public void log(LogLevel level, String message){
        LogMessage msg = new LogMessage(level,message,System.currentTimeMillis());
        handlerChain.handle(msg);
    }
    public void debug(String msg){
        log(LogLevel.DEBUG,msg);
    }
    public void info(String msg){
        log(LogLevel.INFO,msg);
    }
    public void war(String msg){
        log(LogLevel.WARN,msg);
    }
    public void error(String msg){
        log(LogLevel.ERROR,msg);
    }
    public void fatal(String msg){
        log(LogLevel.FATAL,msg);
    }


}

package org.example.handlers;

import org.example.appenders.LogAppender;
import org.example.enums.LogLevel;
import org.example.models.LogMessage;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class LogHandler {

    protected LogHandler next;
    protected final List<LogAppender> appenders = new CopyOnWriteArrayList<>();

    public void subscribe(LogAppender appender){
        appenders.add(appender);
    }

    public void notifyObservers(LogMessage message){
        for(LogAppender appender: appenders){
            appender.append(message);
        }
    }

    public void setNext(LogHandler next) {
        this.next = next;
    }

    public void handle(LogMessage message){
        if(canHadle(message.getLevel())){
            notifyObservers(message);
        }else if(next != null){
            next.handle(message);
        }
    }
    protected abstract boolean canHadle(LogLevel level);
}

package org.example;

import org.example.appenders.ConsoleAppender;
import org.example.appenders.FileAppender;
import org.example.enums.LogLevel;
import org.example.formatters.PlainTextFormatter;
import org.example.models.LogHandlerConfiguration;
import org.example.models.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Logger logger = Logger.getInstance();

        LogHandlerConfiguration.addAppenderForLevel(LogLevel.ERROR,new ConsoleAppender(new PlainTextFormatter()));
        LogHandlerConfiguration.addAppenderForLevel(LogLevel.ERROR,new FileAppender(new PlainTextFormatter(),"logs.txt"));

        LogHandlerConfiguration.addAppenderForLevel(LogLevel.INFO,new ConsoleAppender(new PlainTextFormatter()));

        logger.info("This is some info level msg");
        logger.error("ERRROR ERROR ERRROR");
    }
}

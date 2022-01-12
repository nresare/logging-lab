package com.resare.lab.logging;

import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LogTest {
//    private static final Logger logger = LoggerFactory.getLogger(LogTest.class);
    private static final Logger logger = Logger.getLogger(LogTest.class.getName());

    public static void main(String[] args) {
        initLogging();

        logger.info("there, there and everywhere");
    }

    private static void initLogging() {
        try {
            LogManager.getLogManager().readConfiguration(
                    LogTest.class.getClassLoader().getResourceAsStream("logging.properties")
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

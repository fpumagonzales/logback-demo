package com.example.logback.demo;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;

public class LoggerLevelDemo {
  private static final Logger logger = (Logger)LoggerFactory
      .getLogger(LoggerLevelDemo.class);

  public static void main(String[] args) {
    logger.setLevel(Level.TRACE);
    
    logger.trace("This is a trace logger");
    logger.debug("This is a debug logger");
    logger.info("This is an info logger");
    logger.warn("This is a warn logger");
    logger.error("This is an error logger");

  }

}

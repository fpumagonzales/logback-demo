package com.example.logback.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerParameterizedDemo {
  private static final Logger logger = LoggerFactory
      .getLogger(LoggerParameterizedDemo.class);

  public static int sum(int... values) {
    int n = 0;
    
    for(int i: values) {
      n+=i;
    }
    return n;

  }
  
  public static void main(String[] args) {

    int x = sum(1,2,3);
    logger.info("result:{}", x);
  }
}

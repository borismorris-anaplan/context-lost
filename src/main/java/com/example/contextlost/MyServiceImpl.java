package com.example.contextlost;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.sleuth.SpanName;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {

    public static final Logger logger = LoggerFactory.getLogger(MyServiceImpl.class);

    @SpanName("service")
    @Async
    @Override
    public void service() {
        logger.info("Doing some service stuff");
    }
}

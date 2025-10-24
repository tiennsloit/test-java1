package com.example.demo;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PortLoggingConfig {
    private static final Logger logger = LoggerFactory.getLogger(PortLoggingConfig.class);

    @Value("${server.port}")
    private String serverPort;

    @PostConstruct
    public void logServerPort() {
        logger.info("Application started on port: {}", serverPort);
    }
}
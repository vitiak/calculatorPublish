package com.kodilla.calculator.service;

import com.kodilla.calculator.event.CalculatorRegisteredEvent;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class ServiceImageManager implements ApplicationListener<CalculatorRegisteredEvent> {

@Override
public void onApplicationEvent(CalculatorRegisteredEvent event) {
        Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());
        logger.info("generated operation " + event.getOperation());
        System.out.println("generated operation " + event.getOperation() );
        }

}
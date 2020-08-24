package com.kodilla.calculator.event;

import org.springframework.context.ApplicationEvent;

public class CalculatorRegisteredEvent extends ApplicationEvent {
    private double value1;
    private double value2;
    private String operation;

    public CalculatorRegisteredEvent(Object source, double value1, double value2, String operation) {
        super(source);
        this.value1 = value1;
        this.value2 = value2;
        this.operation = operation;
    }

    public double getValue1() {
        return value1;
    }

    public double getValue2() {
        return value2;
    }

    public String getOperation() {
        return operation;
    }
}

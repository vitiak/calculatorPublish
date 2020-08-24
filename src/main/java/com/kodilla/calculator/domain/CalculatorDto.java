package com.kodilla.calculator.domain;

public class CalculatorDto {
    private double value1;
    private double value2;
    private String operation;

    public CalculatorDto(double value1, double value2, String operation) {
        this.value1 = value1;
        this.value2 = value2;
        this.operation = operation;
    }

    public double add(double value1, double value2) {
        return value1 + value2;
    }

    public double sub(double value1, double value2) {
        return value1 - value2;
    }

    public double mul(double value1, double value2) {
        return value1 * value2;
    }

    public double div(double value1, double value2) {
        return value1 / value2;
    }

    public String getOperation() {
        return operation;
    }

    public double getValue1() {
        return value1;
    }

    public double getValue2() {
        return value2;
    }

}

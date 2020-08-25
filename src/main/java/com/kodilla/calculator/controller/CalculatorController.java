package com.kodilla.calculator.controller;

import com.kodilla.calculator.domain.CalculatorDto;
import com.kodilla.calculator.event.CalculatorRegisteredEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/calculator")
public class CalculatorController implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher publisher;

    @PostMapping(path = "addValues")
    public double addValues(@RequestBody CalculatorDto calculatorDto) {
        System.out.println("value1 + value2 = " + calculatorDto.add(calculatorDto.getValue1(), calculatorDto.getValue2()));
        publisher.publishEvent(
                new CalculatorRegisteredEvent(
                        this,
                        calculatorDto.getValue1(),
                        calculatorDto.getValue2(),
                        calculatorDto.getOperation()));
        return calculatorDto.add(calculatorDto.getValue1(), calculatorDto.getValue2());
    }

    @PostMapping(path = "subValues")
    public double subValues(@RequestBody CalculatorDto calculatorDto) {
        System.out.println("value1 - value2 = " + calculatorDto.sub(calculatorDto.getValue1(), calculatorDto.getValue2()));
        publisher.publishEvent(
                new CalculatorRegisteredEvent(
                        this,
                        calculatorDto.getValue1(),
                        calculatorDto.getValue2(),
                        calculatorDto.getOperation()));
        return calculatorDto.sub(calculatorDto.getValue1(), calculatorDto.getValue2());
    }

    @PostMapping(path = "divValues")
    public double divValues(@RequestBody CalculatorDto calculatorDto) {
        System.out.println("value1 / value2 = "  + calculatorDto.div(calculatorDto.getValue1(), calculatorDto.getValue2()));
        publisher.publishEvent(
                new CalculatorRegisteredEvent(
                        this,
                        calculatorDto.getValue1(),
                        calculatorDto.getValue2(),
                        calculatorDto.getOperation()));
        return calculatorDto.div(calculatorDto.getValue1(), calculatorDto.getValue2());
    }

    @PostMapping(path = "mulValues")
    public double mulValues(@RequestBody CalculatorDto calculatorDto) {
        System.out.println("value1 * value2 = " + calculatorDto.mul(calculatorDto.getValue1(), calculatorDto.getValue2()));
        publisher.publishEvent(
                new CalculatorRegisteredEvent(
                        this,
                        calculatorDto.getValue1(),
                        calculatorDto.getValue2(),
                        calculatorDto.getOperation()));
        return calculatorDto.mul(calculatorDto.getValue1(), calculatorDto.getValue2());
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }
}

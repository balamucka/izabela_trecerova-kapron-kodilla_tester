package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CarGarageTestSuite {

    @Test

    public void shouldPickCar() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("pickCar");
        String type = car.getTypeCar();
        System.out.println(type);
        List<String> possibleTypes = Arrays.asList("SUV", "Cabrio", "Sedan");
        Assertions.assertTrue(possibleTypes.contains(type));
    }

    @Test
    public void shouldHaveLightsOnOrOff() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("pickCar");
        boolean result = car.hasHeadlightsTurnedOn();
        Assertions.assertFalse(result);
    }
}
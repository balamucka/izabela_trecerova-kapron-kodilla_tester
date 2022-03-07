package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {

    Shop shop = new Shop();
    Order Chair = new Order(500, LocalDate.of(2022, 1, 26), "John");
    Order Table = new Order(2000, LocalDate.of(2022, 2, 2), "KingBoss");
    Order Sofa = new Order(3500, LocalDate.of(2021, 10, 20), "Jess");
    Order Closet = new Order(5200, LocalDate.of(2021, 9, 10), "Tom");

    @BeforeEach
    public void initializeShop() {
        shop.addOrder(Chair);
        shop.addOrder(Table);
        shop.addOrder(Sofa);
        shop.addOrder(Closet);
    }

    @Test
    public void shouldAddOrders() {
        int numberOfOrders = shop.getQuantity();
                assertEquals(4, numberOfOrders);
    }

    @Test
    public void shouldReturnOrderFromTwoDates() {
        List<Order> expected = new ArrayList<>();
        expected.add(Chair);
        List<Order> result = shop.getOrdersFromDates(LocalDate.of(2022,1,1), LocalDate.of(2022,1,31));
        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnOrdersBetweenValues() {
        List<Order> result = shop.getOrderBetweenValues(3000, 4000);
        List<Order> expected = new ArrayList<>();
        expected.add(Sofa);
        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnSumOfValuesOrders() {
        double result = shop.getValuesOfOrders();
        assertEquals(11200, result);
    }

}








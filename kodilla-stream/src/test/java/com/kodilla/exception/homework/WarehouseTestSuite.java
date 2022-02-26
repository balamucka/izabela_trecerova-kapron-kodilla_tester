package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    @Test
    public void testgetOrder() throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1/2022"));
        warehouse.addOrder(new Order("2/2022"));

        Order getOrder = warehouse.getOrders("2/2022");
        assertNotNull(getOrder);
    }

    @Test
    public void testgetOrder_withException() {
        Warehouse warehouse = new Warehouse();
        assertThrows(OrderDoesntExistException.class, () ->warehouse.getOrders("3/2022"));
    }

}
package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1/2022"));
        warehouse.addOrder(new Order("2/2022"));
        warehouse.addOrder(new Order("3/2022"));

        try{
            warehouse.getOrders("4/2022");
        } catch (OrderDoesntExistException e) {
            System.out.println("Sorry, this order do not exist.");
        } finally {
            System.out.println("Thank you for using our warehouse.");
        }
    }
}

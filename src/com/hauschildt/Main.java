package com.hauschildt;

public class Main {

    public static void main(String[] args) {
        Order order = new Order();
        order.addItem(PizzaItem.PEPPERONI.getItem());
        order.addItem(PizzaItem.SAUSAGE.getItem());
        order.addItem(PizzaItem.CHEESE.getItem());
        order.addItem(PizzaItem.THE_WORKS.getItem());
        order.addItem(PizzaItem.STUFFED_CRUST_CHEESE_PIZZA.getItem());
        System.out.println(order.getNumberOfItems());
        System.out.println(order.getItem(0).getName());
        System.out.println(order.getItem(1).getName());
        System.out.println(order.getItem(2).getName());
        System.out.println(order.getItem(3).getName());
        System.out.println(order.getItem(4).getName());
    }
}

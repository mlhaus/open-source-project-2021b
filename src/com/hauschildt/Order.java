package com.hauschildt;

public class Order implements OrderOperations {
    private MenuItem[] items;
    private int numberOfItems;

    public Order() {
        this.items = new MenuItem[10];
        this.numberOfItems = 0;
    }

    @Override
    public int getNumberOfItems() {
        return numberOfItems;
    }

    @Override
    public void addItem(MenuItem item) {
        int i = numberOfItems++;
        items[i] = item;
    }

    @Override
    public MenuItem getItem(int itemIndex) {
        return items[itemIndex];
    }
}

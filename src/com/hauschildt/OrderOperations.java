package com.hauschildt;

public interface OrderOperations {
    int getNumberOfItems();
    void addItem(MenuItem item);
    MenuItem getItem(int itemIndex);
}

package com.hauschildt;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {
    private Pizza pizza;

    @BeforeEach
    void setUp() {
        pizza = new Pizza();
    }

    @Test
    void getName() {
        fail();
    }

    @Test
    void setName() {
        fail();
    }

    @Test
    void getPrice() {
        fail();
    }

    @Test
    void setPrice() {
        fail();
    }

    @Test
    void getDescription() {
        fail();
    }

    @Test
    void setDescription() {
        fail();
    }

    @Test
    void getSize() {
        fail();
    }

    @Test
    void setSize() {
        fail();
    }

    @Test
    void getCrust() {
        fail();
    }

    @Test
    void setCrust() {
        fail();
    }

    @Test
    void getSauce() {
        fail();
    }

    @Test
    void setSauce() {
        fail();
    }

    @Test
    void getMeat() {
        assertEquals(Pizza.DEFAULT_MEAT, pizza.getMeat());
    }

    @Test
    void setMeat() {
        Meat[] expected = Pizza.DEFAULT_MEAT;
        pizza.setMeat(expected);
        Meat[] actual = pizza.getMeat();
        assertEquals(expected, actual);
    }

    @Test
    void getVeggies() {
        fail();
    }

    @Test
    void setVeggies() {
        fail();
    }

    @Test
    void testToString() {
        String expected = "Pizza{" +
                "name='" + MenuItem.DEFAULT_NAME + '\'' +
                ", price=" + MenuItem.DEFAULT_PRICE +
                ", description='" + MenuItem.DEFAULT_DESCRIPTION + '\'' +
                ", size=" + Pizza.DEFAULT_SIZE +
                ", crust=" + Pizza.DEFAULT_CRUST +
                ", sauce=" + Pizza.DEFAULT_SAUCE +
                ", meat=" + Arrays.toString(Pizza.DEFAULT_MEAT) +
                ", veggies=" + Arrays.toString(Pizza.DEFAULT_VEGGIE) +
                '}';
        assertEquals(expected, pizza.toString());
    }
}
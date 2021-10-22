package com.hauschildt;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {
    //instance variable for the pizza object
    private Pizza pizza;

    @BeforeEach
    void setUp() {
        pizza = new Pizza();
    }

    @Test
    void getName() {
        String expected = Pizza.DEFAULT_NAME;
        String actual = pizza.getName();
        assertEquals(expected, actual);

    }

    @Test
    void setName() {
        String expected = Pizza.DEFAULT_NAME;
        pizza.setName(expected);
        String actual = pizza.getName();
        assertTrue(expected.equals(actual));

    }

    @Test
    void getPrice() {
        assertEquals(Pizza.DEFAULT_PRICE, pizza.getPrice());
    }

    @Test
    void setPrice() {
        int newPrice = 0;
        pizza.setPrice(newPrice);
        assertEquals(newPrice, pizza.getPrice());
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
        Size actualSize = pizza.getSize();
        Size expectedSize = Pizza.DEFAULT_SIZE;
        assertEquals(expectedSize, actualSize);
    }

    @Test
    void setSize() {
        Size expected = Pizza.DEFAULT_SIZE;
        pizza.setSize(expected);
        Size actual = pizza.getSize();
        assertEquals(expected, actual);
    }

    @Test
    void getCrust() {
        Crust expected = Pizza.DEFAULT_CRUST;
        assertEquals(expected, pizza.getCrust());
    }

    @Test
    void setCrust() {
        Crust expected = Crust.THIN;
        pizza.setCrust(expected);
        assertEquals(expected, pizza.getCrust());
    }

    @Test
    void getSauce() {
        Sauce expected = Pizza.DEFAULT_SAUCE;
        assertEquals(expected, pizza.getSauce());



    }

    @Test
    void setSauce() {
        Sauce expected = Sauce.BBQ;
        pizza.setSauce(expected);
        assertEquals(expected, pizza.getSauce());

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
        assertEquals(pizza.DEFAULT_VEGGIE, pizza.getVeggies());
    }

    @Test
    void setVeggies() {
        pizza.setVeggies(Pizza.DEFAULT_VEGGIE);

        Veggie[] expectedResult = pizza.DEFAULT_VEGGIE;
        Veggie[] actualResult = pizza.getVeggies();
        assertEquals(expectedResult, actualResult);
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
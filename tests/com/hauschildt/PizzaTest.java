package com.hauschildt;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        assertEquals(Pizza.DEFAULT_DESCRIPTION, pizza.getDescription());
    }

    @Test
      void setDescription() {
        String  expected = "MG";
        pizza.setDescription(expected);
        String actual = pizza.getDescription();
        assertTrue(expected.equals(actual));
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
        fail();
    }

    @Test
    void setMeat() {
        fail();
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
        fail();
    }
}
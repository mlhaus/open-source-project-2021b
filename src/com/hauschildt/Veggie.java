package com.hauschildt;

public enum Veggie {
    TOMATO("Roma tomatos")
    ,GREEN_PEPPER("Green peppers")
    ,MUSHROOM("Mushrooms")
    ,PINEAPPLE("Pineapple")
    ,BLACK_OLIVE("Black olives")
    ,ONION("Yellow onion")
    ,BANANA_PEPPER("Banana peppers")
    ;

    String description;

    Veggie(String description){
        this.description = description;
    }
}


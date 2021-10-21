package com.hauschildt;

public enum Meat {
    PEPPERONI("Pepperoni")
    ,SAUSAGE("Italian sausage")
    ,CANADIAN_BACON("Canadian bacon")
    ,CHICKEN("Grilled chicken")
    ,BACON("Bacon")
    ,HAM("Ham")
    ;

    String description;

    Meat(String description){
        this.description = description;
    }
}


package com.hauschildt;

public enum Crust {
    ORIGINAL("Original Crust")
    ,THIN("Thin Crust")
    ,STUFFED("Stuffed Crust")
    ;

    String description;

    Crust(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return getDescription();
    }
}


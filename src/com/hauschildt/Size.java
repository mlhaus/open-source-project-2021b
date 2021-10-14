package com.hauschildt;

public enum Size {
    SMALL("Small")
    ,MEDIUM("Medium")
    ,LARGE("Large")
    ,EXTRA_LARGE("Extra large")
    ;

    String description;

    Size(String description){
        this.description = description;
    }
}


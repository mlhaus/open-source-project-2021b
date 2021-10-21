package com.hauschildt;

import java.util.Arrays;

public class Pizza extends MenuItem {
    private Size size;
    private Crust crust;
    private Sauce sauce;
    private Meat[] meat;
    private Veggie[] veggies;

    public static final Size DEFAULT_SIZE = Size.LARGE;
    public static final Crust DEFAULT_CRUST = Crust.ORIGINAL;
    public static final Sauce DEFAULT_SAUCE = Sauce.MARINARA;
    public static final Meat[] DEFAULT_MEAT = new Meat[]{};
    public static final Veggie[] DEFAULT_VEGGIE = new Veggie[]{};

    public Pizza() {
        this(MenuItem.DEFAULT_NAME, MenuItem.DEFAULT_PRICE, MenuItem.DEFAULT_DESCRIPTION,
                DEFAULT_SIZE, DEFAULT_CRUST, DEFAULT_SAUCE, DEFAULT_MEAT, DEFAULT_VEGGIE);
    }

    public Pizza(String name, double price, String description, Size size, Crust crust, Sauce sauce, Meat[] meat, Veggie[] veggies) {
        super(name, price, description);
        this.size = size;
        this.crust = crust;
        this.sauce = sauce;
        this.meat = meat;
        this.veggies = veggies;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Crust getCrust() {
        return crust;
    }

    public void setCrust(Crust crust) {
        this.crust = crust;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public Meat[] getMeat() {
        return meat;
    }

    public void setMeat(Meat[] meat) {
        this.meat = meat;
    }

    public Veggie[] getVeggies() {
        return veggies;
    }

    public void setVeggies(Veggie[] veggies) {
        this.veggies = veggies;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + super.getName() + '\'' +
                ", price=" + super.getPrice() +
                ", description='" + super.getDescription() + '\'' +
                ", size=" + size +
                ", crust=" + crust +
                ", sauce=" + sauce +
                ", meat=" + Arrays.toString(meat) +
                ", veggies=" + Arrays.toString(veggies) +
                '}';
    }
}

package com.hauschildt;

public enum PizzaItem {
    PEPPERONI("Pepperoni Pizza", 13.49, "Your choice of crust covered " +
            "with our signature pizza sauce, real mozzarella cheese, and pepperoni. It's one " +
            "of our most popular pizzas.", Size.LARGE, Crust.ORIGINAL, Sauce.MARINARA,
            new Meat[]{Meat.PEPPERONI}, new Veggie[]{})
    ,SAUSAGE("Sausage Pizza", 13.49, "Our signature pizza sauce layered " +
            "with sausage and real mozzarella cheese. Your choice of crust.", Size.LARGE,
            Crust.ORIGINAL, Sauce.MARINARA, new Meat[]{Meat.SAUSAGE}, new Veggie[]{})
    ,CHEESE("Cheese Pizza", 12.99, "Simple, yet delicious. Real mozarella " +
            "cheese on top of our signature pizza sauce with your choice of crust, then baked " +
            "to a golden brown.", Size.LARGE, Crust.ORIGINAL, Sauce.MARINARA,
            new Meat[]{}, new Veggie[]{})
    ,THE_WORKS("The Works Pizza", 18.99, "A heaping helping of pepperoni, " +
            "Canadian bacon, spicy Italian sausage, fresh-cut onions, crisp green peppers, " +
            "mushrooms, ripe black olives, and real mozzarella cheese.", Size.LARGE,
            Crust.ORIGINAL, Sauce.MARINARA, new Meat[]{Meat.PEPPERONI, Meat.CANADIAN_BACON,
            Meat.SAUSAGE}, new Veggie[]{Veggie.ONION, Veggie.GREEN_PEPPER, Veggie.MUSHROOM,
            Veggie.BLACK_OLIVE})
    ,OWNPIZZA("Mujahid  Pizza",
                    14.50,
                    "Your choice of crust covered " +
                            "with our signature pizza sauce, real mozzarella cheese, and pepperoni. It's one " +
                            "of our most popular pizzas.",
                    Size.MEDIUM,
                    Crust.ORIGINAL,
                    Sauce.MARINARA,
                    new Meat[]{Meat.PEPPERONI},
                    new Veggie[]{}
    )
    ,BBQ_CHICKEN("BBQ Chicken Pizza", 18.99, "Our delicious BBQ sauce, " +
            "Chicken, Bacon, and fresh-cut Onions to tie the flavors together.",
            Size.LARGE, Crust.ORIGINAL, Sauce.BBQ,
            new Meat[]{Meat.CHICKEN, Meat.BACON},
            new Veggie[]{Veggie.ONION} )
    ,CHICKEN_ALFREDO("Chicken Alfredo", 19.99, "Creamy alfredo sauce, " +
            "topped with juicy diced chicken breast, smothered in mozzarella cheese.", Size.LARGE,
            Crust.ORIGINAL, Sauce.ALFREDO, new Meat[]{Meat.CHICKEN }, new Veggie[]{Veggie.BLACK_OLIVE,
            Veggie.MUSHROOM})
    , STUFFED_CRUST_CHEESE_PIZZA("Stuffed Crust Pizza", 14.79, "No confusion here. " +
            "Signature cheese pizza with a filled crust cooked to a perfection.", Size.LARGE, Crust.STUFFED,
            Sauce.MARINARA, new Meat[]{}, new Veggie[]{})
    ,ORIGINAL_PAN("Original Pan Pizza", 8.99, "Golden baked crust baked to perfection",
            Size.MEDIUM, Crust.PAN, Sauce.MARINARA, new Meat[]{Meat.HAM, Meat.BACON},
            new Veggie[]{Veggie.ONION})
    ,BUFFALO_CHICKEN("Buffalo Chicken Pizza", 17.99, "Grilled chicken with topped with buffalo sauce",
            Size.LARGE, Crust.ORIGINAL, Sauce.MARINARA, new Meat[]{Meat.CHICKEN},
            new Veggie[]{})
    ;

    private Pizza item;

    PizzaItem(String name, double price, String description, Size size, Crust crust, Sauce sauce, Meat[] meat, Veggie[] veggies){
        item = new Pizza(name, price, description, size, crust, sauce, meat, veggies);
    }

    public Pizza getItem() {
        return item;
    }

    @Override
    public String toString() {
        return item.toString();
    }
}

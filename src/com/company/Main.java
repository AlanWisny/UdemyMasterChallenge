package com.company;

public class Main {

    public static void main(String[] args) {

        Hamburger hb = new Hamburger("basic", "chicken", 3.50, "Brown");
//        double price = hb.itemizeHamburger();
        hb.addHamburgerAddition("tomato", 0.25);
        hb.addHamburgerAddition1("lettuce", 0.50);
        hb.addHamburgerAddition2("cheese", 1);
        System.out.println("Total burger price is " + hb.itemizeHamburger());

        HealthyBurger hhb = new HealthyBurger("Bacon", 5.55);
        hhb.addHamburgerAddition("egg", 1);
        hhb.addhealthyAddition1("lentils", 0.07);
        System.out.println("Total Healthy Burger price is " + hhb.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.itemizeHamburger();

        db.getName();
    }
}

package com.company;

public class DeluxeBurger extends Hamburger{
    public DeluxeBurger() {
        super("Deluxe", "cerdo y pesce", 6.66, "hwite");
        super.addHamburgerAddition("Chips", 2.75);
        super.addHamburgerAddition1("Dranks", 1.12);
    }

    @Override
    public void addHamburgerAddition(String name, double price) {
        System.out.println("Can not add additional items to a deluxe burger.");
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Can not add additional items to a deluxe burger.");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Can not add additional items to a deluxe burger.");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Can not add additional items to a deluxe burger.");
    }

    @Override
    public String getName() {
        return super.getName();
    }
}

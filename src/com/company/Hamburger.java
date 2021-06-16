package com.company;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String additionName;
    private double additionPrice;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public String getName() {
        return name;
    }

    public void addHamburgerAddition(String name, double price) {
        this.additionName = name;
        this.additionPrice = price;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public double itemizeHamburger(){
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger " + " on a " + this.breadRollType + " roll, based of " + this.meat + "price is " + this.price);
        if (this.additionName != null){
            hamburgerPrice += this.additionPrice;
            System.out.println("Added " + this.additionName + " for an extra " + this.additionPrice);
        }
        if (this.addition1Name != null){
            hamburgerPrice += this.addition1Price;
            System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
        }
        if (this.addition2Name != null){
            hamburgerPrice += this.addition2Price;
            System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
        }
        if (this.addition3Name != null){
            hamburgerPrice += this.addition3Price;
            System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);
        }
        return hamburgerPrice;
    }



}

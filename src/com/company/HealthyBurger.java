package com.company;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1;
    private double healthyExtraPrice1;

    private String healthyExtra2;
    private double healthyExtraPrice2;

    public HealthyBurger( String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addhealthyAddition1(String name, double price) {
        this.healthyExtra1 = name;
        this.healthyExtraPrice1 = price;
    }

    public void addhealthyAddition2(String name, double price) {
        this.healthyExtra2 = name;
        this.healthyExtraPrice2 = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if (this.healthyExtra1 != null){
            hamburgerPrice += this.healthyExtraPrice1;
            System.out.println("Added " + this.healthyExtra1 + " for an extra " + this.healthyExtraPrice1);
        }
        if (this.healthyExtra2 != null){
            hamburgerPrice += this.healthyExtraPrice2;
            System.out.println("Added " + this.healthyExtra2 + " for an extra " + this.healthyExtraPrice2);
        }
        return hamburgerPrice;
    }
}

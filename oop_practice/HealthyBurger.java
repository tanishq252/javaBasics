package oop_practice;

public class HealthyBurger extends Hamburger{

    private String healthyExtra1name;
    private double healthyExtra1Price;
    private String healthyExtra2name;
    private double healthyExtra2Price;
    private double p;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthyAddition1(String healthyExtra1name,double healthyExtra1Price){
        p = super.itemizeHamburger();
        p+= healthyExtra1Price;
        System.out.println("Added "+healthyExtra1name+" for an extra "+healthyExtra1Price);
    }
    public void addHealthyAddition2(String healthyExtra2name,double healthyExtra2Price){
        p = super.itemizeHamburger();
        p+= healthyExtra2Price;
        System.out.println("Added "+healthyExtra2name+" for an extra "+healthyExtra2Price);
    }

    @Override
    public double itemizeHamburger() {
        return p;
    }
}

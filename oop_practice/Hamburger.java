package oop_practice;

public class Hamburger {
    private String name;
    private String meat;
    private String breadRollType;
    private double price;
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat,double price,String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
        System.out.println(name+" hamburger on a "+breadRollType+ " roll with "+meat+", price is "+price);
    }

    public void addHamburgerAddition1(String addition1Name,double addition1Price){
        this.price += addition1Price;
        System.out.println("Added "+addition1Name+" for an extra "+addition1Price);
    }
    public void addHamburgerAddition2(String addition2Name,double addition2Price){
        this.price += addition2Price;
        System.out.println("Added "+addition2Name+" for an extra "+addition2Price);

    }
    public void addHamburgerAddition3(String addition3Name,double addition3Price){
        this.price += addition3Price;
        System.out.println("Added "+addition3Name+" for an extra "+addition3Price);

    }
    public void addHamburgerAddition4(String addition4Name,double addition4Price){
        this.price += addition4Price;
        System.out.println("Added "+addition4Name+" for an extra "+addition4Price);

    }

    public double itemizeHamburger(){
        return this.price;
    }

    public static void main(String[] args){
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizeHamburger());

        DeluxeBurger d = new DeluxeBurger();
        d.addHamburgerAddition1("ok",54);
        String f = String.format("%.2f",d.itemizeHamburger());
        System.out.println(f);
    }
}

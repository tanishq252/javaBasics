package Composition;

public class Case {
    private String model;
    private String manufacturer;
    private String poweSupply;
    private Dimensions dimesions;

    public Case(String model, String manufacturer, String poweSupply, Dimensions dimesions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.poweSupply = poweSupply;
        this.dimesions = dimesions;
    }

    public void pressPowerButton(){
        System.out.println("Power Button pressed");
    }
}

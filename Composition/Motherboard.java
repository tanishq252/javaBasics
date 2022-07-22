package Composition;

public class Motherboard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int ramSize;
    private int carSlots;

    public Motherboard(String model, String manufacturer, int ramSlots, int carSlots, int ramSize) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.ramSize = ramSize;
        this.carSlots = carSlots;
    }

    public void loadProgram(String programName){
        System.out.println("Program" + programName + " is now loading...");
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public void setRamSlots(int ramSlots) {
        this.ramSlots = ramSlots;
    }

    public int getCarSlots() {
        return carSlots;
    }

    public void setCarSlots(int carSlots) {
        this.carSlots = carSlots;
    }
}

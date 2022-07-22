package Composition;

public class Monitor {
    private String model;
    private int size;
    private String manufacturer;
    private Resolution nativeResolution;

    public Monitor(String model, int size, String manufacturer, Resolution nativeResolution) {
        this.model = model;
        this.size = size;
        this.manufacturer = manufacturer;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x,int y, String color){
        System.out.println("Drawing Pixel at "+ x+"and"+y+"with "+color+" color");
    }
}

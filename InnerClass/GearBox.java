package InnerClass;

import java.util.ArrayList;

public class GearBox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear =0;
    private boolean clutchIsIn ;

    public GearBox(int maxGears) {
        this.gears = new ArrayList<Gear>();
        this.maxGears = maxGears;
        Gear neutral = new Gear(0,0.0);
        this.gears.add(neutral);

    }

    public double wheelSpeed(int revs){
        if(this.clutchIsIn){
            System.out.println("Clutch chhod");
            return 0.0;
        }
        else {
            return revs*gears.get(currentGear).getRatio();
        }
    }

    public void changeGear(int newGear){
        if((newGear>=0)&&(newGear<=this.gears.size())&&this.clutchIsIn){
//            pressClutch;
            this.currentGear = newGear;
            this.clutchIsIn = false;
            System.out.println("Gear changed to "+newGear);
        }
        else{
            System.out.println("Clutch daba bsdk else gear thik se daal");
            this.clutchIsIn = true;
        }
    }

    public void pressClutch(boolean in){
        this.clutchIsIn = in;
    }

    public void addGear(int number , double ratio){
        if((number>0)&&(number<=maxGears)){
            this.gears.add(new Gear(number,ratio));
        }
    }

    // inner class

    public class Gear{
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double driveSpeed(int revs){
            return revs*(this.ratio);
        }

        public int getGearNumber() {
            return gearNumber;
        }

        public double getRatio() {
            return ratio;
        }
    }


}

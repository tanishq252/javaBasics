package InnerClass;

public class Main {
    public static void main(String[] args){
        GearBox mcLaren = new GearBox(5);

        // for inner class like this we are supposed to initialize new object as below
//        GearBox.Gear first= mcLaren.new Gear(1,12.3);
//        GearBox.Gear second= mcLaren.new Gear(2,15.3);
//        GearBox.Gear third= mcLaren.new Gear(3,17.3);
        mcLaren.addGear(1,5.3);
        mcLaren.addGear(2,10.9);
        mcLaren.addGear(3,20);

        mcLaren.pressClutch(true);

        mcLaren.changeGear(1);
        System.out.println(mcLaren.wheelSpeed(100));
        mcLaren.pressClutch(false);
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(200));
//        System.out.println("Car moving at gear no. "+ first.getGearNumber()+" and moving at speed "+ first.driveSpeed(1000));
//        System.out.println("Car moving at gear no. "+ second.getGearNumber()+" and moving at speed "+ second.driveSpeed(1000));
//        System.out.println("Car moving at gear no. "+ third.getGearNumber()+" and moving at speed "+ third.driveSpeed(1000));

    }
}
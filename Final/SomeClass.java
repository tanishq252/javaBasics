package Final;

public class SomeClass {

    public final int instanceNumber ;
    private static int classCounter = 0;
    private final String name;

    public SomeClass(String name){
        classCounter++;
        this.name = name;
        instanceNumber =  1;
    }
}

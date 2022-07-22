package Static;

public class StaticTest {
    private static int NumInst = 0;
    private String name;

    public StaticTest(String name){
        this.name = name;
        NumInst++;
    }

    public int getNumInst() {
        return NumInst;
    }

    public String getName() {
        return name;
    }
}

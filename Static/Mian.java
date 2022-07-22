package Static;

public class Mian {
    public static void main(String[] args){
        StaticTest first = new StaticTest("1st Instance");
        System.out.println(first.getName()+" is instance number "+first.getNumInst());
        StaticTest sec = new StaticTest("2nd Inf");
        System.out.println(sec.getName()+" is instance number "+sec.getNumInst());
    }
}

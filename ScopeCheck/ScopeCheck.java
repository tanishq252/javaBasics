package ScopeCheck;

public class ScopeCheck {
    public int publicVar = 0;
    private int var1 = 1;

    public ScopeCheck(){
        System.out.println("ScopeCheck created, public = "+publicVar+" var1 = "+ var1);
    }

    public int getVar1(){
        return var1;
    }

    public void timesTwo(){
        int var2 = 2;
        for(int i=0;i<10;i++){
            System.out.println(i+" times two is "+i*var2);
        }
    }

    public class InnerClass{
        public int var3 = 3;
        public InnerClass(){
            System.out.println("Inner Class created , var3 = "+ var3);
        }
        public void timesTwo(){
            for(int i=0;i<10;i++){
                System.out.println(i+" times two is "+i* var3);
            }
        }

    }

}

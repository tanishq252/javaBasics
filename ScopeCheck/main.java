package ScopeCheck;

public class main {

    public static void main(String[] args){
        String privateVar = "private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("scopeInstance privateVar : "+scopeInstance.getVar1());
        System.out.println(privateVar);

        scopeInstance.timesTwo();

        ScopeCheck.InnerClass Inner = scopeInstance.new InnerClass();
//        Inner.timesTwo();
        scopeInstance.new InnerClass().timesTwo();


    }
}

package String;

public class tp {
    public static void main(String[] args){
        String s1="abcd";
        String s2 ="efnzh";
        System.out.println(s2.compareTo(s1));
        System.out.println(s1.substring(0,1).toUpperCase()+s1.substring(1));
        // if s1 is having alphabetical order more than s2 then output positive and vice versa
        //but if equal then we will get 0
    }
}

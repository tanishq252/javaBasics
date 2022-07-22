package String;

import java.util.ArrayList;
import java.util.List;

public class reverse_a_string {
    public static void main(String[] args){
        String s = "madam";
        String s1 = "pooo";
        List<String> list1 = new ArrayList<String>();
        for (int i=0;i<s.length();i++){
            list1.add(s.substring(i,i+1));
        }
        for (int i=0;i<s.length();i++){
            if (list1.get(i).compareTo(list1.get(s.length()-i-1))==0){
                continue;
//                System.out.println(list1.get(i)+" "+ list1.get(s.length()-i-1));
            }
            else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");

    }
}

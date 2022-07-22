package String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class anagrams {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        String s = sc.nextLine().toLowerCase();
        String s1 = sc.nextLine().toLowerCase();
        List<String> l1 = new ArrayList<String>();
        List<String> l2 = new ArrayList<String>();
        if(s1.length()==s.length()){
            for(int i=0;i<s.length();i++){
                l1.add(s.substring(i,i+1));
                l2.add(s1.substring(i,i+1));
            }
            Collections.sort(l1);
            Collections.sort(l2);
            for(int i=0;i<s.length();i++){
                if(l1.get(i).compareTo(l2.get(i))==0){
                    continue;
                }
                else {
                    System.out.println("Not Anagrams");
                    return;
                }

            }
            System.out.println("Anagrams");
        }
        else{
            System.out.println("Not Anagrams");
        }
    }
}

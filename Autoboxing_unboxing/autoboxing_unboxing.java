package Autoboxing_unboxing;

import java.util.ArrayList;

class IntClass{
    private  int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class autoboxing_unboxing {
    public static void main(String[] args){
        String[] strarr = new String[10];
        int[] array = new int[10];

        // String
        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Bruh");

        // Object whose class is created above
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(43));



        // Integer is inbuilt class
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();

        // converting datatype "int" value to "Integer" value is boxing of value
        for (int i=0;i<=10;i++){
            integerArrayList.add(Integer.valueOf(i));
        }

        // converting "Integer" class to "int" datatype is unboxing of value
        for(int i=0;i<=10;i++){
            System.out.println(i+"-->"+ integerArrayList.get(i).intValue());
        }



        // Double
        ArrayList<Double> doubleArrayList = new ArrayList<Double>();

        for (double d =0.0;d<=10.0;d+=0.5){
            doubleArrayList.add(Double.valueOf(d));
        }

        for(int i=0;i<doubleArrayList.size();i++){
            System.out.println(i+"-->"+ doubleArrayList.get(i).doubleValue());
        }

    }

}

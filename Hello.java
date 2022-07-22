//    public is an access modifier we discussed defining the class in the last video - same
//        principle.
//static is a Java keyword that needs an understanding of other concepts, for now, know that
//        we need to have static for java to find our method to run the code we are going to add.
//        void is yet another java keyword used to indicate that the method will not return anything -
//        more on that later.

public class Hello {
    public static void main(String[] args){
        System.out.println("Hello");

//        int n=5,m=10;
//        System.out.println(n+m);

        int num = 10;
        int minnum = Integer.MIN_VALUE;
        int maxnum = Integer.MAX_VALUE;
        System.out.println("Integer min value = " + minnum);
        System.out.println("Integer max value = " + maxnum);
        System.out.println("Busted min value = " + (minnum-1));
//        underflow : less than min number gives max
        System.out.println("Busted max value = " + (maxnum+1));
//        overflow : more than max value number gives min

        byte minbyte = Byte.MIN_VALUE;
        byte maxbyte = Byte.MAX_VALUE;
        System.out.println(minbyte);
        System.out.println(maxbyte);
//        underflow and overflow takes place here aswell

        short minshort = Short.MIN_VALUE;
        short maxshort = Short.MAX_VALUE;
        System.out.println(minshort);
        System.out.println(maxshort);


        long maxlong = Long.MAX_VALUE;
        long minlong  = Long.MAX_VALUE;
        System.out.println(maxlong);
        System.out.println(minlong);

//        for long numbers we are supposed to write L at last

        long BigLongVal = 2_147_483_647_234L;
        System.out.println(BigLongVal);

        long Long = 500L;
        System.out.println(Long);

        float flo = 4.56f;
        float myfloat = (float) 5.67;
        System.out.println(flo);
        System.out.println(myfloat);
//         we have to give "f" at last or we have to do casting else it considers as double
        double d = 4.67;
        System.out.println(d);

        System.out.println(5/3);
        System.out.println(5f/3f);
        System.out.println(5d/3d);
//          we can do the same by initializing variables using data type
        int pounds = 200;
        double kilograms= pounds * 0.45359237;
        System.out.println(kilograms);

        char c = 'g'; // take care single inverted commas
        String mystring = "ghughu";
        System.out.println(c);
        System.out.println(mystring);

        char unicode_c = '\u0067';
        System.out.println(unicode_c);
//        same as char c

        char random = '\u0164';
        System.out.println(random);
//        search codes on net and u can print them as above

        boolean turu = true;
        boolean folse = false;
        System.out.println(turu);
        System.out.println(folse);

        String my_str = "This is a string of td ";
        System.out.println(my_str);
        my_str = my_str + "\u00A9 2021";
        System.out.println(my_str);

        String numstring = "34.56";
        numstring += " is my fav no.";
        System.out.println(numstring);

        int number = 55;
        String num_string = "55";
        System.out.println(num_string+number); // concatenation takes place










    }
}



public class switch_case {
    public static void main(String[] args){
        int a = 4;
        char c= 'A';
        System.out.println(isLeapYear(-2100));
        System.out.println(getDaysInMonth(-2,8100));
//        printNumberInWord(6);
    }
    public static boolean isLeapYear(long y){
        if(y<0 || y>9999){
            return false;
        }
        else {
            return (y%400==0)?true :(y%4==0 && y%100!=0)? true: false;
        }
    }

    public static int getDaysInMonth(int a,long yr){
        boolean is_leap = isLeapYear(yr);
        if (a>12 || a<1 || yr>9999 || yr<1){
            return -1;
        }
        else {
            switch (a){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:{
                    return 31;
//                    break;
                }
                case 2:{
                    return (is_leap==true)?29:28;
//                    break;
                }
                case 4: case 6: case 9: case 11:{
                    return 30;
//                    break;
                }
            }
        }
        return 0;

    }
}

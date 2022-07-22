public class if_then {
    public static void main(String[] args){
        int score = 100;
        boolean isman = false;
        int sc = 10;
        boolean isss_mann = true;

        calculateScore(score,isman);
        calculateScore(sc,isss_mann);

        boolean iscar = true;
        boolean is_it_still_car = iscar ? true: false;
    }

    public static int calculateScore(int s,boolean i) {

        if ((i == false) && (s == 10)) {
            System.out.println("He scored 10 and he is not man");
        } else if (i == false || s > 80) {
            System.out.println("He scored well irrespective of being a man");

        } else {
            return -1;
        }
        return -1;
    }
}

package COllections.theatre;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Theatre {
    private final String theatreName;
    private List<Seat> seats = new ArrayList<Seat>() ;

    public Theatre(String theatreName, int numRows, int seatsPerRows) {
        this.theatreName = theatreName;
        int lastRow  = 'A' + (numRows-1);
        for(char row =  'A'; row<=lastRow; row++){
            for(int i=1;i<=seatsPerRows;i++){
                Seat s = new Seat(row+String.format("%02d", i));
                seats.add(s);
            }
        }
    }

    public void getSeats(){
        for(Seat s:seats){
            System.out.println(s.getSeatnum());
        }
    }

    public String getTheatreName() {
        return theatreName;
    }



    public boolean reserveSeat(String SeatNum){
        Seat requestedSeat = null;
        int seatFind = Collections.binarySearch(seats, requestedSeat, null);
        if(seatFind >=0){
            return seats.get(seatFind).reserve();
        }
        else{
            System.out.println("No seat found ");
            return false;
        }
//        for(Seat s: seats){
//            if(s.getSeatnum().equals(SeatNum)){
//                requestedSeat = s;
//                break;
//            }
//        }

//        if(requestedSeat == null){
//            System.out.println("Seat unavailable");
//            return false;
//        }

//        return requestedSeat.reserve();
    }

    private class Seat{
        private final String seatnum;
        boolean reserved = false;

        public Seat(String seatnum) {
            this.seatnum = seatnum;
        }

        public boolean reserve(){
            if(!reserved){
                reserved = true;
                System.out.println("Reserved" + seatnum);
                return true;
            }
            else{
                return false;
            }

        }

        public String getSeatnum() {
            return seatnum;
        }
    }


    public static void main(String[] args) {
        Theatre t = new Theatre("no", 8, 8);
//        t.getSeats();
        System.out.println('A'+12);
    }

}

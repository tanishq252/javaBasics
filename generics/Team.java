package generics;

import java.util.ArrayList;

public class Team<T extends player>{
    private String name;
    int played = 0;
    int won=0;
    int lost = 0;
    int tied= 0;

    private ArrayList<T> members = new ArrayList<>();
    public Team(String name){
        this.name = name;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " already in the team");
            return true;
        } else {
            members.add(player);
            System.out.println(player.getName() + " is selected in " + this.name);
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public int numPlayers(){
        return this.members.size();
    }

    public void matchResult(Team opponent, int ourScore, int theirScore){
        String message;
        if(ourScore > theirScore){
            won++;
            message = " beat ";
        }else if(ourScore == theirScore){
            tied++;
            message = " drew with ";
        }else{
            lost++;
            message = " lost to ";
        }
        played++;
        if(opponent!=null){
            //this will store the result for opponent as well
            System.out.println(this.name  + message + opponent.name);
            opponent.matchResult(null,ourScore,theirScore);
        }
    }

    public int rating(){
        return (won*2)+tied;
    }

//    @Override
//    public void Comparable(Team<T> team) {
//
//    }
}

package generics;

public class Main {
    public static void main(String[] args){
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer ben = new BaseballPlayer("Ben");
        SoccerPlayer pete = new SoccerPlayer("Pete");

        Team<FootballPlayer> footballTeam = new Team<>("footballTeam");
        footballTeam.addPlayer(joe);
//        footballTeam.addPlayer(ben);
//        footballTeam.addPlayer(pete);
        footballTeam.addPlayer(joe);
        System.out.println(footballTeam.numPlayers());


        Team<BaseballPlayer> BaseballTeam = new Team<>("BaseballTeam");
        BaseballTeam.addPlayer(ben);
        System.out.println();

//        Team MI = new Team("MI");

        Team<SoccerPlayer> soccerTeam = new Team<>("SoccerTeam");
        soccerTeam.addPlayer(pete);
        System.out.println();

        Team<FootballPlayer> footballTeam1 = new Team<>("footballTeam1");
        FootballPlayer pogba = new FootballPlayer("Pogba");
        footballTeam1.addPlayer(pogba);

        FootballPlayer messi = new FootballPlayer("Messi");
        FootballPlayer cris = new FootballPlayer("Cris");

        Team<FootballPlayer> footballTeam2 = new Team<>("footballTeam2");
        Team<FootballPlayer> footballTeam3 = new Team<>("footballTeam3");

        footballTeam.matchResult(footballTeam1, 4, 3);
        footballTeam2.matchResult(footballTeam3,3,5);

        System.out.println("Rating of "+footballTeam.getName()+" : "+footballTeam.rating());
        System.out.println("Rating of "+footballTeam1.getName()+" : "+footballTeam1.rating());
        System.out.println("Rating of "+footballTeam2.getName()+" : "+footballTeam2.rating());
        System.out.println("Rating of "+footballTeam3.getName()+" : "+footballTeam3.rating());





    }
}

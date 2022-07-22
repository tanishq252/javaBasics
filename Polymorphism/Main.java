package Polymorphism;

class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}


class Jaws extends Movie{

    public Jaws() {
        super("Jaws");
    }

    public String plot(){
        return "Shark eats Human";
    }
}


class Holiday extends Movie{
    public Holiday(){
        super("Holiday");
    }

    @Override
    public String plot() {
        return "ARMY IS NEVER OFF DUTY";
    }
}

class MazeRunner extends Movie{
    public MazeRunner(){
        super("MazeRunner");
    }

    @Override
    public String plot() {
        return "Escape a maze";
    }
}

public class Main {
    public static void main(String [] args){
        for (int i=0;i<11;i++){
            Movie movie = randomMovie();
            System.out.println("Movie #"+ i+ " : "+movie.getName()+"\n"
            +"Plot : "+ movie.plot()+"\n\n");
        }

    }

    public static Movie randomMovie(){
        // as the Math.random() generates double value
        // between 0 and 1 we have multiplied with 3 and
        // added one so integer values will be 1,2,3
        int randomNumber =(int) (Math.random()*3)+1;
        System.out.println("Random number generated was : " + randomNumber);
        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new Holiday();
            case 3:
                return new MazeRunner();
            default:
                return null;
        }

    }

}

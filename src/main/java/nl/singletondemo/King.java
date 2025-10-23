package nl.singletondemo;

public class King extends Citizen{
    private static King instance; // <- lazy initialization
    // private static King instance = new King(); <- greedy initialization

    private King(){

    }

    @Override
    public void speak(){
        System.out.println("You all exist to serve me!");
    }

    //Lazy initialization
    public static King getInstance(){
        if (instance == null){
            instance = new King();
        }
        return instance;
    }

    // Greedy initialization
//    public static King getInstance(){
//        return instance;
//    }
}


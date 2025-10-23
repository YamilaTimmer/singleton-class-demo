package nl.singletondemo;

public class Main {
    public static void main(String[] args) {

        Citizen citizen = new Citizen();
        citizen.setAge(27);
        citizen.setFirstName("James");
        System.out.println("Memory location citizen 1: " + citizen);
        System.out.println(citizen.getFirstName() + ", " + citizen.getAge() + " says:");
        citizen.speak();

        Citizen citizen2 = new Citizen();
        citizen2.setAge(34);
        citizen2.setFirstName("Jessie");
        System.out.println("Memory location citizen 2: " + citizen2);
        System.out.println(citizen2.getFirstName() + ", " + citizen2.getAge() + " says:");
        citizen2.speak();

        // King king = new King(); <- Compileert niet!

        King king = King.getInstance();
        king.setAge(58);
        king.setFirstName("Willem-Alexander");
        System.out.println("Memory location king 1: " + king);
        King king2 = King.getInstance();
        System.out.println("Memory location king 2: " + king2);
        System.out.println(king.getFirstName() + ", " + king.getAge() + " says:");
        king.speak();

    }
}
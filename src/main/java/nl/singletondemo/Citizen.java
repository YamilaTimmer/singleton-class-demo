package nl.singletondemo;

public class Citizen {
    private String firstName;
    private int age;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void speak(){
        System.out.println("I am but a humble peasant.");
    }
}

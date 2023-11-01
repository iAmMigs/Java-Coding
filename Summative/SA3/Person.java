package Summative.SA3;

public class Person {
    protected int age;
    protected String name;
    protected String gender;

    public Person(){
        this.age = 0;
        this.name = "";
        this.gender = "";
    }

    public Person(int age, String name, String gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public void displayInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Gender: " + this.gender);
    }
}

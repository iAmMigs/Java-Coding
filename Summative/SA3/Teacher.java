package Summative.SA3;

public class Teacher extends Person{
    protected double salary;

    public Teacher(){
        this.age = 0;
        this.name = "";
        this.gender = "";
    }

    public Teacher(int age, String name, String gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
}

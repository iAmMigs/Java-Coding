package Summative.SA3;

public class Student extends Person {
    protected double grade;

    public Student(){
        this.age = 0;
        this.name = "";
        this.gender = "";
    }

    public Student(int age, String name, String gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
}

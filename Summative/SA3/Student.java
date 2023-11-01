package Summative.SA3;

public class Student extends Person {
    private int studentID;
    protected float grade;

    public Student(int age, String name, String gender, float grade){
        super (age,name,gender);
        this.grade = grade;
    }
}

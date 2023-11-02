package Summative.SA3;

public class Student extends Person {
    private static int studentCount = 1;
    private int studentNo;
    protected float grade;

    public Student(int age, String name, String gender, float grade){
        super (age,name,gender);
        this.grade = grade;
        this.studentNo = studentCount++;
    }

    public int getStudentNo(){
        return this.studentNo;
    }

    public float getGrade(){
        return this.grade;
    }


}

package Java_TX22.Module7.Topic1;

public class Student extends Person{
    public Student(){
        this.idNo = 0;
        this.firstName = "";
        this.lastName = "";
    }

    public Student(int idNo, String firstName, String lastName){
        this.idNo = idNo;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void displayInfo(){
        System.out.println("Student ID: " + this.idNo);
        System.out.println("Student First Name: " + this.firstName);
        System.out.println("Student Last Name: " + this.lastName);
    }
}

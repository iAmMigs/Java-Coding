package Module7.Topic3;

public class Student extends Info{
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
        System.out.println("Student Record Number: " + PersonInterface.recordId);
        System.out.println("Student ID: " + this.idNo);
        System.out.println("Student First Name: " + this.firstName);
        System.out.println("Student Last Name: " + this.lastName);
    }
}

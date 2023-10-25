package Mod7;

public class Student extends Person {
    //to use extends keyword, Person class must not be private
    
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
        System.out.println("First Name: " + this.firstName);
        System.out.println("Last Name: " + this.lastName);
    }

    //Ig displayInfo is not void, it will not override the displayInfo in Person and will not work
}

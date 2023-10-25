package Java_TX22.Module7.Topic3;

public class Employee extends Info{
    public Employee(){
        this.idNo = 0;
        this.firstName = "";
        this.lastName = "";
    }

    public Employee(int idNo, String firstName, String lastName){
        this.idNo = idNo;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void displayInfo(){
        System.out.println("Employee Record Number: " + PersonInterface.recordId);
        System.out.println("Employee ID: " + this.idNo);
        System.out.println("Employee First Name: " + this.firstName);
        System.out.println("Employee Last Name: " + this.lastName);
    }
}

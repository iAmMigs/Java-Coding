package Module7.Topic2;

public class Employee extends Person{
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
        System.out.println("Employee ID: " + this.idNo);
        System.out.println("Employee First Name: " + this.firstName);
        System.out.println("Employee Last Name: " + this.lastName);
    }
}

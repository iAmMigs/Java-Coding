package Mod7;

public class Person {
    protected int idNo;
    protected String firstName;
    protected String lastName;

    public Person(){
        this.idNo = 0;
        this.firstName = "";
        this.lastName = "";
    }

    public Person(int idNo, String firstName, String lastName){
        this.idNo = idNo;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void displayInfo(){
        System.out.println("Person ID: " + this.idNo);
        System.out.println("First Name: " + this.firstName);
        System.out.println("Last Name: " + this.lastName);
    }
}

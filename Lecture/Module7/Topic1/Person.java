package Java_TX22.Module7.Topic1;

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
        System.out.println("Person First Name: " + this.firstName);
        System.out.println("Person Last Name: " + this.lastName);
    }

    // public void foo(); Error, normal class cannot have function without a body
}

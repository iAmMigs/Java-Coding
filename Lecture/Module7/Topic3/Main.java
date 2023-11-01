package Module7.Topic3;

//import Module7.Topic1.Person;

public class Main {
    public static void main(String[] args){
        // Operation op = new Operation();
        // System.out.println(op.add(23.123, 57));
        
        // Both statements are error: abstract class and interfaces cannot be instantiated.
        // Info i = new Info();
        // PersonInterface pi = new PersonInterface();

        //Info p; // Reference object for the Person class
        // This can accept either Student or Employee objects
        //Student stud = new Student(123, "Joseph", "Calleja");
        Employee emp = new Employee(123, "Joseph", "Calleja");

        // p = emp;
        // p.displayInfo();

        printInfo(emp);
    }

    public static void printInfo(Info p){
        p.displayInfo();
    }
}

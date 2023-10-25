package Module7.Topic1;

public class Main {
    public static void main(String[] args){
        // Operation op = new Operation();
        // System.out.println(op.add(23.123, 57));
        
        Person p; // Reference object for the Person class
        // This can accept either Student or Employee objects
        Student stud = new Student(123, "Joseph", "Calleja");
        Employee emp = new Employee(123, "Joseph", "Calleja");

        // p = emp;
        // p.displayInfo();

        printInfo(emp);
    }

    public static void printInfo(Person p){
        p.displayInfo();
    }
}

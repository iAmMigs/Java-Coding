package Mod7;

public class Main {
    public static void main(String[] args){
        //Operation op = new Operation();
        //System.out.println(op.add(21, 41.5));

        Person stud = new Student(123, "Joseph", "Calleja");
        //Student first and Person 2nd is not allowed because Person is not a subclass of Student

        //stud.displayInfo();
        printInfo(stud);
    }

    public static void printInfo(Person p){
        p.displayInfo();
    }
}

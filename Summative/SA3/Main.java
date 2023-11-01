package Summative.SA3;

public class Main {
    public static void main(String[] args){
        Person[] stud= new Person[2];
        stud [1] = new Student(21, "James", "M", 3.00f);
        stud [0] = new Student(15, "Rachel", "F", 2.50f);
        
    }

    public static void printInfo(Person p){
        p.displayInfo();
    }
}

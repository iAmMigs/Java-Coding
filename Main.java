import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Instatiate | Create a student object
        Student stud1 = new Student();

        System.out.print("Enter ID Number: ");
        stud1.id = sc.nextInt();
        sc.nextLine(); //cin.Ignore
        System.out.print("Enter Name: ");
        stud1.setName(sc.nextLine());
        System.out.print("Enter Grade: ");
        stud1.setGrade(sc.nextDouble());

        System.out.println(stud1.displayInfo());
    }
}
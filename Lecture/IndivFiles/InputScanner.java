package IndivFiles;
import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args){
        //Instantiate Scanner class
        Scanner input = new Scanner(System.in);
        
        String name = "";
        int age = 0;

        System.out.print("Enter your name: ");
        name = input.nextLine();
        System.out.print("Enter your age: ");
        age = input.nextInt();
        System.out.printf("Hello %s, you are %d years old\n", name, age);

        input.close(); //not required, but good practice for closing input screen preventing memory leaks..
    }
}

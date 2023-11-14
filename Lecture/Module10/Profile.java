package Module10;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;

public class Profile {
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(System.in);
            BufferedReader fr;
            FileWriter fw;
            
            String id, name, course;
            Integer age; //So output will used in output not unkown class

            System.out.println("Enter your ID: ");
            id = sc.nextLine();
            System.out.println("Enter your Full Name: ");
            name = sc.nextLine();
            System.out.println("Enter your course: ");
            course = sc.nextLine();
            System.out.println("Enter your age: ");
            age = sc.nextInt();

            fw = new FileWriter("Lecture\\Module10\\Outputs\\" + id + ".txt");
            fw.write(id + "\n");
            fw.write(name + "\n");
            fw.write(course + "\n");
            fw.write(age.toString() + "\n");
            fw.close();

            System.out.println();
            System.out.println("Enter ID Number of Student: ");
            id = sc.nextLine();
            fr = new BufferedReader(new FileReader("Lecture\\Module10\\Outputs\\"+ id + ".txt"));
            String chr; 
            int line = 1;

            while((chr = fr.readLine()) != null){
                if(line == 1) System.out.print("ID Number: ");
                else if(line == 2) System.out.println("Full Name:");
                else if(line == 3) System.out.println("Course: ");
                else if(line == 4) System.out.println("Age: ");
                System.out.print(chr);
                line++;
            }

            fr.close();
            sc.close();
        }
        catch(IOException e){
        }
    }
}

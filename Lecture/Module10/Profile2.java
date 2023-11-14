package Module10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Profile2 {
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(System.in);
            BufferedReader fr;
            FileWriter fw;

            String id, name, course;
            Integer age;

            System.out.print("Enter ID Number: ");
            id = sc.nextLine();
            System.out.print("Enter Full Name: ");
            name = sc.nextLine();
            System.out.print("Enter Course: ");
            course = sc.nextLine();
            System.out.print("Enter Age: ");
            age = sc.nextInt();
            sc.nextLine();

            fw = new FileWriter("Module10\\files\\" + id + ".txt");
            fw.write(id + "\n");
            fw.write(name + "\n");
            fw.write(course + "\n");
            fw.write(age.toString() + "\n");
            fw.close();

            System.out.println();
            System.out.print("Enter ID Number of Student: ");
            id = sc.nextLine();
            fr = new BufferedReader(new FileReader("Module10\\files\\" + id + ".txt"));
            int line = 1;
            String chr;
            while((chr = fr.readLine()) != null){
                if(line == 1) System.out.print("ID Number: ");
                else if(line == 2) System.out.print("Full Name: ");
                else if(line == 3) System.out.print("Course: ");
                else if(line == 4) System.out.print("Age: ");
                System.out.println(chr);
                line++;
            }
            fr.close();

            sc.close();
        }
        catch(IOException e){

        }
    }
}

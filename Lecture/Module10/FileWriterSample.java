package Module10;

import java.io.FileWriter;
import java.util.Scanner;

public class FileWriterSample {
    public static void main(String[] args){
        try{
            FileWriter fw = new FileWriter("Module10\\files\\fw.txt");

            Scanner sc = new Scanner(System.in);
            String message;

            System.out.print("Enter you message: ");
            message = sc.nextLine();

            fw.write(message);

            fw.close();
            sc.close();
        }
        catch(Exception e){

        }
    }
}

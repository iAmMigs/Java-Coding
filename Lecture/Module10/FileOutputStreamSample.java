package Module10;

import java.io.FileOutputStream;
import java.util.Scanner;

public class FileOutputStreamSample{
    public static void main(String[] args){
        try{
            FileOutputStream fos = new FileOutputStream("Module10\\files\\test.txt");
            Scanner sc = new Scanner(System.in);
            String message;

            System.out.print("Enter you message: ");
            message = sc.nextLine();

            fos.write(message.getBytes());

            fos.close();
            sc.close();
        }
        catch(Exception e){

        }
    }
}
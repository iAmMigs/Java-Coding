package Module10;
import java.io.FileOutputStream;
import java.util.Scanner;

public class IO {
    public static void main(String[] args){
        //FileoutputStream requires an exception handler
        try{
            FileOutputStream fout = new FileOutputStream("Lecture\\Module10\\Outputs\\test.txt");
            Scanner sc = new Scanner(System.in);
            String message;
            System.out.println("Enter the message: ");
            message = sc.nextLine();

            byte[] b = message.getBytes(); //Convert string to byte
            fout.write(b);
            fout.close();
            System.out.println("Success");
            sc.close();
        }
        catch(Exception e){
            System.out.println(e);
        }

        
    }
}

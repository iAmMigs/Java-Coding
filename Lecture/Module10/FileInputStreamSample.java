package Module10;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamSample {
    public static void main(String[] args){
        try{
            FileInputStream fis = new FileInputStream("Module10\\files\\test.txt");

            int chr;
            while((chr = fis.read()) != -1){
                System.out.print((char)chr);
            }

            fis.close();
        }
        catch(IOException e){

        }
    }
}

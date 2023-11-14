package Module10;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderSample {
    public static void main(String[] args){
        try{
            FileReader fr = new FileReader("Module10\\files\\test.txt");

            int chr;
            while((chr = fr.read()) != -1){
                System.out.print((char)chr);
            }

            fr.close();
        }
        catch(IOException e){

        }
    }
}

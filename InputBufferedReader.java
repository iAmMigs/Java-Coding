// 3 classes should be imported

import java.io.BufferedReader;
//buffered reader uses io not util
import java.io.InputStreamReader;
//input stream reader is used to read input from the console
import java.io.IOException;
//input output exception is used to catch errors

//import java.io.*;  //import all classes from io package

public class InputBufferedReader {
    public static void main(String[] args) throws IOException{ //throws IOException is used to catch errors
        //Instantiate BufferedReader class   
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        String name = "";
        int age = 0;

        System.out.print("Enter your name: ");
        name = input.readLine();
        System.out.print("Enter your age: ");
        age = Integer.parseInt(input.readLine());
        System.out.printf("Hello %s, you are %d years old\n", name, age);

        input.close(); //not required, but good practice for closing input screen preventing memory leaks..
    }
}

package Module8;

import java.util.InputMismatchException;

/*
+ Exception denots an abmorality in the program
+ When an error occurs within a method the method 
+ creates an exception object and hands it off to the runtime system
Throwing - When an exception occurs, the method creates an object and hands it off to the runtime system. The object, called an exception object, contains information about the error, including its type and the state of the program when the error occurred. Creating an exception object and handing it to the runtime system is called throwing an exception.
Call stack - After a method throws an exception, the runtime system attempts to find something to handle it. The search begins with the method in which the error occurred, and proceeds through the call stack in the reverse order in which methods were called.
Exception Handler - The runtime system searches the call stack for a method that contains a block of code that can handle the exception. This block of code is called an exception handler. The search begins with the method in which the error occurred, and proceeds through the call stack in the reverse order in which methods were called.

+ Catching happens when an exception is handled
+ Throwing happens when an exception occurs.
+ Catching and throwing are complementary.

+If the runtime system finds an appropriate exception handler, it passes the exception to the handler. An exception handler is considered appropriate if the type of the exception object thrown matches the type that can be handled by the handler.
+If the runtime system does not find an appropriate exception handler, it terminates the program.

Keywords
+ try
+ catch
+ throw
+ throws
+ finally

*/

import java.util.Scanner;

public class Exception {
    public static void main(String[] args){
        try{
        Scanner sc = new Scanner(System.in);
        double n1 = 0, n2 = 0, quot = 0;
        
        System.out.print("Enter the first number: ");
        n1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        n2 = sc.nextDouble();

        quot = n1/n2;

        System.out.println("The quotient is: " + quot);
        
        assert(quot > 0) : "The quotient is negative";
    }

        catch(InputMismatchException e){
            System.out.println("You have to enter a number");
            System.out.println(e.toString());
        }

        finally{
            System.out.println("This is the finally block");
        }
    }
}

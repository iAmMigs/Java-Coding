package Formatives;

import java.util.Scanner;

public class FA2FlowCtrl {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int close=0;
        
        do{
            double balance = 0;
            double interest = 0;

            System.out.print("Enter account balance: ");
            double balance = input.nextDouble();
            System.out.print("Enter Interest rate % (ex. 21, 5, 16): ");
            double interest = input.nextDouble() / 100;

            

        }while(close != 1);

        input.close();
    }
}

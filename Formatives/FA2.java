package Formatives;
import java.util.Scanner;

public class FA2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Philippine peso amount: ");
        double peso = input.nextDouble();

        System.out.print("The exchange rates are as follows: ");
        System.out.println("1 US Dollar = 43.33089 Philippine Peso");
        System.out.println("1 Euro = 58.97614 Philippine Peso");
        System.out.println("1 Yuan = 6.82706 Philippine Peso");
        System.out.println("1 Koruna = 2.30819 Philippine Peso");
        System.out.println("1 Krone = 7.9507 Philippine Peso");
        System.out.println("1 Sheqel = 11.62829 Philippine Peso");
        System.out.println("1 Dinar = 157.80329 Philippine Peso");


        double dollar = peso / 43.33089;
        double euro = peso / 58.97614;
        double yuan = peso / 6.82706;
        double koruna = peso / 2.30819;
        double krone = peso / 7.9507;
        double sheqel = peso / 11.62829;
        double dinar = peso / 157.80329;
        
        System.out.println("The amounts are as follows: ");
        System.out.println("\nPhilippine peso: " + peso);
        System.out.println("US Dollar: " + dollar);
        System.out.println("Euro: " + euro);
        System.out.println("Yuan: " + yuan);
        System.out.println("Koruna: " + koruna);
        System.out.println("Krone: " + krone);
        System.out.println("Sheqel: " + sheqel);
        System.out.println("Dinar: " + dinar);

        input.close();

    }
}

package inputs;
import java.util.Scanner;

public class Main {
    
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double z;
        System.out.println("Digite um String: ");
        x = sc.next();
        System.out.println("Digite um Inteiro: ");
        y = sc.nextInt();
        System.out.println("Digite um Decimal: ");
        z= sc.nextDouble();

        System.out.println("Você digitou String " + x + " Inteiro " + y + " Decimal "+ z +".");
        



        sc.close();





    }
}

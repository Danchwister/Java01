package IMC;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        
        System.out.println("Iremos fazer um programa que calcula seu IMC.");
        System.out.println("Para isso, digite seu peso: ");

        Scanner sc = new Scanner(System.in);
        
        double peso;
        peso = sc.nextDouble();
        System.out.println("Agora digite sua altura: ");

        double altura;
        altura = sc.nextDouble();

        double imc;
        imc = (double) peso / (altura*altura);
        System.out.println("Seu IMC é: " + imc);

        sc.close();
    }
    
}

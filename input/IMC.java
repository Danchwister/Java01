package input;
import java.util.Scanner;

public class IMC {

    public static void imc (String[] args) {
        
        System.out.println("Iremos fazer um programa que calcula seu IMC.");
        System.out.println("Para isso, digite seu peso: ");

        Scanner sc = new Scanner(System.in);
        
        double peso;
        peso = sc.nextDouble();
        sc.close();

        System.out.println("Agora digite sua altura: ");

        Scanner sx = new Scanner(System.in);
        
        double altura;
        altura = sx.nextDouble();
        sx.close();

        double imc;
        imc = peso / (altura*altura);
        System.out.println("Seu IMC é: " + imc);


    }
    
}

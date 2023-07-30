package repe;

import java.util.Scanner;

public class Uaoi {

public static void main (String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.print("Informe um número: ");
    int x = sc.nextInt();

    int soma = 0 ;

    while (x != 0){
        System.out.print("Informe um número: ");
        x = sc.nextInt();
        soma += x;
    }

    System.out.printf("A soma é %d", soma);


    System.out.println("\nPrograma finalizado. ");
    sc.close();
}


}
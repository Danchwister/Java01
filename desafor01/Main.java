package desafor01;
import java.util.Scanner;

public class Main {
    
    public static void main (String[] args){

        System.out.println("Digite um número entre 1 e 1000: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); 
       
       while (0 > x || x > 1000){
        System.out.println("Entre 1 e 1000");
        x = sc.nextInt(); 
        }
        sc.close();
        int i;
        for (i=1; i<x; i++) {
            if (i % 2 != 0) {
            System.out.println(i);
            }
            }
    }
}

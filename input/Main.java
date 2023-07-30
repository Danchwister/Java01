package input;

import java.util.Scanner;

public class Main {
    
    public static void main (String[] args) {


        System.out.println("Digita seu nome ae: ");
        Scanner sc = new Scanner (System.in);
        String x ;
        x = sc.next();
        System.out.println("Seu nome é " + x);
    
        sc.close();
        }

    public static void num (String[] args ) {


            System.out.println("Digita seu nome ae: ");
            Scanner sx = new Scanner (System.in);
            double y ;
            y = sx.nextDouble();
            System.out.println("Seu nome é " + y);
        
            sx.close();
    

    }
 

}

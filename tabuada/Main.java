package tabuada;
import java.util.Scanner;


public class Main {
    

    public static void name() {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number: ");
         int x = sc.nextInt();
    
        for (int i = 1 ; i < 10 ; i ++) {
            System.out.println(i*x);
        }


    }
  
}

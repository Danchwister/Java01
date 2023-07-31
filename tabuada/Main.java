package tabuada;
import java.util.Scanner;

public class Main {
    
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();


        for (int i=0 ; i<=10; i++){
            int produto = x*i;
                System.out.println(x + " x " + i + " é igual a " + produto);
            }
             sc.close();
        }
    }


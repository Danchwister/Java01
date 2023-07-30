package podrao;
import java.util.Scanner;

public class exifelse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int codigo;
        int quantidade;
        
        System.out.println("Qual o código do lanche? ");
        codigo = sc.nextInt();
        System.out.println("Qual a quantidade deste lanche? ");
        quantidade = sc.nextInt();

        if (codigo == 1) {

            System.out.println("Total: R$ "+ (4*quantidade));
        }
        else if (codigo == 2) {

            System.out.println("Total: R$ "+ (4.5*quantidade));
        }
        else if (codigo == 3){

            System.out.println("Total: R$ "+ (5*quantidade));
        }
        else if (codigo == 4) {

            System.out.println("Total: R$ "+ (2*quantidade));
        }
       else  {

        System.out.println("Total: R$ "+ (1.5*quantidade));

       }
    
        
        sc.close();
    }
    
}

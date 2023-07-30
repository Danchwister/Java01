package posto;

import java.util.Scanner;

public class Fuel {
    public static void main (String[] args){

        System.out.println("Digite o código do combsutivel: ");
        Scanner sc = new Scanner(System.in);
        int combustivel = sc.nextInt();

        while (combustivel > 4 || combustivel < 0){
            System.out.println("Escolha um valor entre 1-4: ");
            combustivel = sc.nextInt();
        }

        if (combustivel == 1){
            System.out.println("Álcool! ");
        } else if (combustivel == 2) {
             System.out.println("Gasolina! ");
        } else if (combustivel == 3) {
             System.out.println("Etanol! ");
         } else {
            System.out.println("OBRIGADO! ");
         }
        sc.close();

    }
}

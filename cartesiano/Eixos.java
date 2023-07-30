package cartesiano;
import java.util.Scanner;

public class Eixos {
    
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o valor do eixo x? ");
        int x = sc.nextInt();
        System.out.println("Qual o valor do eixo y? ");
        int y = sc.nextInt();

      while (x == 0 || y ==0){

        System.out.println("Não pode 0 ");
        System.out.println("Qual o valor do eixo x? ");
        x = sc.nextInt();
        System.out.println("Qual o valor do eixo y? ");
        y = sc.nextInt();
       }
       
        while (x != 0 && y!=0){

            if ( x > 0 && y > 00){
                System.out.println("Eixo 1");
                break;
            } else if (x > 0 && y >0) {
                System.out.println("Eixo 2");
                break;
            } else if (x < 0 && y >0) {
                System.out.println("Eixo 3");
                break;
            } else {
                 System.out.println("Eixo 4");
                 break;
            }
            
        }
        

        sc.close();
    }
}

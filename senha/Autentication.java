package senha;

import java.util.Scanner;

public class Autentication {
    
    public static void main (String[] args){

        System.out.print("Digite a senha: ");
        Scanner sc = new Scanner(System.in);
        int senha = sc.nextInt();

        while (senha != 2002){
            System.out.println("Senha Incorreta! Digite novamente!");
            senha = sc.nextInt();
        }

        System.out.println("Bem-vindo! ");
        sc.close();
    }
}

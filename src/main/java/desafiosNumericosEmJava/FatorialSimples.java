package desafiosNumericosEmJava;

import java.util.Scanner;

public class FatorialSimples {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        int cont = n;
        int fatorial = n;
        if(n == 0){
            System.out.println("1");
        }else {for (int i = 1; i < n ; i++) {
                     fatorial *= (cont - 1);
                     cont--;
                   }
            System.out.println(fatorial);
            }
    }
}


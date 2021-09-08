package primeirosPassosEmJava;

import java.util.Scanner;

public class ParesEntreCincoNumeros {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int numeros = 0,  cont = 0;
        for (int i = 0; i < 5; i++) {
            numeros = leitor.nextInt();
            if(numeros %2 == 0){cont++;}
        }
        System.out.println(cont + " valores pares");

        leitor.close();
    }
}

package desafiosNumericosEmJava;

import java.util.Scanner;

public class SeisNumerosImpares {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        int cont = 0;
        while (cont <6){
            if(n%2 != 0){
                System.out.println(n);
                n++;
                cont++;
            } else n++;
        }
    }
}

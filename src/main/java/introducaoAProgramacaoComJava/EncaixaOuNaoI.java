package introducaoAProgramacaoComJava;

import java.util.Scanner;

public class EncaixaOuNaoI {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        for (int i = 0; i < n; i++) {
            String n1 = String.valueOf(leitor.nextInt());
            String n2 = String.valueOf(leitor.nextInt());
            if(n1.endsWith(n2)) {
                System.out.println("encaixa");
            }else System.out.println("nao encaixa");
        }

    }
}

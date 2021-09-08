package introducaoAProgramacaoComJava;

import java.util.Scanner;

public class Multiplos {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a <= b) {
            for (int i = 0; i <= b; i++) {
                if (a * i == b) {
                    System.out.println("Sao Multiplos");
                    break;
                } else if(i==b){
                    System.out.println("Nao sao Multiplos");
                }
            }

        } else {
            for (int i = 0; i <= a; i++) {
                if (b * i == a) {
                    System.out.println("Sao Multiplos");
                    break;
                }else if(i==a){
                    System.out.println("Nao sao Multiplos");}
            }
                   }

    }
}

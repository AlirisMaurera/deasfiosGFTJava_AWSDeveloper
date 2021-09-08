package introducaoAProgramacaoComJava;

import java.util.Scanner;

public class TempoDeJogo {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int inicio = leitor.nextInt();
        int fin = leitor.nextInt();
        int horas = 0;
        if (inicio >= 0 && inicio <= 12) {
            if (fin >= 0 && fin <= 12) {
                if (inicio < fin) {
                    horas = fin - inicio;
                } else horas = 24 - inicio + fin;
            } else horas = fin - inicio;
        }else horas = 24 - inicio + fin;

        horas = Math.abs(horas);
        if(horas == 0 ){
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }else {
            System.out.println("O JOGO DUROU " + horas + " HORA(S)");
        }
    }
}



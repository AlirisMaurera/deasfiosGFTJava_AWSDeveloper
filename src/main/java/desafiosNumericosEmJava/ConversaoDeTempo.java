package desafiosNumericosEmJava;

import java.util.Scanner;

public class ConversaoDeTempo {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int segundos = leitor.nextInt();
        int horas, minutos, sec, segundosRest;
        if(segundos%3600 == 0) {
            horas = segundos / 3600;
            minutos = 0;
            sec = 0;
        } else {
            horas = segundos / 3600;
            segundosRest = (segundos - (horas*3600));
            minutos =  segundosRest/ 60;
            sec = segundosRest - (minutos * 60);
        }
        System.out.println(horas+":"+minutos+ ":"+sec);
        leitor.close();
    }

}

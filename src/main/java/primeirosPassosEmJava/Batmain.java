package primeirosPassosEmJava;

import java.util.Scanner;

public class Batmain {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int t = leitor.nextInt();

        int cont = 0;
        while(cont<t){
            String vilao = leitor.nextLine();
            System.out.println("Y");
            cont++;
        }
        leitor.close();
    }
}

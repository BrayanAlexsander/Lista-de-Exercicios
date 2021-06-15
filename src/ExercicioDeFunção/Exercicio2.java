package ExercicioDeFunção;

import java.util.Scanner;

public class Exercicio2 {

    static void repetição(int numrepeation) {
        for(int i = 0;i <numrepeation;i++) {
            for(int j = 0;j < (i+1); j++) {
                System.out.println((j+1) + "");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero de repetições");
        int numrepeat = entrada.nextInt();
        repetição(numrepeat);
    }
}

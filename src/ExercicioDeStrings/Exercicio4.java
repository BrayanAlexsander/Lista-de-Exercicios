package ExercicioDeStrings;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = entrada.nextLine();

        String[] palavrasplit = nome.split("");

        for(int i = 0; i <palavrasplit.length;i++) {
            for(int j = 0; j < (i+1);j++) {
                System.out.print(palavrasplit[j]);
            }
            System.out.println();
        }
    }
}

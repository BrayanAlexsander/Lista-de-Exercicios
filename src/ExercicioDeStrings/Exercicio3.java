package ExercicioDeStrings;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu Nome");
        String nome = entrada.nextLine();

        String[] palavraSplit = nome.toUpperCase().split("");

        for(String nome2 : palavraSplit) {
            System.out.println(nome2);
        }
    }
}

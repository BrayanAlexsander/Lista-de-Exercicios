package ExercicioDeStrings;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma frase");
        String frase = entrada.nextLine();

        frase.replaceAll("[.]","");

        StringBuilder fraseReversaB = new StringBuilder();
        fraseReversaB.append(frase).reverse();
        fraseReversaB.reverse();
        String fraseReversa = String.valueOf(fraseReversaB);

        System.out.println(frase);
        System.out.println(fraseReversaB);

        if(frase.length() == fraseReversa.length()) {
            System.out.println("Palavra");
        }else {
            System.out.println(frase);
        }

        if(frase.equals(fraseReversa)) {
            System.out.println("A Palavra é palíndromo");
        }else {
            System.out.println("A palavra não é palíndromo");
        }
    }
}

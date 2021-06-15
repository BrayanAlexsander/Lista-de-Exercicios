package ExercicioDeStrings;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a primeira palavra");
        String palavra1;
        palavra1 = entrada.next();
        System.out.println("Informe a segunda palavra");
        String palavra2;
        palavra2 = entrada.next();
        int tamanhoString = 0;
        int tamanhoString2 = 0;

        if(palavra1.length() == palavra2.length()) {
            System.out.println("As duas palavras tem a mesma quantidade de caracteres");
        }
        if(palavra1.length() != palavra2.length()) {
            System.out.println("As duas palavras não tem a mesma quantidade de caracteres");
        }

        System.out.println("Tamanho de " +palavra1+ " é igual a " +palavra1.length()+ " caracteres");
        System.out.println("Tamanho de " + palavra2 + " é igual a " +palavra2.length()+ " caracteres");
    }

}

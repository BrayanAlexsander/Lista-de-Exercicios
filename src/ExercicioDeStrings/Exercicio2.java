package ExercicioDeStrings;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe seu nome (Pode ser maiuscula ou minuscula)");
        String nome = entrada.nextLine();


        System.out.println(new StringBuilder(nome.toUpperCase()).reverse());
    }
}

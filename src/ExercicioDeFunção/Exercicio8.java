package ExercicioDeFunção;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro");
        String numeroInt = String.valueOf(myScanner.nextInt());
        String[] quantidadeDeDigitos = numeroInt.split("");
        System.out.println("Quantidade de digitos do numedo informado: " + quantidadeDeDigitos.length);
    }
}
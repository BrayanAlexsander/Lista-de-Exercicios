package ExercicioDeFunção;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro");
        String numeroInt = String.valueOf(myScanner.nextInt());
        String[] digitosSeparados = numeroInt.split("");
        for (int i = (digitosSeparados.length-1); i>=0; i--){
            System.out.print(digitosSeparados[i]);
        }
    }
}
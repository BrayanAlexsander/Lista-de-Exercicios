package ExercicioDeFunção;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        System.out.println("Digite um numero");
        Scanner entrada = new Scanner(System.in);
        float numero = entrada.nextFloat();
        NumPositiveAndNegative(numero);
    }

    private static void NumPositiveAndNegative(float numeroInformado) {
        if(numeroInformado > 0){
            System.out.println("O Numero é positivo");
        }else if (numeroInformado < 0){
            System.out.println("O Numero é Negativo");
        }else {
            System.out.println("Numero = 0");
        }
    }
}

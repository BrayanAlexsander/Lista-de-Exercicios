package ExercicioDeFunção;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        float num1 = entrada.nextInt();

        System.out.println("Digite o segundo numero");
        float num2 = entrada.nextInt();

        System.out.println("Digite o terceiro numero");
        float num3 = entrada.nextInt();

        System.out.println(soma(num1, num2,num3));
    }

    static float soma(float num1,float num2,float num3) {

        return(num1 + num2+ num3);
    }
}

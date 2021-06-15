package ExercicioDeFunção;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        System.out.println("Jogo Craps");
        System.out.println("Aperta L para lançar os dados");
        Scanner entrada = new Scanner(System.in);
        String LançarDados = entrada.next();
        System.out.println("--Dados Lançados--");
        int resultDados;

        resultDados = (int) (Math.random()*(12-1))+2;
        System.out.println(resultDados);

        if(resultDados == 7 || resultDados == 11) {
            System.out.println("Natural,Parabens você ganhou");
        }else if (resultDados == 2 || resultDados == 3 || resultDados == 12) {
            System.out.println("Craps, você perdeu");
        }else {
            int primeiraRodada = resultDados;
            System.out.println("Ponto");
            while (!(resultDados == 7)) {
                System.out.println("Deseja lançar os dados novamente");
                String lançarDados = entrada.next();
                resultDados = (int) (Math.random()*(12 - 1)) + 2;
                System.out.println(resultDados);
                if (resultDados == 7 ) {
                    System.out.println("Você perdeu");
                }else if (resultDados == primeiraRodada) {
                    System.out.println("Você ganhou,Parabens");
                    break;
                }
                System.out.println("Ainda tem chance");
            }
        }
    }
}
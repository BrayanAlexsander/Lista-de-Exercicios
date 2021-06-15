package ExercicioDeFunção;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int prestacoesDoDia = 0;
        float[][] arrayFinal = new float[3][10];
        float[] receberArray;
        boolean finalizarDiaB = false;

        System.out.println("Bem vindo a interface de \"Prestação de conta\"");
        do {
            if (prestacoesDoDia<10) {
                receberArray = Prestacao(prestacoesDoDia);
                for (int i = 0; i < receberArray.length; i++) {
                    arrayFinal[i][prestacoesDoDia] = receberArray[i];
                }
            }else{
                System.err.println("Numero prestaçoes diaria exedida");
            }
            prestacoesDoDia++;

            finalizarDiaB = finalizarDia();
        }while (!finalizarDiaB);

        mostrarPrestacoes(arrayFinal);

    }

    public static float[] Prestacao(int numeroDaPrestacao) {
        float[] prestacoes = new float[3];
        Scanner myScaner = new Scanner(System.in);
        System.out.println("Qual o valor da prestação de conta?");
        float valorPrestacao = myScaner.nextFloat();
        System.out.println("Esta prestação esta em atraso? ('S'-Sim, 'N'-Não)");
        char prestacaoEmAtraso = myScaner.next().charAt(0);
        int diasEmAtraso = 0;
        if (prestacaoEmAtraso == 's') {
            System.out.println("Quantos dias em atraso?");
            diasEmAtraso = myScaner.nextInt();
        } else {
            diasEmAtraso = 0;
        }
        prestacoes[0] = valorPrestacao;
        prestacoes[1] = diasEmAtraso;
        prestacoes[2] = (float) (valorPrestacao + (valorPrestacao * (0.01 * diasEmAtraso)));

        return prestacoes;

    }

    public static boolean finalizarDia(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("'F' - Finalizar o dia\n'A' - Adicionar outra prestação");
        char finalizarDia = myScanner.next().charAt(0);
        if (finalizarDia == 'f') {
            return true;
        } else {
            return false;
        }
    }

    public static float[][] mostrarPrestacoes(float[][] tabelaFinal){
        System.out.println("Fim do dia, segue todas as Prestação de conta\n| Valor da Prestação | Dias em atraso | Valor + juros |");
        for (int i=0; i<10; i++){
            System.out.print("| ");
            for (int j=0; j<3; j++) {
                System.out.print(tabelaFinal[j][i] + " | ");
            }
            System.out.println();
        }
        return null;
    }
}
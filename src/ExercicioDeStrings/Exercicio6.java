package ExercicioDeStrings;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        System.out.println("Digite a hora");
        Scanner scanner = new Scanner(System.in);
        float hora = 0;
        String horasDigitada = scanner.next();
        String horasDigitadasArreyo[] = horasDigitada.split(":");
        int[] horasDigitadasArreyoInt = new int[horasDigitadasArreyo.length];

        for (int i = 0; i < horasDigitadasArreyoInt.length; i++) {
            horasDigitadasArreyoInt[i] = Integer.parseInt(horasDigitadasArreyo[i]);
        }
        for (int resultado : horasDigitadasArreyoInt) {
            System.out.println(resultado);
        }
        float ConversãoAmParaPM = 0;
    }
}

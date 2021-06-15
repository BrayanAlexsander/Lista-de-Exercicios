package ExercicioDeStrings;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma frase");
        String frase = entrada.next();
        String[] frasesplit = frase.split("");

        int vogais = 0;
        int emBranco = 0;

        String[] letrasVogais = {"a","e","i","o","u"};
        for (int i = 0;i < frasesplit.length;i++) {
            if(frasesplit[i].equalsIgnoreCase("")) {
                emBranco++;
            }
            for(int j=0;i < letrasVogais.length;j++) {
                if(frasesplit[i].equalsIgnoreCase(letrasVogais[j])) {
                    vogais++;
                }
            }
        }
        System.out.printf("Espaços em Branco existentes na frase : %d%n", emBranco);
        System.out.printf("vogais existente na frase: %d", vogais);
    }
}
package ExercicioDeStrings;

import java.util.Scanner;

public class Exercicio9 {


    public static void main(String[]args) {
    Scanner entrada = new Scanner(System.in);
    String cpfDigitado;
    do {
        System.out.println("Digite seu CPF (ex: 000.000.000-00 )");
        cpfDigitado = entrada.nextLine();
        if(formatacãoDeCpfVerficacão(cpfDigitado)) {
            System.out.println("Formatacao de CPF valida\n");
            break;
        }else {
            System.out.println("Formatacao do CPF esta incorreta\n");
        }
    }while (!formatacãoDeCpfVerficacão(cpfDigitado));

    if(formatacãoDeCpfVerficacão(cpfDigitado)
        && primeiroDigitoVerificacão(cpfDigitado)
        && segundoDigitadoVerificão(cpfDigitado)) {
        System.out.println("CPF Valido");
    }else {
        System.out.println("CPF Invalido");
    }
    }

    public static Boolean formatacãoDeCpfVerficacão(String cpfDigitado) {
        String[] cpfSplit = cpfDigitado.split("");
        if(cpfSplit[3].equals(".") && cpfSplit[7].equals(".") && cpfSplit[11].equals("-")) {
            return true;
        }else {
            return false;
        }
    }

    public static Boolean primeiroDigitoVerificacão (String cpfDigitado) {
        String[] cpfSplit = cpfDigitado.split("");

        String[] ultimo2Numeros = cpfDigitado.split("-");

        String[] cpfFormatacãoSplit = (ultimo2Numeros[0].replaceAll("[.]","")).split("");

        int validacãoCpf = 10;
        int validacão1digito = 0;

        for(int i = 0; i < cpfFormatacãoSplit.length;i++) {
            validacão1digito += Integer.parseInt(cpfFormatacãoSplit[i]) * validacãoCpf;
            validacãoCpf--;
        }
        System.out.println(validacão1digito);
        System.out.println((validacão1digito * 10) % 11);
        System.out.println(cpfSplit[12]);

        if((validacão1digito * 10) % 11 == Integer.parseInt(cpfSplit[12])) {
                System.out.println((validacão1digito * 10) % 11);
                System.out.println(Integer.parseInt(cpfSplit[12]));
                return true;
        }
        return false;
    }

    public static Boolean segundoDigitadoVerificão(String cpfDigitado) {
        String cpfSoNumero = cpfDigitado.replaceAll("[.-]","");
        String[] cpfSNSplit = cpfSoNumero.split("");

        int[] cpfDsSplit =  new int[cpfSNSplit.length];
        for (int i = 0; i < cpfSNSplit.length; i++) {
            cpfDsSplit[i] = Integer.parseInt(cpfSNSplit[i]);
        }

        int validacaoCpf = 11;
        int validacao2Digito = 0;

        for (int i = 0; i < cpfDsSplit.length;i++) {
            System.out.println(cpfDsSplit[i]);
            validacao2Digito += cpfDsSplit[i] * validacaoCpf;
            validacaoCpf--;
            System.out.println("|" + cpfDsSplit);
        }
        System.out.println((validacao2Digito * 10) % 11);
        System.out.println(cpfDsSplit[13]);

        if ((validacao2Digito * 10) % 11 == cpfDsSplit[11]) {
            System.out.println((validacao2Digito * 10) % 11);
            System.out.println(cpfDsSplit[12]);
            return true;
        }
        return false;
    }
}

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PrimeiraLista {
    public PrimeiraLista() {
    }

    public static void main(String[] args) {
        System.out.println("Digite o numero do exemplo a ser executado");
        Scanner entrada = new Scanner(System.in);
        int exemplo = entrada.nextInt();
        float quadrado;
        Double horasTrabalhadas;
        Double valorHora;
        double Metro;
        int numero1;
        double PI;
        switch(exemplo) {
            case 1:
                System.out.println("Alo Mundo");
                break;
            case 2:
                System.out.println("Informe o numero");
                numero1 = entrada.nextInt();
                System.out.println("O numero informado foi " + numero1);
                break;
            case 3:
                System.out.println("Informe o Numero1 e o Numero2 ");
                numero1 = entrada.nextInt();
                int numero2 = entrada.nextInt();
                int soma = numero1 + numero2;
                System.out.println(soma);
                break;
            case 4:
                System.out.println("Digite a nota 1");
                Metro = entrada.nextDouble();
                System.out.println("Digite a nota 2");
                PI = entrada.nextDouble();
                System.out.println("Digite a nota 3");
                double nota3 = entrada.nextDouble();
                System.out.println("Digite a nota 4");
                double nota4 = entrada.nextDouble();
                double media = (Metro + PI + nota3 + nota4) / 4.0D;
                System.out.println("A media do aluno é : " + media);
                break;
            case 5:
                System.out.println("Insira a quantidade de metros");
                Metro = entrada.nextDouble();
                PI = Metro * 100.0D;
                System.out.println("Centimetro " + PI);
                break;
            case 6:
                PI = 3.1416D;
                System.out.println("Informe o raio do circulo");
                valorHora = entrada.nextDouble();
                horasTrabalhadas = 3.1416D * valorHora * valorHora;
                System.out.println("O valor da area é " + horasTrabalhadas);
                System.out.println(horasTrabalhadas);
                break;
            case 7:
                quadrado = 0.0F;
                float base = 0.0F;
                float altura = 0.0F;
                String Valor = "";
                BufferedReader q = new BufferedReader(new InputStreamReader(System.in));

                try {
                    System.out.println("Entre com a base :> ");
                    String valor = q.readLine();
                    base = Float.parseFloat(valor);
                    System.out.println("Entre com a altura :> ");
                    valor = q.readLine();
                    altura = Float.parseFloat(valor);
                    quadrado = base * altura / 2.0F;
                    System.out.println("A nossa area quadrado é :> " + quadrado);
                    quadrado = base * altura / 2.0F * 2.0F;
                    System.out.println("O dobro da area é :> " + quadrado);
                } catch (Exception var13) {
                    System.out.println("Error !!!! Por Favor entre somente com Numeros  ........");
                }
                break;
            case 8:
                System.out.println("Informe o valor que você ganha a hora");
                valorHora = entrada.nextDouble();
                System.out.println("Informe as horas trabalhadas no mês");
                horasTrabalhadas = entrada.nextDouble();
                Double valormês = valorHora * horasTrabalhadas;
                System.out.println("O valor do seu salário referido mês é " + valormês);
                break;
            case 9:
                System.out.println("Informe a temperatura em Fahrenheit");
                quadrado = entrada.nextFloat();
                System.out.println("Informe a temperatura em Celsius: " + (quadrado - 32.0F) * 5.0F / 9.0F);
                break;
            case 10:
                System.out.println("Informe a temperatura em Celsius:");
                quadrado = entrada.nextFloat();
                System.out.println("Informe a temperatura em fahrennheit: " + (9.0F * quadrado + 160.0F) / 5.0F);
        }
    }
}



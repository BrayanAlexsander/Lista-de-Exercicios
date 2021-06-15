package ExercicioDeFunção;

import java.util.Scanner;

public class Exercicio5 {


    static float somaimposto(float valorProduto, float taxaDoImposto) {
        float valorImposto = valorProduto * (taxaDoImposto /100);
        return valorImposto;
    }
    public static void main(String[] args) {
        System.out.println("Digite a valor do produto");
        Scanner entrada = new Scanner(System.in);
        float valorProduto = entrada.nextFloat();
        System.out.println("Digite a taxa do Imposto");
        float taxaDoImposto = entrada.nextFloat();
        float valorImposto = somaimposto(valorProduto, taxaDoImposto);

        System.out.println(valorFinal(valorProduto,valorImposto));
    }
    static float valorFinal(float valorProduto,float valorImposto) {
        float valorProdutoMaisImposto = valorProduto + valorImposto;
        return valorProdutoMaisImposto;
    }
}

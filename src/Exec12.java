import java.util.Scanner;

public class Exec12 {
    public static void main(String[] args) {
        /* O custo de um carro novo ao consumidor é a soma do custo de fábrica mais o percentual do distribuidor e dos impostos aplicados (primeiro os impostos são aplicados sobre o custo de fábrica, e depois o percentual do distribuidor sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos 45%, escreva um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do mesmo; */

        //Variaveis
        float percentualDistribuidor = 0.28f; /*Vale lembrar que 0.28 é igual a 28%*/
        float impostosAplicados = 0.45f;
        float valorCarro, custoFabrica, somaImpostos = 0.0f;
        //Scanner
        Scanner scan = new Scanner(System.in);
        //Código
        System.out.println("Informe o valor do carro fabricado: ");
            custoFabrica = scan.nextFloat();
        somaImpostos = (custoFabrica + (custoFabrica * impostosAplicados));
        somaImpostos += (somaImpostos * percentualDistribuidor);

        System.out.println("Valor do carro fabricado: " + custoFabrica);
        valorCarro = somaImpostos;
        System.out.println("Adicionado impostos, o valor do carro ficou de: " + valorCarro);

    }
}

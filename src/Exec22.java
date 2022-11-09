import java.util.Scanner;

public class Exec22 {
    public static void main (String[] args) {
        /* Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos. Mostre como resultado se houve lucro, prejuízo ou empate para cada produto. Informe o valor de custo de cada produto, o valor de venda de cada produto, a média de preço de custo e do preço de venda; */
        //Variaveis
        float precoCusto = 0.0f, precoVenda = 0.0f, resultadoVenda = 0.0f, mediaCusto = 0.0f, mediaVenda = 0.0f;
        int qtdProdFor = 0, qtdL = 0, qtdE = 0, qtdP = 0;
        //Scan
        Scanner scan = new Scanner(System.in);
        //Codigo
        System.out.println("Bem vindo ao Mercado");
        System.out.println("Quantos produtos você deseja vender? ");
            qtdProdFor = scan.nextInt();
        
        if(qtdProdFor > 0){
            for(int i = 1; i <= qtdProdFor; i++){
                System.out.println("Informe o valor de custo do produto: ");
                    precoCusto = scan.nextFloat();
                System.out.println("Informe o valor de venda do produto: ");
                    precoVenda = scan.nextFloat();

                resultadoVenda = (precoVenda - precoCusto);

                if(precoVenda > precoCusto){
                    System.out.println("Você obteve lucro de R$" + resultadoVenda + " seu produto custava R$ " + precoCusto + " você vendeu por R$ " + precoVenda);
                    qtdL++;
                }else if(precoVenda < precoCusto){
                    System.out.println("Você obteve prejuizo de R$" + resultadoVenda + " seu produto custava R$ " + precoCusto + " você vendeu por R$ " + precoVenda);
                    qtdP++;
                }else{
                    System.out.println("Você obteve empate de R$" + resultadoVenda + " seu produto custava R$ " + precoCusto + " você vendeu por R$ " + precoVenda);
                    qtdE++;
                }

                mediaCusto = (precoCusto / qtdProdFor);
                mediaVenda = (precoVenda / qtdProdFor);
            }
            
        }else{
            System.out.println("Obrigado e volte sempre");
        }
        System.out.println("-------------------------------------------------------");
        System.out.println("Você vendeu " + qtdProdFor + " produtos e sua média de custos foi de R$ " + mediaCusto + " e sua média de vendas foi de R$ " + mediaVenda);
        System.out.println("Você vendeu: " + qtdProdFor + "\nQtd de lucros: " + qtdL + "\nQtd de prejuizos: " + qtdP + "\nQtd de empates: " + qtdE);
        System.out.println("-------------------------------------------------------");
    }
}

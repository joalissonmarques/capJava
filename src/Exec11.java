import java.util.Scanner;

public class Exec11 {
    public static void main(String[] args){
        /* Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário; */
        
        //Variaveis
        float precoProduto, valorVenda, acrescimo = 0.0f;
        String nomeProduto;
        //Scanner
        Scanner scan = new Scanner(System.in);
        //Código
        System.out.println("Vendas de produtos");

            System.out.println("--------------------------------------");
            System.out.println("Nome do Produto: ");
                nomeProduto = scan.nextLine();
            System.out.println("Informe o valor do produto: ");
                precoProduto = scan.nextFloat();
            System.out.println("Qual será o acrescimo de lucro: ");
                acrescimo = scan.nextFloat();
            
            valorVenda = (precoProduto + (precoProduto * (acrescimo / 100)));
            
            System.out.println("Valor de venda: " + valorVenda);
            System.out.println("--------------------------------------");
            
            System.out.println("Produto: " + nomeProduto);
            System.out.println("Preço de: " + precoProduto);
            System.out.println("Vendido por: " + valorVenda);
            System.out.println("Terá um lucro de: " + acrescimo + "%");
    }
}

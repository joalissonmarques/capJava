import java.util.Scanner;

public class Exec08 {
    public static void main(String[] args) throws Exception {
        /* Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também a quantidade de dólares disponíveis com o usuário; */

        //Variaveis
        float cotacao, dollarDisponivel, conversao = 0.0f;
        //Scanner
        Scanner scan = new Scanner(System.in);
        //Codigo
        System.out.println("Informe a cotação atual do dollar: ");
            cotacao = scan.nextFloat();
        
        System.out.println("Informe a quantidade de Dólares disponiveis: ");
            dollarDisponivel = scan.nextFloat();

        conversao = (cotacao * dollarDisponivel);

        System.out.println("Cotação atual $: " + cotacao + "\nSaldo atual $: " + dollarDisponivel + "\nConvertendo $ para R$: " + conversao);
/*         System.out.println("Saldo atual $: " + dollarDisponivel);
        System.out.println("Convertendo $ para R$: " + conversao); */
    }
}

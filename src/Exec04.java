import java.util.Scanner;

public class Exec04 {
    public static void main(String[] args) throws Exception {
        /* Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu nome, o salário fixo e salário no final do mês; */

        //variaveis
        String nomeVendedor;
        float salarioFixo, comissao, totalVendas = 0.0f;

        //scanner
        Scanner scan = new Scanner(System.in);

        System.out.println("Painel vendedor");

        System.out.println("Informe seu nome?");
            nomeVendedor = scan.next();

        System.out.println("Informe seu salario atual: ");
            salarioFixo = scan.nextFloat();
        
        System.out.println("Informe o total de vendas efetuadas esse mês: ");
            totalVendas = scan.nextFloat();

        System.out.println("Calculando....");
        System.out.println("Informamos que o vendedor ganha 15% de comissão sobre suas vendas");

        System.out.println("Sr(a): " + nomeVendedor);
        System.out.println("Salario: " + salarioFixo);
        System.out.println("Total de vendas do mês: "+totalVendas);
        System.out.println("*--------------------*");

        //calculo da comissão
        comissao = ((totalVendas * 0.15f) + salarioFixo);
        System.out.println("Seu bonus é de: "+comissao);
        
    }   
}

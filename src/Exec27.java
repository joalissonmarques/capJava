import java.util.Scanner;

public class Exec27 {
    public static void main (String[] args) {
        /* A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. Faça um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. O desconto deverá ser calculado sobre o valor do veículo de acordo com o combustível (álcool – 25%, gasolina – 21% ou diesel –14%). Com valor do veículo zero encerra entrada de dados. Informe total de desconto e total pago pelos clientes; */
        //Variaveis
        float desconto, valorVenda, precoVeiculo;
        int opcoes;
        //Scanner
        Scanner scan = new Scanner(System.in);
        //Código
        System.out.println("Bem vindo a CARANGA");
        System.out.println("Informe o valor do veiculo: ");
            precoVeiculo = scan.nextFloat();
        System.out.println("Informe o sistema de Combustivel: \n1 - Alcool\n2 - Gasolina\n3 - Diesel\n0 - Encerrar");
            opcoes = scan.nextInt();
        
        if(opcoes == 1){
            desconto = (precoVeiculo * 0.25f);
            valorVenda = precoVeiculo - desconto;
            System.out.println("Carro no valor: R$" + precoVeiculo + " com Desconto de R$" + desconto + " e está sendo vendido por: R$" + valorVenda);
        }else if(opcoes == 2){
            desconto = (precoVeiculo * 0.21f);
            valorVenda = precoVeiculo - desconto;
            System.out.println("Carro no valor: R$" + precoVeiculo + " com Desconto de R$" + desconto + " e está sendo vendido por: R$" + valorVenda);
        }else if(opcoes == 3){
            desconto = (precoVeiculo * 0.14f);
            valorVenda = precoVeiculo - desconto;
            System.out.println("Carro no valor: R$" + precoVeiculo + " com Desconto de R$" + desconto + " e está sendo vendido por: R$" + valorVenda);
        }else if(opcoes == 0){
            System.out.println("Obrigado, volte sempre");
        }else{
            System.out.println("Opção invalida, Fim programa...");
        }
    }
    /* Ou talvez poderia usar o Do While para criar um loop e o cliente ir fazendo diversas vezes, criando um sistema de escolha se ele iria querer ou não comprar o carro e somar tudo no final. */
}

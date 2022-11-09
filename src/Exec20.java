import java.util.Scanner;

public class Exec20 {
    public static void main (String[] args) {
        /* A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”. Informar total de carros com ano até 2000 e total geral; */
        //Variaveis
        float desconto = 0.0f, valorDesconto = 0.0f, valorVeiculo = 0.0f, totalGeral = 0.0f;
        int anoVeiculo = 0, totalCarro = 0;
        String opcoes, programa;
        //scanner
        Scanner scan = new Scanner(System.in);
        //codigo
        System.out.println("CARANGO VELHO");

        programa = "S";
        do{
            System.out.println("Informe o valor do carro: ");
                valorVeiculo = scan.nextFloat();
            System.out.println("Infome o Ano do veiculo: ");
                anoVeiculo = scan.nextInt();
            
            if(anoVeiculo >= 0 && anoVeiculo <= 2000) {
                desconto = valorVeiculo * 0.12f;
                totalCarro++;
                totalGeral++;
            }else if(anoVeiculo > 2000){
                desconto = valorVeiculo * 0.07f;
                totalGeral++;
            }else{
                System.out.println("Ano do veiculo invalido");
            }

            System.out.println("---------------------------------------------------");
            valorDesconto = valorVeiculo - desconto;

            System.out.println("Valor do carro é de R$ " + valorVeiculo + " Com o desconto ficou R$ " + valorDesconto + " e o Ano do veiculo é: " + anoVeiculo);
            System.out.println("---------------------------------------------------");
            System.out.println("Deseja continuar calculando? (S) - Sim ou (N) - Não");
                opcoes = scan.next();
            switch(opcoes){
                case "s":
                    programa = "S";
                break;
                case "n":
                    programa = "N";
                break;
                default:
                    System.out.println("Opções invalidas");
                    opcoes = scan.next();
            }
        }while(programa != "N");

        System.out.println("Foram calculados: " + totalCarro + " total de carro(s) com ano ate 2000");
        System.out.println("Total de carros independente do carro: " + totalGeral);
    }
}

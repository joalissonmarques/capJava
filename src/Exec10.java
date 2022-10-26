import java.util.Scanner;

public class Exec10 {
    public static void main (String[] args) {
        /* A Loja Mamão com Açúcar está vendendo seus produtos em 5(cinco) prestações sem juros. Faça um algoritmo que receba um valor de uma compra e mostre o valor das prestações; */

        //Variaveis
        float valorCompra, valorFinal, taxa, valorParcelado = 0.0f;
        int numParcelas, opcoes = 0;

        //Scanner
        Scanner scan = new Scanner(System.in);
        //Codigo
        System.out.println("Bem vindo a loja Mamão com Açúcar, onde suas compras podem ser parcelas em ate 5x Sem juros");
        System.out.println("-------------------------------------------------");
        System.out.println("Informe o valor da compra: ");
            valorCompra = scan.nextFloat();
        //Forma de pagamento
        System.out.println("Qual será a forma de pagamento, escolha uma das opções abaixo");
        System.out.println("-------------------------------------------------");
        System.out.println("1 - Dinheiro\n2 - Cartão");
        System.out.println("-------------------------------------------------");
            opcoes = scan.nextInt();
        /* OPÇÕES DA MAQUINA */
        switch(opcoes){
            case 1:
            System.out.println("-------------------------------------------------");
                System.out.println("Sua compra está no valor de: R$" + valorCompra);
                System.out.println("Obrigado pela preferencia");
                break;
            case 2:
            System.out.println("-------------------------------------------------");
                System.out.println("Informe a quantidade de parcelas: ");
                    numParcelas = scan.nextInt();

                if(numParcelas == 0) {
                    System.out.println("Numero de parcela invalida");

                }else if(numParcelas >= 1 && numParcelas <= 5){
                    valorParcelado = (valorCompra / numParcelas);

                    valorFinal = valorCompra;

                    System.out.println("Ficou " + numParcelas + " x De "+ valorParcelado +" Total de "+ valorFinal);
                }else {
                    taxa = ((valorCompra / numParcelas) * 0.03f);
                    valorParcelado = ((valorCompra / numParcelas) + taxa);
                    
                    valorFinal = (valorParcelado * numParcelas);

                    System.out.println("Ficou " + numParcelas + " x De "+ valorParcelado);
                    System.out.printf("Com taxas e o valor final foi de: %.2f %n", valorFinal);
                }
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }

    }
}

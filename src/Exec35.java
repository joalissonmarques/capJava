import java.util.Scanner;

public class Exec35 {
    public static void main(String[] args) throws Exception {
        /* Faça um algoritmo que calcule o valor da conta de luz de uma pessoa. Sabe-se que o cálculo da conta de luz segue a tabela abaixo: Tipo de Cliente Valor do KW/h 
        a. (Residência) 0,60; 
        b. (Comércio) 0,48;  
        c. (Indústria) 1,29.
        */
        //Variaveis
        float valorConta = 0.0f, kwh = 0.0f, consumo = 0.0f;
        int opcoes;
        //Scanner
        Scanner scan = new Scanner(System.in);
        //Codigo
        System.out.println("Bem vindo, vamos calcular sua conta de energia");
        System.out.println("Informe o consumo de KW gastos no mês");
            consumo = scan.nextFloat();
        System.out.println("Escolha uma das opções abaixo: \n1 - Residência\n2 - Comércio\n3 - Indústria");
            opcoes = scan.nextInt();

        if(opcoes == 1){
            kwh = 0.60f;
        }else if(opcoes == 2){
            kwh = 0.48f;
        }else if(opcoes == 3){
            kwh = 1.29f;
        }else{
            System.out.println("Opção invalida");
        }
        valorConta = (consumo * kwh);
        System.out.println("O valor da sua conta foi de R$ " + valorConta);
    }
}

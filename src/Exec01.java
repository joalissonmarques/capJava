import java.util.Scanner;

public class Exec01 {
    public static void main(String[] args) throws Exception {
        /* Faça um algoritmo que receba dois números e exiba o resultado da sua soma; */

        //Variaveis
        int num1, num2, result;

        //Scanner
        Scanner leitor = new Scanner(System.in);

        //Sistema
        System.out.println("Bem-vindo a somatória");
        System.out.print("Informe o primeiro valor: ");
            num1 = leitor.nextInt();
        System.out.print("Informe o segundo valor: ");
            num2 = leitor.nextInt();

        //Soma dos numeros e apresentação na tela.
            result = num1 + num2;

        System.out.println("O resultado da soma é: " + result);
    }
}

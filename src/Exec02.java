import java.util.Scanner;

public class Exec02 {
    public static void main(String[] args) throws Exception {
        /* Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão
        dos dois números lidos; */

        //Atributos
        float num1, num2 = 0.0f;

        //Scanner
        Scanner scan = new Scanner(System.in);

        //Codigo

        System.out.println("Bem vindo, iremos calcular alguns números");

        System.out.println("Iremos Somar, Subtrair, Multiplicar e Dividir os números informados");

        System.out.print("Informe o primeiro número: ");
            num1 = scan.nextInt();
        System.out.print("Informe o segundo número: ");
            num2 = scan.nextInt();
        
        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtração: " + (num1 - num2));
        System.out.println("Multiplicação: " + (num1 * num2));
        System.out.println("Divisão: " + (num1 / num2));

    }
}

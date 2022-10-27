import java.util.Scanner;

public class Exec13 {
    public static void main(String[] args) {
        /* Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10; */
        //variavel
        int numero = 0;
        //Scanner
        Scanner scan = new Scanner(System.in);
        //Código
        System.out.println("Informe o numero");
            numero = scan.nextInt();
        if(numero >= 0 && numero < 10){
            System.out.println("Número menor que 10");
        }else if(numero >= 10){
            System.out.println("Número é maior que 10 ou igual a 10");
        }else{
            System.out.println("Numero negativo");
        }
    }
}

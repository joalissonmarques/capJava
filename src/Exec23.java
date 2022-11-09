import java.util.Scanner;

public class Exec23 {
    public static void main (String[] args) {
        /* Faça um algoritmo que receba um número e mostre uma mensagem caso este número sege maior que 80, menor que 25 ou igual a 40; */
        //Variveis
        int numero;
        //Scanner
        Scanner scan = new Scanner(System.in);
        //Código
        System.out.println("Bem vindo");
        System.out.println("Informe um numero: ");
            numero = scan.nextInt();
        
        if(numero > 80){
            System.out.println("Numéro " + numero + " é maior que 80");
        }else if(numero < 25 || numero == 40){
            System.out.println("Numéro " + numero + " é menor que 25 ou igual a 40");
        }else{
            System.out.println("Numéro " + numero);
        }
    }
}

import java.util.Scanner;

public class Exec25 {
    public static void main (String[] args) {
        /* Faça um algoritmo que leia dois números e identifique se são iguais ou diferentes. Caso eles sejam iguais imprima uma mensagem dizendo que eles são iguais. Caso sejam diferentes, informe qual número é o maior, e uma mensagem que são diferentes; */
        //Variavel
        int numA, numB;
        //Scanner
        Scanner scan = new Scanner(System.in);
        //Código
        System.out.println("Bem vindo");
        System.out.println("Informe o primeiro número: ");
            numA = scan.nextInt();
        System.out.println("Informe o segundo número: ");
            numB = scan.nextInt();
        
        if(numA != numB){
            System.out.println("Números são diferentes");
            if(numA > numB){
                System.out.println("A: " + numA + " Número é maior que o B: " + numB);
            }else{
                System.out.println("A: " + numA + " Número é menor que o B: " + numB);
            }
        }else if(numA == numB){
            System.out.println("Números iguais");
        }else{
            System.out.println("Números negativos");
        }
    }
}

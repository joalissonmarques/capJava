import java.util.Scanner;

public class Exec14 {
    public static void main(String[] args) {
        /* Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior; */
        //Variaveis
        int a, b = 0;
        //Scanner
        Scanner scan = new Scanner(System.in);
        //Código
        System.out.println("Informe o valor de A: ");
            a = scan.nextInt();
        System.out.println("Informe o valor de B: ");
            b = scan.nextInt();
        
        if(a > b){
            System.out.println("A é maior que B");
        }else if(b > a){
            System.out.println("B é maior que A");
        }else {
            System.out.println("Valores são iguais");
        }
    }
}

import java.util.Scanner;

public class Exec26 {
    public static void main (String[] args) {
    /* Faça um algoritmo que leia um número de 1 a 5 e escreva por extenso. Caso o usuário digite um número que não esteja neste intervalo, exibir a seguinte mensagem: número inválido; */
    //Variaveis
    int numero;
    //Scann
    Scanner scan = new Scanner(System.in);
    //Codigo
    System.out.println("Olá, informe um número de 1 à 5: ");
        numero = scan.nextInt();
    if(numero == 1){
        System.out.println("UM");
    }else if(numero == 2){
        System.out.println("DOIS");
    }else if(numero == 3){
        System.out.println("TRÊS");
    }else if(numero == 4){
        System.out.println("QUATRO");
    }else if(numero == 5){
        System.out.println("CINCO");
    }else{
        System.out.println("NÚMERO INVALIDO");
    }
    }
}

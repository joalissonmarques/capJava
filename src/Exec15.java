import java.util.Scanner;

public class Exec15 {
    public static void main(String[] args) {
        /* Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200; */
        //Variaveis
        int numero = 0;
        //Scanner
        Scanner scan = new Scanner(System.in);
        //Código
        System.out.println("Informe um valor: ");
            numero = scan.nextInt();
        System.out.println("Verificando se o valor está entre 100 a 200 ou não...");

        if(numero >= 100 && numero <= 200){
            System.out.println("Número está entre 100 a 200");
        }else{
            System.out.println("Número está fora do intervalo");
        }
    }
}

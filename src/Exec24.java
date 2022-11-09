import java.util.Scanner;

public class Exec24 {
    public static void main (String[] args) {
        /* Faça um algoritmo que receba “N” números e mostre positivo, negativo ou zero para cada número; */
        //Variavel
        int numero, qtdNumFor;
        //scanner
        Scanner scan = new Scanner(System.in);
        //Codigo
        System.out.println("Olá, informe a quantidade de numeros: ");
        qtdNumFor = scan.nextInt();

        for(int i = 1; i <= qtdNumFor; i++){
            System.out.println("Olá, informe um numero: ");
            numero = scan.nextInt();

            if(numero > 0){
                System.out.println("Número positivo");
            }else if( numero < 0){
                System.out.println("Número negativo");
            }else{
                System.out.println("Número igual a 0");
            }
        }
    }
}

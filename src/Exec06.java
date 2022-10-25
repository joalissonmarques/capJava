import java.util.Scanner;

public class Exec06 {
    public static void main(String[] args) throws Exception {
        /* Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variável A passe a possuir ovalor da variável B e a variável B passe a possuir o valor da variável A. Apresentar osvalores trocados; */

        //Atributos
        float a, b, aux = 0.0f;

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor de A: ");
            a = scan.nextFloat();

        System.out.println("Informe o valor de B: ");
            b = scan.nextFloat();

        aux = a;
        a = b;
        b = aux;

        System.out.println("Valor de A recebendo B: " + a); 

        System.out.println("----------------------------");        

        System.out.println("Valor de B recebendo A: " + b);

        /* Resolução: É necessario ter um auxiliar para receber o valor de um deles e assim ser salvo. */

    }
}

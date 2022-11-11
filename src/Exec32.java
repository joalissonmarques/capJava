import java.util.Scanner;

public class Exec32 {
    public static void main(String[] args) throws Exception {
        /* Escreva um algoritmo que leia três valores inteiros e verifique se eles podem ser os lados de um triângulo. Se forem, informar qual o tipo de triângulo que eles formam: equilátero, isóscele ou escaleno. Propriedade: o comprimento de cada lado de um triângulo é menor do que a soma dos comprimentos dos outros dois lados. */
        /*  a. Triângulo Equilátero: aquele que tem os comprimentos dos três lados    iguais;
            b. Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais.
            c. Triângulo equilátero é também isóscele;
            d. Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes; 
        */
        //Variaveis
        int a, b, c;
        //Scanner
        Scanner scan = new Scanner(System.in);
        //Codigo
        System.out.println("Bem vindo");
        System.out.println("Informe o 1° valor: ");
            a = scan.nextInt();
        System.out.println("Informe o 2° valor: ");
            b = scan.nextInt();
        System.out.println("Informe o 3° valor: ");
            c = scan.nextInt();
        if((a + b > c) && (a + c > b) && (b + c > a)){
            System.out.println("Triangulo");

            if((a == b) && (b == c)){
                System.out.println("Triângulo Equilátero");
            }else if((a == b) || (b == c) || (c == a)){
                System.out.println("Triângulo Isóscele");
            }else{
                System.out.println("Triângulo Escaleno");
            }
        }
        else {
            System.out.println("Não é um triangulo");
        }
    }
}

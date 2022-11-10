import java.util.Scanner;

public class Exec30 {
    public static void main (String[] args) {
        /* Escreva um algoritmo que leia três valores inteiros distintos e os escreva em ordem descrescente; */
        //Variaveis
        int a, b, c, aux;
        //Scanner
        Scanner scan = new Scanner(System.in);
        //Código
        System.out.println("Metodo de ordenação crescente");
        System.out.println("Informe o 1 numero: ");
            a  = scan.nextInt();
        System.out.println("Informe o 2 numero: ");
            b  = scan.nextInt();
        System.out.println("Informe o 3 numero: ");
            c  = scan.nextInt();
        
        if(a == b && b == c){
            System.out.println("Números são iguais");
        }else if(a > b && a > c){
            if(b > c){
                System.out.println(a + " " + b + " "+ c);
            }else{
                System.out.println(a + " " + c + " "+ b);
            }
        }else if(b > a && b > c){
            if(a > c){
                System.out.println(b + " " + a + " "+ c);
            }else{
                System.out.println(b + " " + c + " "+ a);
            }
        }else {
            if(b > a){
                System.out.println(c + " " + b + " "+ a);
            }else{
                System.out.println(c + " " + a + " "+ b);
            }
        }
    }
}

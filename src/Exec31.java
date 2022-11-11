import java.util.Scanner;

public class Exec31 {
    public static void main(String[] args) throws Exception {
        /* Dados três valores A, B e C, em que A e B são números reais e C é um caractere, pede-se para imprimir o resultado da operação de A por B se C for um símbolo de operador aritmético; caso contrário deve ser impressa uma mensagem de operador não definido. Tratar erro de divisão por zero; */
        //Variaveis
        int a, b, result;
        String c;
        //Scanner
        Scanner scan = new Scanner(System.in);
        //Codigo
        System.out.println("Informe o 1° Valor: ");
            a = scan.nextInt();
        System.out.println("Informe o 2° Valor: ");
            b = scan.nextInt();
        System.out.println("Informe um caracter, de preferencia aritmético: ");
            c = scan.next();
        
        switch(c){
            case "+":
                result = (a + b);
                System.out.println("Você está somando, resultado é: " + result);
            break;
            case "-":
                result = (a - b);
                System.out.println("Você está subtraindo, resultado é: " + result);
            break;
            case "*":
                result = (a * b);
                System.out.println("Você está multiplicando, resultado é: " + result);
            break;
            case "/":
                if(a == 0 || b == 0){
                    System.out.println("Valores dividos por zero, é zero");
                }else{
                    result = (a / b);
                    System.out.println("Você está dividindo, resultado é: " + result);
                }
            break;
            default:
                System.out.println("operador não definido");
            break;
        }
    }
}

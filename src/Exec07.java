import java.util.Scanner;

public class Exec07 {
    public static void main(String[] args) throws Exception {
        /*Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é: F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius*/

        //Variaveis
        float celsius, fahrenheit = 0.0f;

        //Scanner
        Scanner scan = new Scanner(System.in);

        //Código.
        System.out.println("Conversão de Temperaturas");
        System.out.println("Informe a temperatura em Celsius: ");
            celsius = scan.nextFloat();

        System.out.println("Temperatura em Celsius: " + celsius + "°C");

            fahrenheit = ((9 * celsius + 160) / 5);

        System.out.println("Valor convertido para Fahrenheit: " + fahrenheit + "°F");
        
    }
}

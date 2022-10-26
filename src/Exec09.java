import java.util.Scanner;

public class Exec09 {
    public static void main(String[] args) {
       /* Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um mês.Considere fixo o juro da poupança em 0,07% a. m; */
       
        //Variaveis
        float valor, rendimento, meses, taxa = 0.0f;
        //Scanner
        Scanner scan = new Scanner(System.in);
        //Codigo
        System.out.println("Informe o valor que será depositado: ");
            valor = scan.nextFloat();
        System.out.println("Informe por quantos meses o dinheiro ficará rendendo: ");
            meses = scan.nextInt();

            taxa = (meses * 0.07f);
            rendimento = valor + (valor * taxa);

        System.out.println("Seu rendimento será de: " + rendimento + " Em " + meses + " Meses ");
    }
}

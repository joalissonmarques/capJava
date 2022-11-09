import java.util.Scanner;

public class Exec17 {
    public static void main (String[] args){
        /* Leia 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) e 150 (inclusive); */
        //Variaveis
        int numeros = 0, qtdNumFor = 0, numFora = 0, numIntervalo = 0;
        //Scanner
        Scanner scan = new Scanner(System.in);
        //Codigo
        System.out.println("Quantos numeros irá cadastrar? ");
            qtdNumFor = scan.nextInt();

        for(int i = 1; i <= qtdNumFor; i++){
            System.out.println("Informe o numero " + i + " :");
                numeros = scan.nextInt();
            if(numeros >= 10 && numeros <= 150){
                numIntervalo++;
            }else{
                numFora++;
            }
        }
        System.out.println("Você cadastrou: " + qtdNumFor + " números");
        System.out.println("Existe " + numIntervalo + " números que estão entre >= 10 e <= 150 e fora do intervalo " + numFora);
        System.out.println(numeros);
    }
}

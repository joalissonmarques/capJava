import java.util.Scanner;

public class Exec18 {
    public static void main(String[] args){
        /* Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando “maior de idade” e “menor de idade” para cada pessoa. Considere a idade a partir de 18 anos como maior de idade; */
        //Variaveis
        int idade = 0, qtdNumFor = 0, idadeAdulto = 0, idadeMenor = 0;
        //Scanner
        Scanner scan = new Scanner(System.in);
        //Codigo
        System.out.println("Quantos pessoas irá cadastrar? ");
            qtdNumFor = scan.nextInt();

        for(int i = 1; i <= qtdNumFor; i++){
            System.out.println("Informe a " + i + " idade: ");
                idade = scan.nextInt();
            if(idade >= 18){
                System.out.println("Adulto");
                idadeAdulto++;
            }else if(idade >= 0 && idade < 18){   
                System.out.println("Menor de idade");           
                idadeMenor++;
            }else{
                System.out.println("Idade invalida");
            }
        }
        
        System.out.println("Existem " + idadeAdulto + " Adulto(s)");
        System.out.println("Existem " + idadeMenor + " Menor(es) de idade");

    }
}

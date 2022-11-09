import java.util.Scanner;

public class Exec19 {
    public static void main(String[] args){
        /* Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem ou mulher. No final informe total de homens e de mulheres; */
        //Variaveis
        int  qtdNumFor = 0, qtdH = 0, qtdM = 0;
        String nomePessoa, sexo;
        //Scanner
        Scanner scan = new Scanner(System.in);
        //Codigo
        System.out.println("Quantas pessoas você irá cadastrar? ");
            qtdNumFor = scan.nextInt();
        
        for(int i = 0; i >= qtdNumFor; i++){
            nomePessoa = "";
            sexo = "";

            System.out.println("Infome seu nome: ");
                nomePessoa = scan.nextLine();
            System.out.println("Informe seu sexo (gênero): \nH - Homem \nM - Mulher");
                sexo = scan.nextLine();

            if(sexo == "h" || sexo == "H"){
                System.out.println("Olá " + nomePessoa);
                System.out.println("Gênero Masculino");
                qtdH++;
            }else if(sexo == "m" || sexo == "M"){
                System.out.println("Olá " + nomePessoa);
                System.out.println("Gênero Feminino");
                qtdM++;
            }else{
                System.out.println("Opção invalida");
            }
        }
        
        System.out.println("Você cadastrou " + qtdNumFor + " Pessoa e você tem a quantidade de " + qtdH + " Sexo Masculino e " + qtdM + " Sexo Feminino.");
    }

}

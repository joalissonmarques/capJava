import java.util.Scanner;

public class Exec21 {
    public static void main (String[] args) {
        /* Escreva um algoritmo que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informe se está apta ou não para cumprir o serviço militar obrigatório. Informe os totais; */
        //Variaveis
        int qtdPessoas = 0, idade = 0, qtdAptas = 0, saude = 0, qtdInaptas = 0;
        String nome, sexo;
        //Scan
        Scanner scan = new Scanner(System.in);
        //Codigo
        System.out.println("Bem vindo ao alistamento");
        System.out.println("Quantas pessoas você irá cadastrar? ");
            qtdPessoas = scan.nextInt();

        for(int i = 1; i <= qtdPessoas; i++){
            System.out.println("Informe seu nome: ");
                nome = scan.next();
            System.out.println("Informe sua idade: ");
                idade = scan.nextInt();
            System.out.println("Informe seu gênero: ");
                sexo = scan.next();
            System.out.println("Informe seu nivel de saude: \n 1 - Saudavel\n 2 - Boa \n 3 - Doente/Impossibilitado.");
                saude = scan.nextInt();
            
            if(idade >= 18 && idade <= 35 && saude == 1 || saude == 2){
                System.out.println("Olá " + nome + " você está apto para cumprir o serviço militar");
                qtdAptas++;
            }else if(idade >= 18 && idade <= 35 && saude == 3){
                System.out.println("Olá " + nome + " infelizmente você não poderá cumprir o serviço militar");
                qtdInaptas++;
            }else if(idade > 35 && saude == 1 || saude == 2 || saude == 3){
                System.out.println("Infelizmente você não se encaixa no perfil");
                qtdInaptas++;
            }else{
                System.out.println("Somente para maiores de 18 anos e menos de 35");
            }
        }
        System.out.println("Você tem " + qtdAptas + " pessoas prontas para servir e " + qtdInaptas + " que não podem por algum motivo.");
    }
}

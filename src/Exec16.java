import java.util.Scanner;

public class Exec16 {
    public static void main(String[] args) {
        /* Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre. Calcular a sua média (aritmética), informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e Recuperação (media entre 5.1 a 6.9); */
        //Atributos
        String nomeAluno;
        float notas = 0.0f, media = 0.0f, arrayNotas = 0.0f;
        int repeticao = 0;
        //Scanner
        Scanner scan = new Scanner(System.in);
        //Codigo
        System.out.println("Bem vindo aluno");
        System.out.println("Informe seu nome: ");
            nomeAluno = scan.nextLine();
        System.out.println("Quantas notas você quer calcular? ");
            repeticao = scan.nextInt();

        for(int i = 1; i <= repeticao ; i++){
            System.out.println("Informe sua nota: " + i);
                notas = scan.nextFloat();
                arrayNotas += notas;
                media = (arrayNotas / repeticao);
        }
        
        if(media >= 0 && media <= 5){
            System.out.println(nomeAluno + " sua media foi de: " + media + " você está reprovado");
        }else if(media >= 7){
            System.out.println(nomeAluno + " sua media foi de: " + media + " você está aprovado");
        }else{
            System.out.println(nomeAluno + " sua media foi de: " + media + " você está de recuperação");
        }
    }
}

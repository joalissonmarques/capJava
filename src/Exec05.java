import java.util.Scanner;

public class Exec05 {
    public static void main(String[] args) throws Exception {
        /* Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre.
        No final informar o nome do aluno e a sua média (aritmética); */

        //Variaveis
        String nomeAluno;
        float nota1, nota2, nota3, media = 0.0f;        

        //Scannner
        Scanner scan = new Scanner(System.in);

        System.out.println("Bem vindo a notas do aluno");

        System.out.println("Digite o nome do aluno: ");
            nomeAluno = scan.next();

        System.out.println("Informe suas notas");

        System.out.println("Nota 1: ");
            nota1 = scan.nextFloat();
        
        System.out.println("Nota 2: ");
            nota2 = scan.nextFloat();
        
        System.out.println("Nota 3: ");
            nota3 = scan.nextFloat();

        //calcular media.
        media = ((nota1 + nota2 + nota3) / 3);

        System.out.println("Olá " + nomeAluno);
        System.out.println("Sua média foi: " + media);
    }
}

import java.util.Scanner;

public class Exec33 {
    public static void main(String[] args) throws Exception {
        /* 
        * A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça um algoritmo que calcule e exiba o salário de um professor. Sabe-se que o valor da hora/aula segue a tabela abaixo: 
        * a. Professor Nível 1 R$12,00 por hora/aula; 
        * b. Professor Nível 2 R$17,00 por hora/aula; 
        * c. Professor Nível 3 R$25,00 por hora/aula.
        */
        //Variaveis
        int horaTrabalhadas, nivelProfessor;
        Float salario = 0.0f, valorHora = 0.0f;
        String nomeProfessor;
        //Scan
        Scanner scan = new Scanner(System.in);
        //Codigo
        System.out.println("Bem vindo a escola Aprender");
        System.out.println("Olá professor(a), informe seu nome: ");
            nomeProfessor = scan.next();
        System.out.println("Informe seu nivel\n1 - Professor Nível 1\n2 - Professor Nível 2\n3 - Professor Nível 3");
            nivelProfessor = scan.nextInt();
        System.out.println("Informe quantas horas vocẽ trabalhou: ");
            horaTrabalhadas = scan.nextInt();
        System.out.println("-------------------------------------------------------------------------");
        if(nivelProfessor == 1){
            valorHora = 12f;
        }else if(nivelProfessor == 2){
            valorHora = 17f;
        }else if(nivelProfessor == 3){
            valorHora = 25f;
        }else{
            System.out.println("Opção invalida, ainda não temos este nível :D");
        }
        System.out.println("-------------------------------------------------------------------------");
        salario = (horaTrabalhadas * valorHora);
        System.out.println("Olá Prof: " + nomeProfessor + " seu salario é R$ " + salario);
    }
}

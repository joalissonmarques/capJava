import java.util.Scanner;

public class Exec34 {
    public static void main(String[] args) throws Exception {
        /* Elabore um algoritmo que, dada a idade de um nadador. Classifique-o em uma das seguintes categorias: 
        a. Infantil A = 5 - 7 anos; 
        b. Infantil B = 8 - 10 anos; 
        c. Juvenil A = 11- 13 anos; 
        d. Juvenil B = 14 - 17 anos; 
        e. Sênior = 18 - 25 anos. */
        //Variaveis
        int idade;
        //Scanner
        Scanner scan = new Scanner(System.in);
        //Codigo
        System.out.println("Bem vindo nadador");
        System.out.println("Informe sua idade: ");
            idade = scan.nextInt();
        if((idade >= 5) && (idade <= 7)){
            System.out.println("Infantil A");
        }else if((idade >= 8) && (idade <= 10)){
            System.out.println("Infantil B");
        }else if((idade >= 11) && (idade <= 13)){
            System.out.println("Juvenil A");
        }else if((idade >= 14) && (idade <= 17)){
            System.out.println("Juvenil B");
        }else if((idade >= 18) && (idade <= 25)){
            System.out.println("Sênior");
        }else{
            System.out.println("Bebêzinho");
        }
    }
}

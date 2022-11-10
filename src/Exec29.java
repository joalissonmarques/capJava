import java.util.Scanner;

public class Exec29 {
    public static void main (String[] args) {
        /* Faça um algoritmo que receba o número do mês e mostre o mês correspondente. Valide mês inválido; */
        //Variaveis
        int mes;
        //Scanner
        Scanner scan = new Scanner(System.in);
        //Codigo
        System.out.println("Bem vindo ao sistema de mês");
        System.out.println("Informe o mês em número: ");
            mes = scan.nextInt();
        
        if(mes == 1){
            System.out.println("JANEIRO");
        }else if(mes == 2){
            System.out.println("FEVEREIRO");
        }else if(mes == 3){
            System.out.println("MARÇO");
        }else if(mes == 4){
            System.out.println("ABRIL");
        }else if(mes == 5){
            System.out.println("MAIO");
        }else if(mes == 6){
            System.out.println("JUNHO");
        }else if(mes == 7){
            System.out.println("JULHO");
        }else if(mes == 8){
            System.out.println("AGOSTO");
        }else if(mes == 9){
            System.out.println("SETEMBRO");
        }else if(mes == 10){
            System.out.println("OUTUBRO");
        }else if(mes == 11){
            System.out.println("NOVEMBRO");
        }else if (mes == 12){
            System.out.println("DESEMBRO");
        }else{
            System.out.println("MÊS INVALIDO, SÓ TEM DE 1 - 12");
        }
    }
}

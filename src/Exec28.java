import java.util.Scanner;

public class Exec28 {
    public static void main (String[] args) {
        /* Escreva um algoritmo para uma empresa que decide dar um reajuste a seus 584 funcionários de acordo com os seguintes critérios:
        a. 50% para aqueles que ganham menos do que três salários mínimos;
        b. 20% para aqueles que ganham entre três até dez salários mínimos;
        c. 15% para aqueles que ganham acima de dez até vinte salários mínimos;
        d. 10% para os demais funcionários. 
        Leia o nome do funcionário, seu salário e o valor do salário mínimo. Calcule o seu novo salário reajustado. Escrever o nome do funcionário, o reajuste e seu novo salário. Calcule quanto à empresa vai aumentar sua folha de pagamento;*/
        //Variaveis
        int qtdFunc;
        String nomeFunc;
        float seuSalario, salarioMin, reajusteSalario, novoSalario;
        //Scanner
        Scanner scan = new Scanner(System.in);
        //Código
        System.out.println("Bem vindo ao sistema de reajuste salarial");
        System.out.println("Quantos funcionarios você irá fazer o reajuste: ");
            qtdFunc = scan.nextInt();
        System.out.println("----------------------------------------------");
        System.out.println("REAJUSTES\n50% para aqueles que ganham menos do que três salários mínimos\n20% para aqueles que ganham entre três até dez salários mínimos\n15% para aqueles que ganham acima de dez até vinte salários mínimos\n10% para os demais funcionários");
        System.out.println("----------------------------------------------");

        for(int i = 1; i <= qtdFunc; i++){

            System.out.println("Informe seu nome: ");
                nomeFunc = scan.next();
            System.out.println("Informe o SALARIO MINIMO ATUAL: ");
                salarioMin = scan.nextFloat();
            System.out.println("Informe SEU SALARIO ATUAL: ");
                seuSalario = scan.nextFloat();

            if(seuSalario < (salarioMin * 3)){
                System.out.println("REAJUSTE DE 50%");
                reajusteSalario = seuSalario * 0.50f;
                novoSalario = seuSalario + reajusteSalario;
               
            }else if(seuSalario >= (salarioMin * 3) && seuSalario <= (salarioMin * 10)){
                System.out.println("REAJUSTE DE 20%");
                reajusteSalario = seuSalario * 0.20f;
                novoSalario = seuSalario + reajusteSalario;
               
            }else if(seuSalario > (salarioMin * 10) && seuSalario < (salarioMin * 20)){
                System.out.println("REAJUSTE DE 15%");
                reajusteSalario = seuSalario * 0.15f;
                novoSalario = seuSalario + reajusteSalario;
               
            }else{
                System.out.println("REAJUSTE DE 10%");
                reajusteSalario = seuSalario * 0.10f;
                novoSalario = seuSalario + reajusteSalario;
               
            }
            System.out.println("Olá " + nomeFunc + " SEU SALARIO ERA DE R$ " + seuSalario + " você teve reajuste de R$ "+ reajusteSalario + " SEU NOVO SALARIO É R$ " + novoSalario);
        }   
    }
}

import java.util.Scanner;

public class Exec03 {
    public static void main(String[] args) throws Exception {
        /* Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância total percorrida pelo automóvel e o total de combustível gasto; */

        //Atributos
        float consumo_medio, distancia_total, combustivel_gasto = 0.0f;

        //Scanner
        Scanner scan = new Scanner(System.in);

        //Codigo
        System.out.println("Consumo médio de um automóvel");

        System.out.println("Qual foi a distancia total percorrida? ");
            distancia_total = scan.nextFloat();

        System.out.println("Total de combustivel gasto pelo automóvel? ");
            combustivel_gasto = scan.nextFloat();
        
        //Calculo
        consumo_medio = (distancia_total / combustivel_gasto);

        System.out.println("O consumo médio do automovel foi de: " + consumo_medio + " Litros por KM");

    }
}

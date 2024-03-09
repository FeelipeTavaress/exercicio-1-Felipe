
package decimosextoprograma;

import java.util.Scanner;

public class DecimoSextoPrograma {


    public static void main(String[] args) {
        double distancia ;
        double litros;
        double consumo;

        Scanner sc = new Scanner(System.in);
    System.out.println("Informe a distância total em quilômetros: ");
    distancia = sc.nextFloat();
    System.out.println("Informe a quantidade de combustível gasta em litros: ");
    litros = sc.nextFloat();  
    consumo = (distancia/litros);
    System.out.println(" o consumo médio de combustível foi: " + consumo);
    sc.close();
    }
    
}

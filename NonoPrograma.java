
package nonoprograma;

import java.util.Scanner;

public class NonoPrograma {

    public static void main(String[] args) {
    double raio ;
   double area;

   Scanner sc = new Scanner(System.in);
    System.out.println("Informe o raio do círculo: ");
    raio = sc.nextDouble();
    area =((raio * raio)* 3.14);
    System.out.println ("o valor da área é: " + area );    
    sc.close();
   } 
}

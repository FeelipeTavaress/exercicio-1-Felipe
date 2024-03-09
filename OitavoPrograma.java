
package oitavoprograma;

import java.util.Scanner;

public class OitavoPrograma {

public static void main (String[]args){
   double metros ;
   double centimetros;

   Scanner sc = new Scanner(System.in);
    System.out.println("Informe o valor em metros: ");
    metros = sc.nextDouble();
    centimetros =(metros * 100);
    System.out.println ("o valor em centimetros é: " + centimetros );    
    sc.close();
   } 
}

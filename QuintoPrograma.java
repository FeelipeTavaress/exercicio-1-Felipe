
package QuintoPrograma;

import java.util.Scanner;

public class QuintoPrograma {

   public static void main (String[]args){
   double dolar ;
   double moeda;

   Scanner sc = new Scanner(System.in);
    System.out.println("Informe o valor que você quer converter: ");
    dolar = sc.nextDouble();
    moeda =(dolar * 4.95);
    System.out.println ("o valor em reais é: " + moeda);    
    sc.close();
   } 

    }



import java.util.Scanner;

public class SextoPrograma {
  public static void main (String[]args){
   int idade ;
   int dias ;

   Scanner sc = new Scanner(System.in);
    System.out.println("Informe sua idade: ");
     idade = sc.nextInt();
     dias =(idade * 365);
    System.out.println ("o número de dias que você viveu foram: " + dias); 
    sc.close();
     }
}

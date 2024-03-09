/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setimoprograma;

import java.util.Scanner;

public class setimoprograma {
  public static void main (String[]args){
   double salario ;
   double reajuste ;

   Scanner sc = new Scanner(System.in);
    System.out.println("Informe seu salario: ");
     salario = sc.nextInt();
     reajuste =((salario/100)* 7)+ salario;
    System.out.println ("seu salário reajustado: " + reajuste); 
    sc.close();
     }
}

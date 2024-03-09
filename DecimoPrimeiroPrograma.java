
package decimoprimeiroPrograma;

import java.util.Scanner;

public class DecimoPrimeiroPrograma {
    
public static void main(String[] args) {
   double numero1 ;
   double numero2 ;
   double numero3 ;
   double media;

   Scanner sc = new Scanner(System.in);
    System.out.println("Informe uma nota: ");
    numero1 = sc.nextDouble();
    System.out.println("Informe outra nota: ");
    numero2 = sc.nextDouble();
    System.out.println("Informe mais uma nota: ");
    numero3 = sc.nextDouble();
    media =((numero1 + numero2 + numero3)/3);
    System.out.println ("o media das notas é: " + media );    
    sc.close();
    }
    
}

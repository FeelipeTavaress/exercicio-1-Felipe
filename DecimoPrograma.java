
package decimoprograma;

import java.util.Scanner;

public class DecimoPrograma {
 public static void main(String[] args) {
    double fahrenheit ;
   double celsius;

   Scanner sc = new Scanner(System.in);
    System.out.println("Informe a temperatura em fahrenheit: ");
    fahrenheit = sc.nextDouble();
    celsius =((fahrenheit - 32)* 5/9);
    System.out.println ("o valor em graus celsius é: " + celsius );    
    sc.close();
    }
    
}

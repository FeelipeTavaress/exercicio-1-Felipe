
package decimosetimoprograma;

import java.util.Scanner;
public class DecimoSetimoPrograma {

   public static void main(String[] args) {
        int N ;
        int Y;
        double Z;
        double valorCaneta;

        Scanner sc = new Scanner(System.in);
    System.out.println("Informe o número de canetas compradas: ");
    N = sc.nextInt();
    System.out.println("Informe o valor da nota utilizada: ");
    Y = sc.nextInt();  
    System.out.println("Informe o valor do troco: ");
    Z = sc.nextFloat();  
    valorCaneta = ((Y-Z)/N);
    System.out.println(" o valor de cada caneta foi: " + valorCaneta);
    sc.close();
    }
    
}

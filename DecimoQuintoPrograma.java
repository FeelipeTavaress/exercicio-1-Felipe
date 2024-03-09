
package decimoquintoprograma;

import java.util.Scanner;

public class DecimoQuintoPrograma {

    public static void main(String[] args) {
    double A ;
    double B;
    double C;
    double delta;
    double x1;
    double x2;

   Scanner sc = new Scanner(System.in);
    System.out.println("Informe um valor para A: ");
     A = sc.nextDouble();
     System.out.println("Informe um valor para B: ");
     B = sc.nextDouble();
     System.out.println("Informe um valor para C: ");
     C = sc.nextDouble();
    delta =((B * B)- 4* A *C);
    if (delta > 0.0) {
    x1 = ((-B + Math.sqrt(delta))/ 2* A);
    x2 = ((-B - Math.sqrt(delta))/ 2* A);
    System.out.println ("o valor de x1 é: " + x1 ); 
    System.out.println ("O valor de x2 é: " + x2 );
    } else if (delta == 0.0) {
                x1 = -B / (2.0 * A);
                System.out.println("a raiz é: " + x1);
    } else {
                System.out.println("não há raizes reais para essas equação! ");
            }
    sc.close();
    }
    }
    
    

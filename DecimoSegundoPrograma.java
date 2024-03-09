
package decimosegundoprograma;

import java.util.Scanner;

public class DecimoSegundoPrograma {


    public static void main(String[] args) {
     int numero1;
     int antecessor;
     int sucessor;
     
     Scanner sc = new Scanner(System.in);
    System.out.println("Informe um número: ");
    numero1 = sc.nextInt();
    antecessor = (numero1 - 1);
    sucessor = (numero1 + 1);
    System.out.println("o antecessor desse número é: " + antecessor );
    System.out.println("o sucessor desse número é: " + sucessor );
    }
    
}


package decimooitavoprograma;

import java.util.Scanner;


public class DecimoOitavoPrograma {

    public static void main(String[] args) {
    double X;
    double Y;
    double numeroDegraus;
     Scanner sc = new Scanner(System.in);
    System.out.println("Informe a altura de cada degrau em metros: ");
    X = sc.nextDouble();
    System.out.println("Informe a altura que deseja alcançar em metros: ");
     Y = sc.nextDouble();
    numeroDegraus = (Y/X);
    System.out.println("o número de degraus que deve-se subir é: " + numeroDegraus);
     
    }
    
}

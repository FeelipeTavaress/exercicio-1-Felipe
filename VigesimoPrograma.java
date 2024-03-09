
package vigesimoprograma;

import java.util.Scanner;


public class VigesimoPrograma {

    public static void main(String[] args) {
    double IPI;
    int codigo1;
    int codigo2;
    double valor1;
    double valor2;
    int quantidade1;
    int quantidade2;
    double valortotal;
    double valortotalmaisIPI;
     Scanner sc = new Scanner(System.in);
    System.out.println("Informe a porcentagem do IPI: ");
    IPI = sc.nextDouble();
    System.out.println("Informe o código da peça 1: ");
     codigo1 = sc.nextInt();
     System.out.println("Informe o valor unitário da peça 1: ");
     valor1 = sc.nextDouble();
     System.out.println("Informe a quantidade de peças 1: ");
     quantidade1 = sc.nextInt();
     System.out.println("Informe o código da peça 2: ");
     codigo2 = sc.nextInt();
     System.out.println("Informe o valor unitário da peça 2: ");
     valor2 = sc.nextDouble();
     System.out.println("Informe a quantidade de peças 2: ");
     quantidade2 = sc.nextInt(); 
    valortotal = (((valor1 * quantidade1) + valor2 * quantidade2));
    valortotalmaisIPI =(((valortotal/100) * IPI)+ valortotal );
    System.out.println("o valor total a ser pago é: " + valortotalmaisIPI);
    }
}

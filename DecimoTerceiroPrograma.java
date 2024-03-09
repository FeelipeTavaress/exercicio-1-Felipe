
package decimotereiroprograma;

import java.util.Scanner;

public class DecimoTereiroPrograma {
    public static void main(String[] args) {
   double ValorHora ;
   double horasMes ;
   double INSS ;
   double salario ;
   double salarioDesconto ;

   Scanner sc = new Scanner(System.in);
    System.out.println("Informe quanto você recebe por hora: ");
    ValorHora = sc.nextDouble();
    System.out.println("Informe o numero de horas trabalhadas no mês: ");
    horasMes = sc.nextDouble();
    System.out.println("Informe o percentual de desconto do INSS: ");
    INSS = sc.nextDouble();
    salario =(ValorHora * horasMes);
    salarioDesconto = ((salario/100 * INSS) - salario);
    System.out.println ("o media das notas é: " + salarioDesconto);
    sc.close();
    }
    
}

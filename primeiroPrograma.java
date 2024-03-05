import java.util.Scanner;

public class primeiroPrograma {
 public static void main (String[]args){
   int soma;

   Scanner sc = new Scanner(System.in);

    System.out.println("Informe um número: ");
    int numero1 = sc.nextInt();
    System.out.println("Informe mais um número: ");
    int numero2 = sc.nextInt();
    System.out.println("a soma é: ");
   soma = (numero1 + numero2); 
    System.out.println(soma);
    sc.close();


 }



}
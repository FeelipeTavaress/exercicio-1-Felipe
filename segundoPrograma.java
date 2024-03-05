import java.util.Scanner;

public class segundoPrograma {
 public static void main (String[]args){
   int resto;

   Scanner sc = new Scanner(System.in);

    System.out.println("Informe um número: ");
    int numero1 = sc.nextInt();
    System.out.println("Informe mais um número: ");
    int numero2 = sc.nextInt();
    System.out.println("o resto é: ");
   resto = (numero1 % numero2); 
    System.out.println(resto);
    sc.close();


 }



}
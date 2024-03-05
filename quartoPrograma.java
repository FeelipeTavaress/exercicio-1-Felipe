import java.util.Scanner;

public class quartoPrograma {
   public static void main (String[]args){
   String nome;
   String rua;
   String bairro;
   int numero;
   int telefone;

   Scanner sc = new Scanner(System.in);
    System.out.println("Informe seu nome: ");
    nome = sc.nextLine();
    System.out.println("Informe seu bairro: ");
    rua = sc.nextLine();
    System.out.println("Informe sua rua: ");
    bairro = sc.nextLine();
    System.out.println("Informe o número der sua casa: ");
    numero= sc.nextInt();
    System.out.println("Informe seu telefone: ");
    telefone = sc.nextInt();
    System.out.println ("seu nome é:  " + nome + " \n seu endereço é: " + rua + bairro + numero + " \n seu telefone é: " + telefone);
    sc.close();
   }
}

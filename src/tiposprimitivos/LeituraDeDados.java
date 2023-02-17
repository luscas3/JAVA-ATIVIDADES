package tiposprimitivos;

import java.util.Scanner;

public class LeituraDeDados {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in); 
      System.out.println(x: "Digite a sua Idade:");
      int idade = scan.nextInt();

      System.out.println("Voce tem " + idade + " anos!");

    }
}
package tiposprimitivos;

import java.util.Scanner;

public class Exe2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Digite a quantidade de pontos do líder: ");
    int pontosLider = input.nextInt();

    System.out.print("Digite a quantidade de pontos do lanterna: ");
    int pontosLanterna = input.nextInt();

    int vitoriasNecessarias = (pontosLider - pontosLanterna) / 3;

    System.out.println("Número de vitórias necessárias para o time lanterna alcançar (ou ultrapassar) o líder: " + vitoriasNecessarias);

    input.close();
  }
}
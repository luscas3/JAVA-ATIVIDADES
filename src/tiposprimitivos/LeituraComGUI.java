package tiposprimitivos;

import javax.swing.JOptionPane;

public class LeituraComGUI {
    public static void main(String[] args) {
      int idade = 0;
      String aux = JOptionPane.showInputDialog( "Insira Uma Idade", args);

      idade = Integer.parseInt(aux, idade, idade, idade);
      JOptionPane.showMessageDialog(null, "Idade digitada: " + idade);
    }
}
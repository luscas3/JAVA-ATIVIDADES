package tiposprimitivos;

public class Exercicios {
    public static void main(String[] args) {
      private double valor;
      private double desconto;
  
      public void Produto(double valor, double desconto) {
          this.valor = valor;
          this.desconto = desconto;
      }
  
      public double calcularDesconto() {
          return valor * desconto / 100.0;
      }
  
      public double calcularValorComDesconto() {
          return valor - calcularDesconto();
      }
  
      public void imprimirDescontoEValorComDesconto() {
          double desconto = calcularDesconto();
          double valorComDesconto = calcularValorComDesconto();
          System.out.printf("Valor do desconto: R$%.2f\n", desconto);
          System.out.printf("Valor do produto com desconto: R$%.2f\n", valorComDesconto);  






    }
}
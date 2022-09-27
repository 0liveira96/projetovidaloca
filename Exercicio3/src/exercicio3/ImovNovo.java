
package exercicio3;


public class ImovNovo extends Imoveis{
   
    public double getPreco(double preco) {
        double calc = preco + (preco * 10)/100;
        return calc;
    }
}

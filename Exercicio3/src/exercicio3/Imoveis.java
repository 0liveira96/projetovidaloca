package exercicio3;

import java.util.Scanner;

public class Imoveis {

    private int id;
    private String nome;
    private String endereco;
    private double preco;

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getPreco() {
        return preco;
    }

    public void mostraDados() {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o id: ");
        this.setId(teclado.nextInt());
        System.out.println("Digite o nome: ");
        this.setNome(teclado.next());
        System.out.println("Digite o endereco: ");
        this.setEndereco(teclado.next());
        System.out.println("Digite o preco: ");
        this.setPreco(teclado.nextDouble());
    }
}

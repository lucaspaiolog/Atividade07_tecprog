package br.edu.fatecpg.produto.model;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome) {
        this.nome = nome;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public void imprimirInfo() {
        System.out.println("Produto: " + nome + ", Preço: R$" + preco + ", Estoque: " + estoque);
    }
}
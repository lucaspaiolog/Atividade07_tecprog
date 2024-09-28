package br.edu.fatecpg.produto.view;

import br.edu.fatecpg.produto.model.Produto;

public class Main {

    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook");
        Produto p2 = new Produto("Smartphone", 1999.99);
        Produto p3 = new Produto("TV", 2999.99, 50);

        p1.imprimirInfo();
        p2.imprimirInfo();
        p3.imprimirInfo();
    }

}

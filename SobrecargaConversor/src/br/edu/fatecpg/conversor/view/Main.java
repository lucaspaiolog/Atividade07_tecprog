package br.edu.fatecpg.conversor.view;

import br.edu.fatecpg.conversor.model.Conversor;

public class Main {
    public static void main(String[] args) {
        Conversor conversor = new Conversor();

        System.out.println(conversor.converter(25.0));
        System.out.println(conversor.converter(100));
        System.out.println(conversor.converter("hello"));  
    }
}

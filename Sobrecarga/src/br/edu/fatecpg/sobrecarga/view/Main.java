package br.edu.fatecpg.sobrecarga.view;

public class Main {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        System.out.println(calc.somar(1, 2));        
        System.out.println(calc.somar(1, 2, 3));     
        System.out.println(calc.somar(1.5, 2.5));    
    }
}


package br.edu.fatecpg.sobrescrita.view;

import br.edu.fatecpg.sobrescrita.model.Bicicleta;
import br.edu.fatecpg.sobrescrita.model.Carro;
import br.edu.fatecpg.sobrescrita.model.Veiculo;

public class Main {

	public static void main(String[] args) {
		
		//Veiculo veiculo = new Veiculo("Renault");
		Carro meuCarro = new Carro("Renault", "Logan");
		Bicicleta bicicleta = new Bicicleta("Caloi", "Preta");
		
		meuCarro.mover();
		bicicleta.mover();
		
	}

}

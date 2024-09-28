package br.edu.fatecpg.pagamento.view;

import br.edu.fatecpg.pagamento.model.Pagamento;
import br.edu.fatecpg.pagamento.model.PagamentoCartao;
import br.edu.fatecpg.pagamento.model.PagamentoBoleto;


public class Main {

    public static void main(String[] args) {
        Pagamento pagamentoCartao = new PagamentoCartao();
        Pagamento pagamentoBoleto = new PagamentoBoleto();

        pagamentoCartao.processarPagamento();
        pagamentoBoleto.processarPagamento();
    }

}

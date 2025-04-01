package aula3.abstract_factory;

public class PagamentoFisico implements Pagamento {
    @Override
    public void processarPagamento(double valor){
        System.out.println("processando pagamento fisico de R$" + valor);
    }
}
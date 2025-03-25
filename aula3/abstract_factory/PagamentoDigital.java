package aula3.abstract_factory;

public class PagamentoDigital implements Pagamento{
    @Override
    public void processarPagamento(double valor){
        System.out.println("processando pagamento digital de R$"+valor);
    }
}
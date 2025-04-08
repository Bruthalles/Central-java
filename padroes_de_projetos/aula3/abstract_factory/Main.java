package padroes_de_projetos.aula3.abstract_factory;

public class Main {
    public static void main(String[] args) {
        //pedido fisico
        FabricaPedido fabricaFisica = new FabricaPedidoFisico();
        Produto produtoFisico = new Produto("livro fisico",30.0);
        ItemPedido itemFisico = fabricaFisica.criarItemPedido(produtoFisico,2);
        Pagamento pagamentoFisico = fabricaFisica.criarPagamento();
        Entrega entregaFisica = fabricaFisica.criarEntrega();
        double totalFisico = itemFisico.getPreco()+entregaFisica.calcularCustoEntrega();
        System.out.println("total do pedido fisico: R$"+totalFisico);
        pagamentoFisico.processarPagamento(totalFisico);

        //pedido digital
        FabricaPedido fabricaDigital = new FabricaPedidoDigital();
        Produto produtoDigital = new Produto("e-book",20);
        ItemPedido itemDigital = fabricaDigital.criarItemPedido(produtoDigital, 1);
        Pagamento pagamentoDigital = fabricaDigital.criarPagamento();
        Entrega entregaDigital = fabricaDigital.criarEntrega();
        double totalDigital = itemDigital.getPreco() + entregaDigital.calcularCustoEntrega();
        System.out.println("total do pedido digital: R$"+totalDigital);
        pagamentoDigital.processarPagamento(totalDigital);
    }
}


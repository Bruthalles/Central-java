package aula2.factory_method;

public class PedidoOnline extends Pedido{
    @Override
    protected PedidoItem criarItem(Produto produto, int quantidade){
    return new ItemPedidoLojaOnline(produto,quantidade);
    }
}

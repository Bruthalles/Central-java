package exemplo1;

public class PedidoFisico extends Pedido{
    @Override
    protected PedidoItem criarItem(Produto produto, int quantidade){
        return new ItemPedidoLojaFisica(produto, quantidade);
        
    }
}
package padroes_de_projetos.aula2.factory_method;

public class PedidoFisico extends Pedido{
    @Override
    protected PedidoItem criarItem(Produto produto, int quantidade){
        return new ItemPedidoLojaFisica(produto, quantidade);
        
    }
}
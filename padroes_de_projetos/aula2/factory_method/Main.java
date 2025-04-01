package padroes_de_projetos.aula2.factory_method;

public class Main {
    public static void main(String[] args){
        Pedido pedidoLoja = new PedidoFisico();
        pedidoLoja.adicionarItem(new Produto("Caderno",20.0),2);
        pedidoLoja.adicionarItem(new Produto("caneta", 2.0),5);

        System.out.println("itens no pedido da loja fisica:");
        for (PedidoItem item : pedidoLoja.getItens()){
            System.out.print("-"+ item.getProduto().getNome()+ "x"+ item.getQuantidade()+ "=> R$ "+ item.getPreco());
        }
    System.out.println("Total: R$ "+ pedidoLoja.calcularTotal());
    Pedido pedidoOnline = new PedidoOnline();
    pedidoOnline.adicionarItem(new Produto("livro",50.0 ),1 );
    pedidoOnline.adicionarItem(new Produto("mouse",80.0 ), 1);
    System.out.println("Itens no pedido online:");
    for (PedidoItem item : pedidoOnline.getItens()) {
        System.out.println("-" + item.getProduto().getNome() + "x" + item.getQuantidade() + "=> R$" + item.getPreco());

    }
    System.out.println("Total:R$"+  pedidoOnline.calcularTotal());
    }
}

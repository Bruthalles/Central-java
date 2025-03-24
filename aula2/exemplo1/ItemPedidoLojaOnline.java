package exemplo1;

public class ItemPedidoLojaOnline implements PedidoItem{
    private Produto produto;
    private int quantidade;
    private static final double FRETE_FIXO = 10.0;

    public ItemPedidoLojaOnline(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }

    @Override
    public Produto getProduto(){
        return produto;
    }
    @Override
    public int getQuantidade(){
        return quantidade;
    }
    @Override
    public double getPreco(){
        return (produto.getPrecoBase()*quantidade) + FRETE_FIXO;
    }
    
}

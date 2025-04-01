package aula2.factory_method;
import java.util.ArrayList;
import java.util.List;

public abstract class Pedido {
    protected List<PedidoItem> itens = new ArrayList<>();
    protected abstract PedidoItem criarItem (Produto produto, int quantidade);

    public void adicionarItem(Produto produto, int quantidade){
        PedidoItem item = criarItem(produto, quantidade);
        itens.add(item);
    }

    public List<PedidoItem> getItens(){
        return itens;
    }
    public double calcularTotal(){
        double total = 0.0;
        for(PedidoItem item : itens){
            total += item.getPreco();
        }
        return total;
    }
}

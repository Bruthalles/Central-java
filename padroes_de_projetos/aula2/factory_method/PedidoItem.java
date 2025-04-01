package padroes_de_projetos.aula2.factory_method;

public interface PedidoItem{
    Produto getProduto();
    int getQuantidade();
    double getPreco();
}
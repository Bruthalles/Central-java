package padroes_de_projetos.aula3.abstract_factory;

public class EntregaFisica implements Entrega{
    private double taxaEntrega;
    public EntregaFisica(double taxaEntrega){
        this.taxaEntrega = taxaEntrega;
    }
    @Override
    public double calcularCustoEntrega(){
        return taxaEntrega;
    }
}
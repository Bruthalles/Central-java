package padroes_de_projetos.aula3.abstract_factory;

public class EntregaDigital implements Entrega {
    private double taxaEntrega;
    public EntregaDigital(double taxaEntrega){
        this.taxaEntrega = taxaEntrega;
    }
    @Override
    public double calcularCustoEntrega(){
        return taxaEntrega;
    }
}
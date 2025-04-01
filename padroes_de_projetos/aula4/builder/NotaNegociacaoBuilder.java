package padroes_de_projetos.aula4.builder;

public interface NotaNegociacaoBuilder {
    
    void buildCabecalho();
    void buildOperacoes();
    void buildSumario();

    NotaNegociacao getNota();
}

package padroes-de-projetos.aula4.builder;

public interface NotaNegociacaoBuilder {
    
    void buildCabecalho();
    void buildOperacoes();
    void buildSumario();

    NotaNegociacao getNota();
}

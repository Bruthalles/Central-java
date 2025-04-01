package padroes_de_projetos.aula4.builder;

public class NotaNegociacaoDirector {
    private NotaNegociacaoBuilder builder;

    public NotaNegociacaoDirector(NotaNegociacaoBuilder builder){
        this.builder = builder;
    }
    public void construirNota(){
        builder.buildCabecalho();
        builder.buildOperacoes();
        builder.buildSumario();;
    }
}
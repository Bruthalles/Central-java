package padroes_de_projetos.aula4.builder;

public class XlsNotaNegociacaoBuilder implements NotaNegociacaoBuilder{
    private NotaNegociacao nota;
    public XlsNotaNegociacaoBuilder(){
        this.nota = new NotaNegociacao();
    }

    @Override
    public void buildCabecalho(){
        nota.adicionarConteudo("XLS: Cabeçalho da nota");
    }
    @Override
    public void buildOperacoes(){
        nota.adicionarConteudo("XLS: Lista de operacoes");
    }
    @Override
    public void buildSumario(){
        nota.adicionarConteudo("XLS: Sumário com totais e taxas");
    }
    @Override
    public NotaNegociacao getNota(){
        return nota;
    }
}
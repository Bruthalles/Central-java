package padroes-de-projetos.aula4.builder;

public class XmlNotaNegociacaoBuilder implements NotaNegociacaoBuilder{
    private NotaNegociacao nota;
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

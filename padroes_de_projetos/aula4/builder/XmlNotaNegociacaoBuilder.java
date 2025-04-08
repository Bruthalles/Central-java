package padroes_de_projetos.aula4.builder;

public class XmlNotaNegociacaoBuilder implements NotaNegociacaoBuilder{
    private NotaNegociacao nota;
    public XmlNotaNegociacaoBuilder(){
        this.nota = new NotaNegociacao();
    }

@Override
    public void buildCabecalho(){
        nota.adicionarConteudo("<cabecalho> XML: Cabeçalho da nota </cabecalho>");
    }
    @Override
    public void buildOperacoes(){
        nota.adicionarConteudo("<operacoes> XML: Lista de operacoes </operacoes>");
    }
    @Override
    public void buildSumario(){
        nota.adicionarConteudo("<sumario> XML: Sumário com totais e taxas</sumario>");
    }
    @Override
    public NotaNegociacao getNota(){
        return nota;
    }
}
package padroes_de_projetos.aula4.builder;

public class PdfNotaNegociacaoBuilder implements NotaNegociacaoBuilder{
    private NotaNegociacao nota;
    public PdfNotaNegociacaoBuilder(){
        this.nota = new NotaNegociacao();
    }
    @Override 
    public void buildCabecalho(){
        nota.adicionarConteudo("PDF: Cabecalho da Nota");
    }
    @Override
    public void buildOperacoes(){
        nota.adicionarConteudo("PDF: Lista de operações");
    }
    @Override
    public void buildSumario(){
        nota.adicionarConteudo("PDF: Sumario com totais e taxas");
    }
    @Override
    public NotaNegociacao getNota(){
        return nota;
    }
}

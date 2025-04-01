package padroes_de_projetos.aula4.builder;

public class Main {
    public static void  main(String[] args)
    NotaNegociacaoBuilder pdfBuilder = new PdfNotanegociacaoBuilder();
    NotaNegociacaoBuilder director = new NotaNegociacaoDirector(pdfBuilder);
    director.construirNota();
    NotaNegociacao notaPdf = pdfBuilder.getNota();
    System.out.println("Nota em PDF:");
    System.out.println(notaPdf.getConteudo());

    NotaNegociacaoBuilder xmlBuilder = new XmlNotaNegociacaoBuilder();
    director = new NotaNegociacaoDirector(xm)

    NotaNegociacaoBuilder xlsBuilder = new XlsNotaNegociacaoBuilder();
    director = new NotaNegociacaoDirector(xlsBuilder);
    director.construirNota();
    NotaNegociacao notaXls = xlsBuilder.getNota();
    System.out.println("Nota em Xls:");
    System.out.println(notaxls.getConteudo());
}

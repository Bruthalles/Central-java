package aula4.builder;

public class NotaNegociacao {
    private StringBuilder conteudo;

    public NotaNegociacao(){
        this.conteudo = new StringBuilder();
    }

    public void adicionarConteudo(String parte){
        conteudo.append(parte).append("\n");
    }

    public String getConteudo(){
        return conteudo.toString();
    }
}

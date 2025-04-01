package padroes_de_projetos.aula4.prototype;

public abstract class AmbienteConfig implements Cloneable{
    private String url;
    private String usuario;
    private String senha;
    private int timeoutSegundo;
    private boolean logDetalhado;


public AmbienteConfig(String url, String usuario,String senha,int timeoutSegunda, boolean logDetalhado){
        this.url = url;
        this.usuario = usuario;
        this.senha = senha;
        this.timeoutSegundo = timeoutSegundo;
        this.logDetalhado = logDetalhado;
    }
}
//getters e setters->

@Override
public AmbienteConfig clone(){
    try {
        return (AmbienteConfig) super.clone();  
    } catch (CloneNotSupportedException e){
        throw new AssertionError("Clonagem não suportada!",e);
    }
    public abstract void exibirInfo();
}

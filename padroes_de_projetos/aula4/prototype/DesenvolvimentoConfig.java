package padroes_de_projetos.aula4.prototype;

public class ProducaoConfig extends AmbienteConfig{
    public ProducaoConfig(String url,String usuario, String senha, int timeoutSegundos, boolean logDetalhado){
        super(url,usuario,senha,timeoutSegundos,logDetalhado);     
    }

    @Override
    public void exibirInfo(){
        System.out.println("Ambiente de Desenvolvimento:");
        System.out.println();
    }
    
}

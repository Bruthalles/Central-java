package padroes_de_projetos.aula6.bridge;

public class Mensagem {
    private CanalEnvio canal;

    public void Mensagem(CanalEnvio canal){
        this.canal = canal;
    }
    public void enviarMensagem(String texto){
        System.out.println("Mensagem: "+ canal);
    }
}

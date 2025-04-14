package padroes_de_projetos.aula6.adapter;

public class Main {
    public static void main(String[] args) {
        SistemaAntigo old_system = new PagamentoAdapter(SistemaAntigo);
    }
}

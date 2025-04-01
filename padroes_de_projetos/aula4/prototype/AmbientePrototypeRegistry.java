package padroes_de_projetos.aula4.prototype;
import java.util.HashMap;
import java.util.Map;
public class AmbientePrototypeRegistry {
    private static Map<String,AmbienteConfig> prototipos = new HashMap<>();

    static{
        DesenvolvimentoConfig devConfig = new DesenvolvimentoConfig(
            "https://dev.local","devuser","devpass",30,true
        );
        ProducaoConfig prodConfig = new ProducaoConfig(
            "https://prod.suaempresa.com","produser","prodpass",120,false
        );
        prototipos.put("PROD", prodConfig);
    }

    public static AmbienteConfig getPrototipo(String tipo){
        AmbienteConfig config = prototipos.get(tipo);
        if (config != null){
            return config.clone();
        }
        throw new IllegalArgumentException("Protótipo não encontrado: "+ tipo);
    }
}

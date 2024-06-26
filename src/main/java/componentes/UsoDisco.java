package componentes;
import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.Disco;
import com.github.britooo.looca.api.group.discos.Volume;

import java.util.ArrayList;
import java.util.List;

public class UsoDisco {
    private Looca looca;
    private List<Disco> discos;
    private Integer qtdDiscos;
    private List<Volume> listaVolumes;
    private Integer qtdVolumes;
    private List<String> modelosDisco;
    private List<Long> tamanhosDisco;

    public UsoDisco() {
        looca = new Looca();
        capturarInformacoesDiscos();
    }

    public  void capturarInformacoesDiscos(){
        this.discos = looca.getGrupoDeDiscos().getDiscos();
        this.qtdDiscos = looca.getGrupoDeDiscos().getQuantidadeDeDiscos();
        this.listaVolumes = looca.getGrupoDeDiscos().getVolumes();
        this.qtdVolumes = looca.getGrupoDeDiscos().getQuantidadeDeVolumes();
        this.modelosDisco = new ArrayList<>();
        this.tamanhosDisco = new ArrayList<>();

        for (Disco disco : discos){
            this.modelosDisco.add(disco.getModelo());
            this.tamanhosDisco.add(disco.getTamanho());
        }
    }

    public void exibirInformacoesDeDiscos(){
        for (Disco disco : discos) {
            System.out.println(disco);

        }
        System.out.println(modelosDisco);
        System.out.println(tamanhosDisco);
    }

    public List<Disco> getDiscos() {
        return discos;
    }

    public Integer getQtdDiscos() {
        return qtdDiscos;
    }

    public List<Volume> getListaVolumes() {
        return listaVolumes;
    }

    public List<Long> getTamanhosDisco() {
        return tamanhosDisco;
    }

    public Integer getQtdVolumes() {
        return qtdVolumes;
    }

    public List<String> getModelosDisco() {
        return modelosDisco;
    }
}

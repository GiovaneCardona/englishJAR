package componentes;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.janelas.Janela;

import java.util.List;

public class GrupoJanelas {
    private Looca looca;

    public GrupoJanelas() {
        this.looca = new Looca();
    }

    public List<Janela> getJanelas() {
        return looca.getGrupoDeJanelas().getJanelas();
    }

    public List<Janela> getJanelasVisiveis() {
        return looca.getGrupoDeJanelas().getJanelasVisiveis();
    }

    public Integer getTotalJanelas() {
        return looca.getGrupoDeJanelas().getTotalJanelas();
    }

    public Integer getTotalJanelasVisiveis() {
        return looca.getGrupoDeJanelas().getTotalJanelasVisiveis();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n------ Process group ------\n");
        builder.append("Total number of processes").append(getTotalJanelas()).append("\n");
        builder.append("Total number of visible processes").append(getTotalJanelasVisiveis()).append("\n");
        builder.append("\nProcess details\n");
        List<Janela> janelas = getJanelas();
        for (Janela janela : janelas) {
            System.out.println("---- Process ----");
            builder.append(janela).append("\n");
        }
        return builder.toString();
    }
}

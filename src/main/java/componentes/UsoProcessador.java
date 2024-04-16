package componentes;
import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.processador.Processador;

public class UsoProcessador {
    private String nome;
    private String id;
    private String fabricante;
    private Double uso;
    private Long frequencia;
    private String identificador;
    private Integer numeroCpusFisicas;
    private String microarquitetura;
    private Integer numeroCpusLogicas;

    public UsoProcessador() {
        Looca looca = new Looca();
        Processador processador = looca.getProcessador();

        this.nome = processador.getNome();
        this.id = processador.getId();
        this.fabricante = processador.getFabricante();
        this.uso = processador.getUso();
        this.frequencia = processador.getFrequencia();
        this.identificador = processador.getIdentificador();
        this.numeroCpusFisicas = processador.getNumeroCpusFisicas();
        this.numeroCpusLogicas = processador.getNumeroCpusLogicas();
        this.microarquitetura = processador.getMicroarquitetura();
    }

    @Override
    public String toString() {
        return String.format("\n"
                        + "__________________________________\n"
                        + "|   Informações do Processador   |\n"
                        + "|--------------------------------|\n"
                        + "| Fabricante: %s\n"
                        + "| Nome: %s\n"
                        + "| ID: %s\n"
                        + "| Uso: %.2f%%\n"
                        + "| Frequência: %.2f GHz\n"
                        + "| Identificador: %s\n"
                        + "| Número de CPUs Físicas: %d\n"
                        + "| Microarquitetura: %s\n"
                        + "| Número de CPUs Lógicas: %d\n",
                fabricante, nome, id, uso, frequencia / 1e9, identificador, numeroCpusFisicas, microarquitetura, numeroCpusLogicas);
    }

    public String toStringSimplified() {
        return String.format("\n"
                        + "______________________________\n"
                        + "|      Uso do Processador     |\n"
                        + "|-----------------------------|\n"
                        + "| Total (frequecia): %.2f GHz |\n"
                        + "| Uso: %.2f%%                  |\n"
                        + "______________________________\n",
                frequencia / 1e9, uso);
    }

    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public Double getUso() {
        return uso;
    }

    public Long getFrequencia() {
        return frequencia;
    }

    public String getIdentificador() {
        return identificador;
    }

    public Integer getNumeroCpusFisicas() {
        return numeroCpusFisicas;
    }

    public String getMicroarquitetura() {
        return microarquitetura;
    }

    public Integer getNumeroCpusLogicas() {
        return numeroCpusLogicas;
    }
}


import componentes.MemoriaRam;
import componentes.UsoProcessador;
import setup.Logar;

public class App {
    public static void main(String[] args) {
        UsoProcessador processador = new UsoProcessador();
        MemoriaRam memoriaram = new MemoriaRam();
        System.out.println(processador.toStringSimplified());
        System.out.println(memoriaram.toString());

        Logar logar = new Logar();
        logar.logar();

    }
}



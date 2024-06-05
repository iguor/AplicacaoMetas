import java.util.ArrayList;
import java.util.List;

public class ControladorMetas {
    private List<Meta> listaDeMetas;
    private VisualizacaoGrafica grafico;

    public ControladorMetas(VisualizacaoGrafica grafico) {
        this.listaDeMetas = new ArrayList<>();
        this.grafico = grafico;
    }

    public void adicionarMeta(String descricao, int anoInicio, int anoTermino, int valorDesejado, int valorAlcancado) {
        int idNovaMeta = listaDeMetas.size() + 1;
        Meta novaMeta = new Meta(idNovaMeta, descricao, anoInicio, anoTermino, valorDesejado, valorAlcancado);
        listaDeMetas.add(novaMeta);
        grafico.atualizarGrafico(listaDeMetas);
    }
}

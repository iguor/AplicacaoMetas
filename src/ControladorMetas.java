import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ControladorMetas {
    private List<Meta> metas;
    private VisualizacaoGrafica visualizacaoGrafica;

    public ControladorMetas(VisualizacaoGrafica visualizacaoGrafica) {
        this.metas = new ArrayList<>();
        this.visualizacaoGrafica = visualizacaoGrafica;
    }

    public void adicionarMeta(String descricao, LocalDate dataInicio, LocalDate dataTermino, int valorAlcancado) {
        int novoId = metas.size() + 1;
        Meta novaMeta = new Meta(novoId, descricao, dataInicio, dataTermino, valorAlcancado);
        metas.add(novaMeta);
        visualizacaoGrafica.atualizarGrafico(metas);
    }
}

import java.util.List;

public class ControladorMetas {
    private List<Meta> metas;
    private ColetorDados coletor;
    private Visualizacao visualizacao;

    public ControladorMetas(ColetorDados coletor, Visualizacao visualizacao) {
        this.coletor = coletor;
        this.visualizacao = visualizacao;
        this.metas = coletor.collectData();
    }

    public void adicionarMeta(Meta meta) {
        metas.add(meta);
        atualizarVisualizacao();
    }

    public void atualizarVisualizacao() {
        visualizacao.exibirGraficos(metas);
    }

    public List<Meta> getMetas() {
        return metas;
    }
}

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class PainelMetas extends JPanel {
    private List<Meta> metas;
    private JTable table;
    private DefaultTableModel model;

    public PainelMetas(List<Meta> metas) {
        this.metas = metas;
        setLayout(new BorderLayout());
        inicializarTabela();
    }

    private void inicializarTabela() {
        String[] colunas = {"ID", "Descrição", "Ano Início", "Ano Término", "Valor Desejado", "Valor Alcançado", "Progresso"};
        model = new DefaultTableModel(colunas, 0);

        for (Meta meta : metas) {
            adicionarMetaNaTabela(meta);
        }

        table = new JTable(model);
        add(new JScrollPane(table), BorderLayout.CENTER);
    }

    public void adicionarMeta(Meta meta) {
        metas.add(meta);
        adicionarMetaNaTabela(meta);
    }

    private void adicionarMetaNaTabela(Meta meta) {
        Object[] linha = {
                meta.getIdMeta(),
                meta.getDescricao(),
                meta.getAnoInicio(),
                meta.getAnoTermino(),
                meta.getValorDesejado(),
                meta.getValorAlcancado(),
                meta.getProgresso()
        };
        model.addRow(linha);
    }
}

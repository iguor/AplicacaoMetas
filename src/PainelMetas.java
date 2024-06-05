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
        String[] colunas = {"ID", "Descrição", "Data Início", "Data Término", "Progresso"};
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
                meta.getDataInicio(),
                meta.getDataTermino(),
                meta.getProgresso()
        };
        model.addRow(linha);
    }
}

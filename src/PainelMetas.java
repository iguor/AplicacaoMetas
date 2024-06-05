import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class PainelMetas extends JPanel {
    private List<Meta> metas;
    private JTable tabela;
    private DefaultTableModel modelo;

    public PainelMetas(List<Meta> metas) {
        this.metas = metas;
        setLayout(new BorderLayout());
        inicializarTabela();
    }

    private void inicializarTabela() {
        String[] colunas = {"ID", "Descrição", "Ano Início", "Ano Término", "Valor Desejado", "Valor Alcançado", "Progresso"};
        modelo = new DefaultTableModel(colunas, 0);

        for (Meta meta : metas) {
            adicionarMetaNaTabela(meta);
        }

        tabela = new JTable(modelo);
        add(new JScrollPane(tabela), BorderLayout.CENTER);
    }

    private void adicionarMetaNaTabela(Meta meta) {
        Object[] linha = {
                meta.getId(),
                meta.getDescricao(),
                meta.getAnoInicio(),
                meta.getAnoTermino(),
                meta.getValorDesejado(),
                meta.getValorAlcancado(),
                meta.getProgresso()
        };
        modelo.addRow(linha);
    }
}

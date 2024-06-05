import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.List;

public class MainFrame extends JFrame {
    private List<Meta> metas;
    private ControladorMetas controlador;

    public MainFrame() {
        setTitle("Sistema de Monitoramento de Metas ESG");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        ColetorDados coletor = new ColetorDados();
        VisualizacaoGrafica visualizacao = new VisualizacaoGrafica();
        controlador = new ControladorMetas(coletor, visualizacao);

        inicializarUI(visualizacao);
        controlador.atualizarVisualizacao();
    }

    private void inicializarUI(Visualizacao visualizacao) {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenuItem sairItem = new JMenuItem("Sair");
        sairItem.addActionListener(e -> System.exit(0));
        menu.add(sairItem);
        menuBar.add(menu);
        setJMenuBar(menuBar);

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Metas", new PainelMetas(controlador.getMetas()));
        tabbedPane.addTab("Gráficos", (Component) visualizacao);
        add(tabbedPane, BorderLayout.CENTER);

        JPanel formPanel = criarPainelFormulario();
        add(formPanel, BorderLayout.SOUTH);
    }

    private JPanel criarPainelFormulario() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        JTextField idField = new JTextField();
        JTextField descricaoField = new JTextField();
        JTextField dataInicioField = new JTextField();
        JTextField dataTerminoField = new JTextField();
        JTextField progressoField = new JTextField();

        panel.add(new JLabel("ID:"));
        panel.add(idField);
        panel.add(new JLabel("Descrição:"));
        panel.add(descricaoField);
        panel.add(new JLabel("Data Início (AAAA-MM-DD):"));
        panel.add(dataInicioField);
        panel.add(new JLabel("Data Término (AAAA-MM-DD):"));
        panel.add(dataTerminoField);
        panel.add(new JLabel("Progresso (%):"));
        panel.add(progressoField);

        JButton addButton = new JButton("Adicionar Meta");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(idField.getText());
                String descricao = descricaoField.getText();
                LocalDate dataInicio = LocalDate.parse(dataInicioField.getText());
                LocalDate dataTermino = LocalDate.parse(dataTerminoField.getText());
                double progresso = Double.parseDouble(progressoField.getText());

                Meta meta = new Meta(id, descricao, dataInicio, dataTermino, progresso);
                controlador.adicionarMeta(meta);

                idField.setText("");
                descricaoField.setText("");
                dataInicioField.setText("");
                dataTerminoField.setText("");
                progressoField.setText("");
            }
        });

        panel.add(addButton);

        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainFrame frame = new MainFrame();
            frame.setVisible(true);
        });
    }
}

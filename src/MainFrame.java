import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private ControladorMetas controlador;
    private VisualizacaoGrafica visualizacao;

    public MainFrame() {
        setTitle("Gerenciamento de Metas ESG");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        visualizacao = new VisualizacaoGrafica();
        controlador = new ControladorMetas(visualizacao);

        InterfaceMetas interfaceMetas = new InterfaceMetas(controlador);

        setLayout(new BorderLayout());
        add(interfaceMetas.getGrafico(), BorderLayout.NORTH);
        add(visualizacao, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainFrame mainFrame = new MainFrame();
            mainFrame.setVisible(true);
        });
    }
}

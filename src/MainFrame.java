import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private ControladorMetas controlador;
    private VisualizacaoGrafica grafico;

    public MainFrame() {
        setTitle("Gerenciamento de Metas ESG");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        grafico = new VisualizacaoGrafica();
        controlador = new ControladorMetas(grafico);

        InterfaceMetas interfaceMetas = new InterfaceMetas(controlador);

        setLayout(new BorderLayout());
        add(interfaceMetas.getPainel(), BorderLayout.NORTH);
        add(grafico, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainFrame mainFrame = new MainFrame();
            mainFrame.setVisible(true);
        });
    }
}

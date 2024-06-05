import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class InterfaceMetas {
    private ControladorMetas controlador;
    private JTextField descricaoField;
    private JTextField dataInicioField;
    private JTextField dataTerminoField;
    private JTextField valorAlcancadoField;
    private JPanel panel;

    public InterfaceMetas(ControladorMetas controlador) {
        this.controlador = controlador;
        panel = new JPanel(new GridLayout(5, 2));

        panel.add(new JLabel("Descrição da Meta:"));
        descricaoField = new JTextField();
        panel.add(descricaoField);

        panel.add(new JLabel("Data Início (YYYY-MM-DD):"));
        dataInicioField = new JTextField();
        panel.add(dataInicioField);

        panel.add(new JLabel("Data Término (YYYY-MM-DD):"));
        dataTerminoField = new JTextField();
        panel.add(dataTerminoField);

        panel.add(new JLabel("Valor Alcançado:"));
        valorAlcancadoField = new JTextField();
        panel.add(valorAlcancadoField);

        JButton addButton = new JButton("Adicionar Meta");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarMeta();
            }
        });
        panel.add(addButton);
    }

    public JPanel getPanel() {
        return panel;
    }

    private void adicionarMeta() {
        String descricao = descricaoField.getText();
        LocalDate dataInicio = LocalDate.parse(dataInicioField.getText());
        LocalDate dataTermino = LocalDate.parse(dataTerminoField.getText());
        int valorAlcancado = Integer.parseInt(valorAlcancadoField.getText());

        controlador.adicionarMeta(descricao, dataInicio, dataTermino, valorAlcancado);
    }
}

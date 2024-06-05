import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceMetas {
    private ControladorMetas controlador;
    private JTextField descricaoField;
    private JTextField anoInicioField;
    private JTextField anoTerminoField;
    private JTextField valorDesejadoField;
    private JTextField valorAlcancadoField;
    private JPanel panel;

    public InterfaceMetas(ControladorMetas controlador) {
        this.controlador = controlador;
        panel = new JPanel(new GridLayout(6, 2));

        panel.add(new JLabel("Descrição da Meta:"));
        descricaoField = new JTextField();
        panel.add(descricaoField);

        panel.add(new JLabel("Ano Início:"));
        anoInicioField = new JTextField();
        panel.add(anoInicioField);

        panel.add(new JLabel("Ano Término:"));
        anoTerminoField = new JTextField();
        panel.add(anoTerminoField);

        panel.add(new JLabel("Valor Desejado:"));
        valorDesejadoField = new JTextField();
        panel.add(valorDesejadoField);

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
        try {
            String descricao = descricaoField.getText();
            int anoInicio = Integer.parseInt(anoInicioField.getText());
            int anoTermino = Integer.parseInt(anoTerminoField.getText());
            int valorDesejado = Integer.parseInt(valorDesejadoField.getText());
            int valorAlcancado = Integer.parseInt(valorAlcancadoField.getText());

            controlador.adicionarMeta(descricao, anoInicio, anoTermino, valorDesejado, valorAlcancado);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(panel, "Por favor, insira valores numéricos válidos.", "Erro de Formato", JOptionPane.ERROR_MESSAGE);
        }
    }
}

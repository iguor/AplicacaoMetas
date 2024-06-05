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
    private JPanel grafico;

    public InterfaceMetas(ControladorMetas controlador) {
        this.controlador = controlador;
        grafico = new JPanel(new GridLayout(6, 2));

        grafico.add(new JLabel("Descrição da Meta:"));
        descricaoField = new JTextField();
        grafico.add(descricaoField);

        grafico.add(new JLabel("Ano Início:"));
        anoInicioField = new JTextField();
        grafico.add(anoInicioField);

        grafico.add(new JLabel("Ano Término:"));
        anoTerminoField = new JTextField();
        grafico.add(anoTerminoField);

        grafico.add(new JLabel("Valor Desejado:"));
        valorDesejadoField = new JTextField();
        grafico.add(valorDesejadoField);

        grafico.add(new JLabel("Valor Alcançado:"));
        valorAlcancadoField = new JTextField();
        grafico.add(valorAlcancadoField);

        JButton addButton = new JButton("Adicionar Meta");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarMeta();
            }
        });
        grafico.add(addButton);
    }

    public JPanel getGrafico() {
        return grafico;
    }

    private void adicionarMeta() {
        try {
            String descricao = descricaoField.getText();
            int anoInicio = Integer.parseInt(anoInicioField.getText());
            int anoTermino = Integer.parseInt(anoTerminoField.getText());
            int valorDesejado = Integer.parseInt(valorDesejadoField.getText());
            int valorAlcancado = Integer.parseInt(valorAlcancadoField.getText());

            controlador.adicionarMeta(descricao, anoInicio, anoTermino, valorDesejado, valorAlcancado);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(grafico, "Insira valores numéricos inteiros válidos.", "Erro formatação dos números", JOptionPane.ERROR_MESSAGE);
        }
    }
}

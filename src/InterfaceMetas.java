import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceMetas {
    private ControladorMetas controlador;
    private JTextField descricaoField;
    private JTextField anoInicioField;
    private JTextField anoTerminoField;
    private JTextField porcentagemDesejadaField;
    private JTextField porcentagemAlcancadaField;
    private JPanel painel;

    public InterfaceMetas(ControladorMetas controlador) {
        this.controlador = controlador;
        painel = new JPanel(new GridLayout(6, 2));

        painel.add(new JLabel("Descrição da Meta:"));
        descricaoField = new JTextField();
        painel.add(descricaoField);

        painel.add(new JLabel("Ano Início:"));
        anoInicioField = new JTextField();
        painel.add(anoInicioField);

        painel.add(new JLabel("Ano Término:"));
        anoTerminoField = new JTextField();
        painel.add(anoTerminoField);

        painel.add(new JLabel("Porcentagem Desejada:"));
        porcentagemDesejadaField = new JTextField();
        painel.add(porcentagemDesejadaField);

        painel.add(new JLabel("Porcentagem Alcançada:"));
        porcentagemAlcancadaField = new JTextField();
        painel.add(porcentagemAlcancadaField);

        JButton addButton = new JButton("Adicionar Meta");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarMeta();
            }
        });
        painel.add(addButton);
    }

    public JPanel getPainel() {
        return painel;
    }

    private void adicionarMeta() {
        try {
            String descricao = descricaoField.getText();
            int anoInicio = Integer.parseInt(anoInicioField.getText());
            int anoTermino = Integer.parseInt(anoTerminoField.getText());
            int valorDesejado = Integer.parseInt(porcentagemDesejadaField.getText());
            int valorAlcancado = Integer.parseInt(porcentagemAlcancadaField.getText());

            controlador.adicionarMeta(descricao, anoInicio, anoTermino, valorDesejado, valorAlcancado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(painel, "Insira valores numéricos inteiros válidos.", "Erro de Formatação", JOptionPane.ERROR_MESSAGE);
        }
    }
}

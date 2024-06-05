import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class VisualizacaoGrafica extends JPanel {
    private DefaultCategoryDataset dataset;

    public VisualizacaoGrafica() {
        dataset = new DefaultCategoryDataset();
        JFreeChart barChart = ChartFactory.createBarChart("Progresso das Metas ESG", "Meta", "Valor", dataset, PlotOrientation.VERTICAL, true, true, false);

        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new Dimension(700, 400));
        add(chartPanel);
    }

    public void atualizarGrafico(List<Meta> metas) {
        dataset.clear();
        for (Meta meta : metas) {
            dataset.addValue(meta.getValorDesejado(), "Valor Desejado", meta.getDescricao());
            dataset.addValue(meta.getValorAlcancado(), "Valor Alcançado", meta.getDescricao());
        }
    }
}

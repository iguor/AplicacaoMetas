import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class VisualizacaoGrafica extends JPanel implements Visualizacao {

    public VisualizacaoGrafica() {
        setLayout(new BorderLayout());
    }

    @Override
    public void exibirGraficos(List<Meta> metas) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (Meta meta : metas) {
            dataset.addValue(meta.getProgresso(), "Progresso", meta.getDescricao());
        }

        JFreeChart barChart = ChartFactory.createBarChart(
                "Progresso das Metas ESG",
                "Meta",
                "Progresso (%)",
                dataset,
                PlotOrientation.VERTICAL,
                false, true, false);

        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new Dimension(800, 600));

        removeAll();
        add(chartPanel, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
}

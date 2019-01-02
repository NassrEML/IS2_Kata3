package kata3;

import org.jfree.ui.ApplicationFrame;
import org.jfree.chart.ChartPanel;
import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * @author NassrEML
 */

public class HistogramDisplay extends ApplicationFrame{
    
    private DefaultCategoryDataset dataSet;
    
    public HistogramDisplay() {
        super("HISTOGRAMA");
        setContentPane(createPanel());
        pack();
    }
    
    public void execute(){
        setVisible(true);
    }
    
    private ChartPanel createPanel(){
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart = 
                ChartFactory.createBarChart("Histograma JFreeChart", 
                        "Dominios email", "Nº de emails", dataSet, 
                        PlotOrientation.VERTICAL, false, false, 
                        rootPaneCheckingEnabled);
        return chart;
    }
    
    private DefaultCategoryDataset createDataset(){
        dataSet = new DefaultCategoryDataset();
        dataSet.addValue(6, "", "ulpgc.es");
        dataSet.addValue(7, "", "google.es");
        dataSet.addValue(8, "", "yahoo.es");
        dataSet.addValue(9, "", "docker.com");
        return dataSet;
    }
}

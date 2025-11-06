package com.miapp;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import javax.swing.*;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.util.List;

public class GraficarTablas {

    // Método para leer una tabla CSV y devolver dataset para x(t) o v(t)
    private static XYSeriesCollection leerTabla(String nombreArchivo, String variable) throws IOException, CsvException {
        XYSeries series = new XYSeries(variable + " (" + nombreArchivo + ")");
        try (CSVReader reader = new CSVReader(new FileReader(nombreArchivo))) {
            List<String[]> datos = reader.readAll(); // Ahora CsvException es declarado
            for (int i = 1; i < datos.size(); i++) {
                double t = Double.parseDouble(datos.get(i)[0]);
                double valor = Double.parseDouble(datos.get(i)[variable.equals("x") ? 1 : 2]);
                series.add(t, valor);
            }
        }
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);
        return dataset;
    }

    // Crear y guardar una gráfica
    private static void crearGrafica(XYSeriesCollection dataset, String titulo, String ejeY, String salida) throws IOException {
        JFreeChart chart = ChartFactory.createXYLineChart(
                titulo, "t [s]", ejeY, dataset
        );

        // Guardar como imagen
        ChartUtils.saveChartAsPNG(new File(salida), chart, 800, 600);

        // Mostrar en ventana (opcional)
        JFrame frame = new JFrame(titulo);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new ChartPanel(chart));
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        try {
            // Tablas a graficar
            String[] archivos = {"tabla1.csv", "tabla2.csv", "tabla3.csv"};

            for (String archivo : archivos) {
                // Graficar x(t)
                XYSeriesCollection datasetX = leerTabla(archivo, "x");
                crearGrafica(datasetX, "Posición x(t) - " + archivo, "x [m]", archivo.replace(".csv", "_x.png"));

                // Graficar v(t)
                XYSeriesCollection datasetV = leerTabla(archivo, "v");
                crearGrafica(datasetV, "Velocidad v(t) - " + archivo, "v [m/s]", archivo.replace(".csv", "_v.png"));
            }

            System.out.println("✅ Gráficas creadas y guardadas como imágenes PNG.");

        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
    }
}


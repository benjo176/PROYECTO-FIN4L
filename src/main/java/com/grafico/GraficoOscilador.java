package com.grafico;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class GraficoOscilador {

    public static void main(String[] args) {

        // Valores que debe darte Persona 1
        double k = 9.875; // constante elástica (ejemplo, reemplazar)

        // Masa 9m
        double mBase = 1;  // reemplazar por la masa base usada en la práctica
        double m9 = 9 * mBase;

        // Frecuencia angular
        double w = Math.sqrt(k / m9);

        // Amplitud 
        double A = 0.1;

        // Crear la serie de datos
        XYSeries serie = new XYSeries("Movimiento Oscilatorio");

        for (double t = 0; t <= 20; t += 0.01) {
            double x = A * Math.cos(w * t);
            serie.add(t, x);
        }

        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(serie);

        // Crear el gráfico
        JFreeChart chart = ChartFactory.createXYLineChart(
                "Movimiento Oscilatorio con masa 9m",
                "Tiempo (s)",
                "Posición (m)",
                dataset
        );

        // Mostrar el gráfico
        ChartFrame frame = new ChartFrame("Gráfico Oscilador", chart);
        frame.pack();
        frame.setVisible(true);
    }
}

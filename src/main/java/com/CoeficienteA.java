package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CoeficienteA {

    public static void main(String[] args) {
        String file = "tablammc1.csv"; // ruta a tu CSV
        List<Double> xs = new ArrayList<>();
        List<Double> ys = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            br.readLine(); // Saltar encabezado
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                xs.add(Double.parseDouble(parts[0])); // t
                ys.add(Double.parseDouble(parts[1])); // v
            }
        } catch (Exception e) {
            System.out.println("Error leyendo archivo: " + e.getMessage());
            return;
        }

        double A = calcularA(xs, ys);
        System.out.println("Coeficiente A = " + A);
    }

    public static double calcularA(List<Double> xs, List<Double> ys) {
        int n = xs.size();

        double sumX = 0, sumY = 0, sumXY = 0, sumX2 = 0;

        for (int i = 0; i < n; i++) {
            double x = xs.get(i);
            double y = ys.get(i);

            sumX += x;
            sumY += y;
            sumXY += x * y;
            sumX2 += x * x;
        }

        // Fórmula del coeficiente A del MMC
        return (n * sumXY - sumX * sumY) / (n * sumX2 - sumX * sumX);
    }
}

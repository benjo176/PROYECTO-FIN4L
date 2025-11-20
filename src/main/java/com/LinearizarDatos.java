package com;

import java.io.*;
import java.util.*;

public class LinearizarDatos {

    public static void main(String[] args) {

        // Ruta del CSV original
        String filePath = "src/main/resources/tabla1.csv";

        List<Double> tList = new ArrayList<>();
        List<Double> xList = new ArrayList<>();

        // Leer CSV
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine(); // saltar encabezado
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                tList.add(Double.parseDouble(values[0].trim()));
                xList.add(Double.parseDouble(values[1].trim()));
            }
        } catch (IOException e) {
            System.err.println("Error leyendo el CSV: " + e.getMessage());
            return;
        }

        // Estimación inicial de A
        double A = Collections.max(xList);

        // Linearizar: y = arcsin(x / A)
        List<Double> yList = new ArrayList<>();
        for (double x : xList) {
            yList.add(Math.asin(x / A));
        }

        // Guardar CSV linearizado
        String outputFile = "src/main/resources/tabla1_linearizada.csv";
        try (PrintWriter pw = new PrintWriter(new FileWriter(outputFile))) {
            pw.println("t,y_linearizado");
            for (int i = 0; i < tList.size(); i++) {
                pw.println(tList.get(i) + "," + yList.get(i));
            }
        } catch (IOException e) {
            System.err.println("Error escribiendo el CSV linearizado: " + e.getMessage());
        }

        System.out.println("Datos linearizados guardados en: " + outputFile);
    }
}

package com;

public class Coeficientes {

    public static double calcularB(double[] x, double[] y) {
        int n = x.length;
        double sumX = 0, sumY = 0, sumXY = 0, sumX2 = 0;

        for (int i = 0; i < n; i++) {
            sumX += x[i];
            sumY += y[i];
            sumXY += x[i] * y[i];
            sumX2 += x[i] * x[i];
        }

        return (n * sumXY - sumX * sumY) / (n * sumX2 - sumX * sumX);
    }

    public static double calcularA(double[] x, double[] y) {
        int n = x.length;
        double sumX = 0, sumY = 0;

        for (int i = 0; i < n; i++) {
            sumX += x[i];
            sumY += y[i];
        }

        double B = calcularB(x, y);
        double promX = sumX / n;
        double promY = sumY / n;

        return promY - B * promX;
    }

    // ============================
    //   ERRORES DE A Y B
    // ============================

    public static double errorB(double[] x, double[] y) {
        int n = x.length;
        double B = calcularB(x, y);
        double A = calcularA(x, y);

        double sumResid = 0;
        double sumX = 0;
        for (double xi : x) sumX += xi;
        double promX = sumX / n;

        double sumXX = 0;
        for (double xi : x) sumXX += (xi - promX) * (xi - promX);

        for (int i = 0; i < n; i++) {
            double pred = A + B * x[i];
            sumResid += (y[i] - pred) * (y[i] - pred);
        }

        double s = Math.sqrt(sumResid / (n - 2));
        return s / Math.sqrt(sumXX);
    }

    public static double errorA(double[] x, double[] y) {
        int n = x.length;

        double B = calcularB(x, y);
        double A = calcularA(x, y);

        double sumResid = 0;
        double sumX = 0;
        for (double xi : x) sumX += xi;
        double promX = sumX / n;

        double sumXX = 0;
        for (double xi : x) sumXX += (xi - promX) * (xi - promX);

        for (int i = 0; i < n; i++) {
            double pred = A + B * x[i];
            sumResid += (y[i] - pred) * (y[i] - pred);
        }

        double s = Math.sqrt(sumResid / (n - 2));
        return s * Math.sqrt((1.0 / n) + (promX * promX) / sumXX);
    }
}

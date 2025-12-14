import java.util.List;

public class CoeficienteB {

    public static double calcularB(List<Double> xs, List<Double> ys) {

        int n = xs.size();

        double sumX = 0;
        double sumY = 0;
        double sumXY = 0;
        double sumX2 = 0;

        for (int i = 0; i < n; i++) {
            double x = xs.get(i);
            double y = ys.get(i);

            sumX += x;
            sumY += y;
            sumXY += x * y;
            sumX2 += x * x;
        }

        double numerador = n * sumXY - (sumX * sumY);
        double denominador = n * sumX2 - (sumX * sumX);

        return numerador / denominador;
    }
}
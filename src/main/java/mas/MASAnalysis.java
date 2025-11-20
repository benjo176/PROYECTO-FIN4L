package mas;

public class MASAnalysis {

    public static class Result {
        public double A;
        public double B;
        public double errorA;
        public double errorB;
    }

    public static Result ajusteLineal(double[] x, double[] y) {

        int n = x.length;

        double sumX = 0, sumY = 0, sumXY = 0, sumX2 = 0;

        for (int i = 0; i < n; i++) {
            sumX += x[i];
            sumY += y[i];
            sumXY += x[i] * y[i];
            sumX2 += x[i] * x[i];
        }

        double B = (n * sumXY - sumX * sumY) / (n * sumX2 - sumX * sumX);
        double A = (sumY - B * sumX) / n;

        Result r = new Result();
        r.A = A;
        r.B = B;

        return r;
    }

    public static void main(String[] args) {
        double[] x = {1,2,3,4};
        double[] y = {2,3,5,7};

        Result r = ajusteLineal(x, y);
        System.out.println("A = " + r.A);
        System.out.println("B = " + r.B);
    }
}

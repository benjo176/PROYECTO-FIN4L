
public class CalculoCoefB
{
    private double[] x;
    private double[] y;

    public CalculoCoefB(double[] x, double[] y)
    {
        this.x = x;
        this.y = y;
    }

    public double calcularB()
    {
        int n = x.length;

        double sumaX = 0;
        double sumaY = 0;
        double sumaXY = 0;
        double sumaX2 = 0;

        for (int i = 0; i < n; i++)
        {
            sumaX += x[i];
            sumaY += y[i];
            sumaXY += x[i] * y[i];
            sumaX2 += x[i] * x[i];
        }

        double numerador = (n * sumaXY) - (sumaX * sumaY);
        double denominador = (n * sumaX2) - (sumaX * sumaX);

        return numerador / denominador;
    }
}
public class Main
{
    public static void main(String[] args)
    {
        double[] x = {1, 2, 3, 4};
        double[] y = {2, 3, 5, 7};

        CalculoCoefB calc = new CalculoCoefB(x, y);
        double B = calc.calcularB();

        System.out.println("Coeficiente B: " + B);
    }
}
package com;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CoeficienteBTest {

    @Test
    public void testCalculoB() {
        double[] x = {0, 1, 3, 4, 5};
        double[] y = {1, 2, 4, 5, 6};

        double resultado = Coeficientes.calcularB(x, y);
        assertEquals(1.0, resultado, 0.0001);
    }

    @Test
    public void testErrorB() {
        double[] x = {0, 1, 3, 4, 5};
        double[] y = {1, 2, 4, 5, 6};

        double errB = Coeficientes.errorB(x, y);

        // valor aproximado
        assertEquals(0.0280, errB, 0.001);
    }
}

package com;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CoeficienteATest {

    @Test
    public void testCalculoAConMisDatos() {

        double[] x = {0, 1, 3, 4, 5};
        double[] y = {1, 2, 4, 5, 6};

        double resultado = CoeficienteA.calcularA(x, y);

        assertEquals(1.0, resultado, 0.0001);
    }
}

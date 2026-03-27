package com;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CoeficienteATest {

    @Test
    public void testCalculoA() {
        double[] x = {0, 1, 3, 4, 5};
        double[] y = {1, 2, 4, 5, 6};

        double resultado = Coeficientes.calcularA(x, y);
        assertEquals(1.0, resultado, 0.0001);
    }

    @Test
    public void testErrorA() {
        double[] x = {0, 1, 3, 4, 5};
        double[] y = {1, 2, 4, 5, 6};

        double errA = Coeficientes.errorA(x, y);
        
        // valor esperado (aprox)
        assertEquals(0.1240, errA, 0.001);
    }
}

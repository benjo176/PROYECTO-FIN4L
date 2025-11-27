package com;

import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;

public class CoeficienteATest {

    @Test
    public void testCalcularA() {
        var xs = Arrays.asList(0.0, 0.2, 0.4, 0.6, 0.8, 1.0);
        var ys = Arrays.asList(0.0, -0.485, -0.996, -1.271, -1.494, -1.571);

        double A = CoeficienteA.calcularA(xs, ys);

        assertEquals(-1.5938571428571422, A, 0.0001); // Ajusta el valor según resultado
    }
}

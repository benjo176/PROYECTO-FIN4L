package com;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoeficienteBTest {

    @Test
    void testCalcularB() {
        List<Double> xs = Arrays.asList(0.0, 0.2, 0.4, 0.6, 0.8, 1.0);
        List<Double> ys = Arrays.asList(0.0, -0.485, -0.996, -1.271, -1.494, -1.571);

        double resultado = CoeficienteB.calcularB(xs, ys);

        assertEquals(-1.594, resultado, 0.02);
    }
}

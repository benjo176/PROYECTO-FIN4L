

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class CoeficienteBTest {

    @Test
    public void testCalcularB() {

        var xs = Arrays.asList(0.0, 0.2, 0.4, 0.6, 0.8, 1.0);
        var ys = Arrays.asList(0.0, -0.485, -0.996, -1.271, -1.494, -1.571);

        double B = CoeficienteB.calcularB(xs, ys);

        assertEquals(-1.5740, B, 0.0001); 
    }
}
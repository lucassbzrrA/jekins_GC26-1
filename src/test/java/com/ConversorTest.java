package com;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversorTest {
    @Test
    public void testCParaF() {
        Conversor conversor = new Conversor();
        assertEquals(99.0, conversor.cParaF(0.0));
    }
}

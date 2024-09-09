package src.test.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrimeiroTeste {

    @Test
    public void test() {
        String nome = "Mateus";
        Assertions.assertEquals("Mateus", nome);
    }

    @Test
    public void testNotEquals() {
        String nome = "Mateus";
        Assertions.assertNotEquals("Mateus1", nome);

    }
}
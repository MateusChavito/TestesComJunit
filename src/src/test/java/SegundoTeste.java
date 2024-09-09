package src.test.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SegundoTeste {

    @Test
    public void test() {
        String nome = "Mateus";
        Assertions.assertEquals("Mateus", nome);
    }
}

package src.test.java;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import src.main.java.TesteCliente;

public class TesteClienteTest {

    @Test
    public void testeClasseCliente(){
        TesteCliente cli = new TesteCliente();
        cli.setNome("Mateus");

        Assert.assertEquals("Mateus", cli.getNome());
    }

}

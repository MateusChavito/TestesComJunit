package src.test.java;


import org.junit.Assert;
import org.junit.jupiter.api.Test;
import src.com.mateus.dao.ClienteDao;
import src.com.mateus.dao.ClienteDaoMock;
import src.com.mateus.service.ClienteService;

import static org.junit.Assert.assertThrows;

public class ClienteServiceTest {

    @Test
    public void salvarTest(){
        ClienteDaoMock mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);

    }

    @Test
    public void esperadoErroNosalvarTest() {
        ClienteDao mockDao = new ClienteDao();
        ClienteService service = new ClienteService(mockDao);

        // Verifica se a exceção UnsupportedOperationException é lançada
        assertThrows(UnsupportedOperationException.class, () -> {
            service.salvar();
        });
    }
}

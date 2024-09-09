package src.test.java;

import org.junit.jupiter.api.Test;
import src.com.mateus.dao.ContratoDao;
import src.com.mateus.service.ContratoService;
import src.com.mateus.service.IContratoService;

import static org.junit.jupiter.api.Assertions.*;

class ContratoServiceTest {

    @Test
    void salvarTest() {
        ContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        assertEquals("Contrato salvo com sucesso!", retorno);
    }

    @Test
    void buscarTest() {
        ContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.buscar();
        assertEquals("Contrato encontrado", retorno);
    }

    @Test
    void excluirTest() {
        ContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        boolean retorno = service.excluir();
        assertTrue(retorno);
    }

    @Test
    void atualizarTest() {
        ContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.atualizar();
        assertEquals("Contrato atualizado", retorno);
    }
}

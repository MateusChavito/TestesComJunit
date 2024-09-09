package src.com.mateus.service;

import src.com.mateus.dao.IContratoDao;

public class ContratoService implements IContratoService {

    private final IContratoDao contratoDao;

    public ContratoService(IContratoDao contratoDao) {
        this.contratoDao = contratoDao;
    }

    @Override
    public String salvar() {
        return contratoDao.salvar();
    }

    @Override
    public String buscar() {
        return contratoDao.buscar();
    }

    @Override
    public boolean excluir() {
        return contratoDao.excluir();
    }

    @Override
    public String atualizar() {
        return contratoDao.atualizar();
    }
}

package src.com.mateus.service;

import src.com.mateus.dao.ClienteDao;
import src.com.mateus.dao.IClienteDao;

public class ClienteService {

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao){
       // clienteDao = new ClienteDao();
        this.clienteDao = clienteDao;
    }

    public String salvar(){
        clienteDao.salvar();
        return "Sucesso";

    }
}

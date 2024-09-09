package src.com.mateus.dao;

public class ContratoDao implements IContratoDao {

    @Override
    public String salvar() {
        // Lógica de salvar no banco de dados
        return "Contrato salvo com sucesso!";
    }

    @Override
    public String buscar() {
        // Lógica de buscar no banco de dados
        return "Contrato encontrado";
    }

    @Override
    public boolean excluir() {
        // Lógica de excluir do banco de dados
        return true;
    }

    @Override
    public String atualizar() {
        // Lógica de atualizar no banco de dados
        return "Contrato atualizado";
    }
}

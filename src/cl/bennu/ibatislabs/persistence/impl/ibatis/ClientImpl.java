package cl.bennu.ibatislabs.persistence.impl.ibatis;

import cl.bennu.ibatislabs.commons.dto.ClientDTO;
import cl.bennu.ibatislabs.persistence.IbatisUtils;
import cl.bennu.ibatislabs.persistence.dao.IClientDAO;

import java.util.List;

public class ClientImpl extends IbatisUtils implements IClientDAO {

    public List getAll() throws Exception {
        return getSqlMapClient().queryForList("getAllClient", null);
    }

    public ClientDTO getById(Long id) throws Exception {
        return (ClientDTO) getSqlMapClient().queryForObject("getClientById", id);
    }

    public void insert(ClientDTO clientDTO) throws Exception {
        Long id = (Long) getSqlMapClient().insert("insertClient", clientDTO);
        clientDTO.setId(id);
    }

    public void update(ClientDTO clientDTO) throws Exception {
        getSqlMapClient().update("updateClient", clientDTO);
    }

    public void delete(Long id) throws Exception {
        getSqlMapClient().delete("deleteClient", id);
    }
}

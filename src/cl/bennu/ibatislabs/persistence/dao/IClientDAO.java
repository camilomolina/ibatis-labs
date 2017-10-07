package cl.bennu.ibatislabs.persistence.dao;

import cl.bennu.ibatislabs.commons.dto.ClientDTO;

import java.util.List;

public interface IClientDAO {

    List getAll() throws Exception;

    ClientDTO getById(Long id) throws Exception;

    void insert(ClientDTO areaDTO) throws Exception;

    void update(ClientDTO areaDTO) throws Exception;

    void delete(Long id) throws Exception;

}
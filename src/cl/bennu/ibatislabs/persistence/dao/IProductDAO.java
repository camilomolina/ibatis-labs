package cl.bennu.ibatislabs.persistence.dao;

import cl.bennu.ibatislabs.commons.dto.ProductDTO;

import java.util.List;

public interface IProductDAO {

    List getAll() throws Exception;

    List getAllSummary() throws Exception;

    ProductDTO getById(Long id) throws Exception;

    void insert(ProductDTO productDTO) throws Exception;

    void update(ProductDTO productDTO) throws Exception;

    void delete(Long id) throws Exception;

}

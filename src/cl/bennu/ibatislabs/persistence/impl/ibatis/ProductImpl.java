package cl.bennu.ibatislabs.persistence.impl.ibatis;

import cl.bennu.ibatislabs.commons.dto.ProductDTO;
import cl.bennu.ibatislabs.persistence.IbatisUtils;
import cl.bennu.ibatislabs.persistence.dao.IProductDAO;

import java.util.List;

public class ProductImpl extends IbatisUtils implements IProductDAO {


    public List getAll() throws Exception {
        return getSqlMapClient().queryForList("getAllProduct", null);
    }

    public List getAllSummary() throws Exception {
        return getSqlMapClient().queryForList("getAllProductSummary", null);
    }

    public ProductDTO getById(Long id) throws Exception {
        return (ProductDTO) getSqlMapClient().queryForObject("getProductById", id);
    }

    public void insert(ProductDTO productDTO) throws Exception {
        Long id = (Long) getSqlMapClient().insert("insertProduct", productDTO);
        productDTO.setId(id);
    }

    public void update(ProductDTO productDTO) throws Exception {
        getSqlMapClient().update("updateProduct", productDTO);
    }

    public void delete(Long id) throws Exception {
        getSqlMapClient().delete("deleteProduct", id);
    }


}
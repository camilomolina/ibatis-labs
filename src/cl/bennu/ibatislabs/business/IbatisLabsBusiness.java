package cl.bennu.ibatislabs.business;

import cl.bennu.ibatislabs.commons.dto.ClientDTO;
import cl.bennu.ibatislabs.commons.dto.ProductDTO;
import cl.bennu.ibatislabs.commons.dto.base.ContextDTO;
import cl.bennu.ibatislabs.persistence.dao.IClientDAO;
import cl.bennu.ibatislabs.persistence.dao.IProductDAO;
import cl.bennu.ibatislabs.persistence.factory.AbstractFactory;
import org.apache.commons.lang.math.NumberUtils;

import java.util.Date;
import java.util.List;

public class IbatisLabsBusiness {

    private static final IbatisLabsBusiness instance = new IbatisLabsBusiness();

    private IClientDAO clientDAO;
    private IProductDAO productDAO;

    private IbatisLabsBusiness() {
        clientDAO = AbstractFactory.getClientDAO();
        productDAO = AbstractFactory.getProductDAO();
    }

    public static IbatisLabsBusiness getInstance() {
        return instance;
    }

    public List getAllClient(ContextDTO contextDTO) throws Exception {
        return clientDAO.getAll();
    }

    public ClientDTO getClientById(ContextDTO contextDTO, Long areaId) throws Exception {
        return clientDAO.getById(areaId);
    }

    public void saveClient(ContextDTO contextDTO, ClientDTO areaDTO) throws Exception {
        if (areaDTO.getId() == null) {
            areaDTO.setCreate(new Date());
            areaDTO.setCreateUser(contextDTO.getUser());

            clientDAO.insert(areaDTO);
        } else {
            areaDTO.setUpdate(new Date());
            areaDTO.setUpdateUser(contextDTO.getUser());

            clientDAO.update(areaDTO);
        }
    }

    public void deleteClient(ContextDTO contextDTO, Long areaId) throws Exception {
        clientDAO.delete(areaId);
    }

    public List getAllProduct(ContextDTO contextDTO) throws Exception {
        return productDAO.getAll();
    }

    public ProductDTO getProductById(ContextDTO contextDTO, Long controladorId) throws Exception {
        return productDAO.getById(controladorId);
    }

    public void saveProduct(ContextDTO contextDTO, ProductDTO controllerDTO) throws Exception {
        if (controllerDTO.getId() == null || controllerDTO.getId().equals(NumberUtils.LONG_ZERO)) {
            controllerDTO.setCreate(new Date());
            controllerDTO.setCreateUser(contextDTO.getUser());

            productDAO.insert(controllerDTO);
        } else {
            controllerDTO.setUpdate(new Date());
            controllerDTO.setUpdateUser(contextDTO.getUser());

            productDAO.update(controllerDTO);
        }
    }

    public void deleteProduct(ContextDTO contextDTO, Long controllerId) throws Exception {
        productDAO.delete(controllerId);
    }


}
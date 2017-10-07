package cl.bennu.ibatislabs.persistence.factory;

import cl.bennu.ibatislabs.persistence.dao.IClientDAO;
import cl.bennu.ibatislabs.persistence.dao.IProductDAO;
import cl.bennu.ibatislabs.persistence.impl.ibatis.ClientImpl;
import cl.bennu.ibatislabs.persistence.impl.ibatis.ProductImpl;

public class AbstractFactory {

    public static IClientDAO getClientDAO() {
        return new ClientImpl();
    }

    public static IProductDAO getProductDAO() {
        return new ProductImpl();
    }

}






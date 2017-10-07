package cl.bennu.ibatislabs;

import cl.bennu.ibatislabs.business.IbatisLabsBusiness;
import cl.bennu.ibatislabs.commons.dto.ClientDTO;
import cl.bennu.ibatislabs.commons.dto.base.ContextDTO;
import org.apache.commons.collections.IteratorUtils;

import java.util.Iterator;
import java.util.List;

public class Test {

    public static void main(String[] args) throws Exception {
        List list = IbatisLabsBusiness.getInstance().getAllClient(new ContextDTO());
        Iterator iterator = IteratorUtils.getIterator(list);
        while (iterator.hasNext()) {
            ClientDTO clientDTO = (ClientDTO) iterator.next();
            System.out.println(clientDTO);

        }

    }

}

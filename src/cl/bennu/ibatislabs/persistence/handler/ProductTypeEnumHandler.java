package cl.bennu.ibatislabs.persistence.handler;

import cl.bennu.ibatislabs.commons.enums.ProductTypeEnum;
import com.ibatis.sqlmap.client.extensions.ParameterSetter;
import com.ibatis.sqlmap.client.extensions.ResultGetter;
import com.ibatis.sqlmap.client.extensions.TypeHandlerCallback;

import java.sql.SQLException;

public class ProductTypeEnumHandler implements TypeHandlerCallback {

    public void setParameter(ParameterSetter parameterSetter, Object o) throws SQLException {
        parameterSetter.setInt(o != null ? ((ProductTypeEnum) o).getValue() : 0);
    }

    public Object getResult(ResultGetter resultGetter) throws SQLException {
        return ProductTypeEnum.valueOf(new Long(resultGetter.getLong()));
    }

    public Object valueOf(String s) {
        return s;
    }
}

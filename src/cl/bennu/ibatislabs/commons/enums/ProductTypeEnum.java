package cl.bennu.ibatislabs.commons.enums;

import org.apache.commons.lang.enums.ValuedEnum;

import java.util.Iterator;
import java.util.List;

public class ProductTypeEnum extends ValuedEnum {

    public static final ProductTypeEnum PRODUCT_1 = new ProductTypeEnum("Product 1", 1);
    public static final ProductTypeEnum PRODUCT_2 = new ProductTypeEnum("Product 2", 2);
    public static final ProductTypeEnum PRODUCT_3 = new ProductTypeEnum("Product 3", 3);

    protected ProductTypeEnum(String name, int value) {
        super(name, value);
    }

    public static ProductTypeEnum valueOf(String name) {
        Object objectEnum = getEnum(ProductTypeEnum.class, name);
        if (objectEnum == null) {
            throw new IllegalArgumentException(name + " cannot be translated to enum.");
        }
        return (ProductTypeEnum) objectEnum;
    }

    public static ProductTypeEnum valueOf(Long value) {
        if (value == null) {
            throw new IllegalArgumentException(value + " cannot be translated to enum.");
        }
        Object objectEnum = getEnum(ProductTypeEnum.class, value.intValue());
        if (objectEnum == null) {
            throw new IllegalArgumentException(value + " cannot be translated to enum.");
        }
        return (ProductTypeEnum) objectEnum;
    }

    public static List getEnumList() {
        return getEnumList(ProductTypeEnum.class);
    }

    public final Long getId() {
        return new Long(getValue());
    }

    public final String getEnumName() {
        return getName();
    }

    public static Iterator iterator() {
        return iterator(ProductTypeEnum.class);
    }
}

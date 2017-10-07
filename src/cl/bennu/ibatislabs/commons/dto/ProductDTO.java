package cl.bennu.ibatislabs.commons.dto;

import cl.bennu.ibatislabs.commons.dto.base.BaseDTO;
import cl.bennu.ibatislabs.commons.enums.ProductTypeEnum;

import java.util.Date;

public class ProductDTO extends BaseDTO {

    private String name;
    private ProductTypeEnum productTypeEnum;
    private Date date;
    private Long account;
    private Double factor;
    private Double amount;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getAccount() {
        return account;
    }

    public void setAccount(Long account) {
        this.account = account;
    }

    public Double getFactor() {
        return factor;
    }

    public void setFactor(Double factor) {
        this.factor = factor;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public ProductTypeEnum getProductTypeEnum() {
        return productTypeEnum;
    }

    public void setProductTypeEnum(ProductTypeEnum productTypeEnum) {
        this.productTypeEnum = productTypeEnum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

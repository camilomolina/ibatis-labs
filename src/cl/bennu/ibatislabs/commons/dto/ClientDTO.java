package cl.bennu.ibatislabs.commons.dto;

import cl.bennu.ibatislabs.commons.dto.base.BaseDTO;

public class ClientDTO extends BaseDTO {

    private String name;

    public String toString() {
        return "ClientDTO{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package exersize01.entity.part.impl;


import exersize01.entity.part.IProductPart;

public class ProductPart implements IProductPart {

    private String name;

    public ProductPart() {
    }

    public ProductPart(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

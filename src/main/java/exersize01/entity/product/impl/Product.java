package exersize01.entity.product.impl;


import exersize01.entity.part.IProductPart;
import exersize01.entity.product.IProduct;

public class Product implements IProduct {

    private IProductPart firstPart;
    private IProductPart secondPart;
    private IProductPart thirdPart;

    @Override
    public void installFirstPart(IProductPart productPart) {
        firstPart = productPart;
    }

    @Override
    public void installSecondPart(IProductPart productPart) {
        secondPart = productPart;
    }

    @Override
    public void installThirdPart(IProductPart productPart) {
        thirdPart = productPart;
    }

    //------------------------------------------------------------------------------------------------------------------


    @Override
    public String toString() {
        return "Product{" +
                "firstPart=" + firstPart +
                ", secondPart=" + secondPart +
                ", thirdPart=" + thirdPart +
                '}';
    }
}

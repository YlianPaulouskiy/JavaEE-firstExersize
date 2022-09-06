package exersize01.IProduct.impl;


import exersize01.IProduct.IProduct;
import exersize01.IProductPart.IProductPart;

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

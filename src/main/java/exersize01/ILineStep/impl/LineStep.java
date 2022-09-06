package exersize01.ILineStep.impl;


import exersize01.ILineStep.ILineStep;
import exersize01.IProductPart.IProductPart;
import exersize01.IProductPart.impl.ProductPart;

public class LineStep implements ILineStep {


    private final IProductPart productPart;

    public LineStep(ProductPart productPart) {
        this.productPart = productPart;
    }

    @Override
    public IProductPart buildProductPart() {
        return productPart;
    }
}

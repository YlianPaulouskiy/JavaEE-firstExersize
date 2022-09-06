package exersize01.build.part.impl;


import exersize01.build.part.ILineStep;
import exersize01.entity.part.IProductPart;
import exersize01.entity.part.impl.ProductPart;

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

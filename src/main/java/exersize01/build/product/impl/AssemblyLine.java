package exersize01.build.product.impl;


import exersize01.build.part.impl.LineStep;
import exersize01.build.product.IAssemblyLine;
import exersize01.entity.part.IProductPart;
import exersize01.entity.part.impl.ProductPart;
import exersize01.entity.product.IProduct;

public class AssemblyLine implements IAssemblyLine {

    @Override
    public IProduct assembleProduct(IProduct product) {

        IProductPart firstPart = new LineStep(new ProductPart("Кузов")).buildProductPart();
        IProductPart secondPart = new LineStep(new ProductPart("Двигатель")).buildProductPart();
        IProductPart thirdPart = new LineStep(new ProductPart("Шасси")).buildProductPart();

        product.installFirstPart(firstPart);
        product.installSecondPart(secondPart);
        product.installThirdPart(thirdPart);

        return product;
    }
}

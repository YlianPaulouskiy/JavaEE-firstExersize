package exersize01.IAssemblyLine.impl;


import exersize01.ILineStep.impl.LineStep;
import exersize01.IAssemblyLine.IAssemblyLine;
import exersize01.IProductPart.IProductPart;
import exersize01.IProductPart.impl.ProductPart;
import exersize01.IProduct.IProduct;

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

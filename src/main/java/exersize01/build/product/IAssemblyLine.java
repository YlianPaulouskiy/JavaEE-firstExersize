package exersize01.build.product;

import exersize01.entity.product.IProduct;

public interface IAssemblyLine {

    IProduct assembleProduct(IProduct product);
}

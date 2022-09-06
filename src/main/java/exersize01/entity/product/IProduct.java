package exersize01.entity.product;

import exersize01.entity.part.IProductPart;

public interface IProduct {

    void installFirstPart(IProductPart productPart);

    void installSecondPart(IProductPart productPart);

    void installThirdPart(IProductPart productPart);

}

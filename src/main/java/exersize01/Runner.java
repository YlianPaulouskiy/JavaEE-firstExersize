package exersize01;


import exersize01.build.product.IAssemblyLine;
import exersize01.build.product.impl.AssemblyLine;
import exersize01.entity.product.IProduct;
import exersize01.entity.product.impl.Product;

public class Runner {

    public static void main(String[] args) {

        IAssemblyLine assemblyLine = new AssemblyLine();
        IProduct car = new Product();

        System.out.println("Включаем сборочную линию!");
        System.out.println(assemblyLine.assembleProduct(car));
    }
}

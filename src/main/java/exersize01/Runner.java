package exersize01;


import exersize01.IAssemblyLine.IAssemblyLine;
import exersize01.IAssemblyLine.impl.AssemblyLine;
import exersize01.IProduct.IProduct;
import exersize01.IProduct.impl.Product;

public class Runner {

    public static void main(String[] args) {

        IAssemblyLine assemblyLine = new AssemblyLine();
        IProduct car = new Product();

        System.out.println("Включаем сборочную линию!");
        System.out.println(assemblyLine.assembleProduct(car));
    }
}

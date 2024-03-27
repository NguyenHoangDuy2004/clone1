package demo1.repository;

import demo1.model.Product;

import java.util.List;

public interface IProductRepo {
    void addProduct(Product product);
    List<Product> getList();
    void update(List<Product> productlist);

}

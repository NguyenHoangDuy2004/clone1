package demo1.repository.impl;

import demo1.model.Product;
import demo1.model.ProductNhapKhau;
import demo1.model.ProductXuatKhau;
import demo1.repository.IProductRepo;
import demo1.ulti.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo implements IProductRepo {
    private static ReadAndWrite readAndWrite = new ReadAndWrite();
    private final  String PRODUCT_DATA ="D:\\codegym\\module2_c010\\src\\demo1\\data\\product.csv";
    @Override
    public void addProduct(Product product) {

        List<String> stringList = new ArrayList<>();
        stringList.add(product.getInfoToCSV());
        ReadAndWrite.writeToFile(PRODUCT_DATA, stringList, true);
    }

    @Override
    public List<Product> getList() {

        List<String> stringList = readAndWrite.readFileCSV(PRODUCT_DATA);
        List<Product> productList = new ArrayList<>();
        String[] array = null;
        for (String s: stringList) {
            array = s.split(",");
            if(array[2].contains("Giay Adidas") || array[2].contains("Dong ho Rolex") || array[2].contains("Iphone XS")) {
                int id = Integer.parseInt(array[0]);
                String maProduct = array[1];
                String nameproduct = array[2];
                double price = Double.parseDouble(array[3]);
                int quantity = Integer.parseInt(array[4]);
                String nhaSanXuat = array[5];
                double priceNK = Double.parseDouble(array[6]);
                String province = array[7];
                double thueNK = Double.parseDouble(array[8]);
                Product product = new ProductNhapKhau(id,maProduct,nameproduct,price,quantity,nhaSanXuat,priceNK,province,thueNK);
                productList.add(product);
            } else {
                int id = Integer.parseInt(array[0]);
                String maProduct = array[1];
                String nameproduct = array[2];
                double price = Double.parseDouble(array[3]);
                int quantity = Integer.parseInt(array[4]);
                String nhaSanXuat = array[5];
                double priceXK = Double.parseDouble(array[6]);
                String national = array[7];
                Product product = new ProductXuatKhau(id,maProduct,nameproduct,price,quantity,nhaSanXuat,priceXK,national);
                productList.add(product);
            }

        }
        return productList;
    }

    @Override
    public void update(List<Product> productlist) {

        List<String> stringList = new ArrayList<>();
        for (Product product: productlist) {
            stringList.add(product.getInfoToCSV());
        }
        ReadAndWrite.writeToFile(PRODUCT_DATA, stringList, false);
    }
}
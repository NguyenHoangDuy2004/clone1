package demo1.service.impl;

import demo1.model.Product;
import demo1.model.ProductNhapKhau;
import demo1.model.ProductXuatKhau;
import demo1.repository.IProductRepo;
import demo1.repository.impl.ProductRepo;
import demo1.service.IProductService;
import demo1.ulti.CheckInputData;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService {
    private static IProductRepo productRepo = new ProductRepo();

    @Override
    public void addProduct() {

        boolean flag = true;
        do {
            System.out.println("Chọn chức năng thêm loại sản phẩm:");
            System.out.println("1.Thêm sản phẩm nhập khẩu.");
            System.out.println("2.Thêm sản phẩm xuất khẩu.");
            System.out.println("3.Back to menu.");
            int choice = CheckInputData.CheckInputOption("Mời bạn chọn chức năng:", 1, 3);
            switch (choice) {
                case 1: {
                    addProductNK();
                    break;
                }
                case 2: {
                    addProductXK();
                    break;
                }
                default: {
                    flag = false;

                }
            }
        } while (flag);

    }
    @Override
    public void displayProduct() {
            List<Product> productList = productRepo.getList();
            for (Product product : productList) {
                System.out.println(product.getInfoToCSV());
            }

    }

    @Override
    public void removeProduct(String maProductDel) {
            List<Product> productList = productRepo.getList();
            List<String> stringList = new ArrayList<>();
            boolean flag = false;
            for (int i = 0; i < productList.size(); i++) {
                if (productList.get(i).getMaSanPham().equals(maProductDel)) {
                    flag = true;
                    System.out.println("Đã tìm thấy tên sản phẩm cần xóa");
                }
            }

            if (!flag) {
                System.out.println("Không tìm thấy sản phẩm.");
            }

    }

    @Override
    public void findProduct(String nameFind) {
        boolean flag = false;
        List<Product> productList = productRepo.getList();
        for (Product product : productList) {
            if (product.getTenSanPham().equals(nameFind)) {
                flag = true;
                System.out.println("Đã tìm thấy tên sản phảm.");
                System.out.println(product);
                break;
            }

        }
        if (!flag) {
            System.out.println("Không tìm thấy tên sản phẩm.");
        }

    }
      private void addProductNK() {

        while (true) {
            int id = CheckInputData.checkInputInt("Nhập id sản phẩm:", 0);
            String maProduct = CheckInputData.checkInputNull("Nhập mã sản phẩm:", "Mã sản phẩm");
           String nameProduct = CheckInputData.checkInputnameProductXK("Nhập tên sản phẩm:");
           double price = CheckInputData.checkInputDouble("Nhập giá sản phẩm", 0 , "Giá bán");
           int quantity = CheckInputData.checkInputInt("Nhập số lượng sản phẩm:", 0);
           String nhaSanXuat = CheckInputData.checkInputNull("Nhập nhà sản xuất sản phẩm:", "Nhà sản xuất");
            double priceNK = CheckInputData.checkInputDouble(" Nhập giá sản phẩm nhập khẩu:", 0, "Giá nhập khẩu");
            String province = CheckInputData.checkInputNull("Nhập tỉnh thành:", "Tỉnh Thành");
            double thueNK = CheckInputData.checkInputDouble("Nhập giá thuế:", 0, "Thuế nhập khẩu");
            ProductNhapKhau productNhapKhau = new ProductNhapKhau(id, maProduct, nameProduct, price, quantity, nhaSanXuat, priceNK, province, thueNK);
            productRepo.addProduct(productNhapKhau);
            System.out.println("Thêm mới thành công.");

        }

    }
      private void addProductXK() {
        while (true) {
         int id = CheckInputData.checkInputInt("Nhập id sản phẩm :", 0);
           String maProduct = CheckInputData.checkInputNull("Nhập mã sản phẩm :", "Mã sản phẩm");
          String nameProduct = CheckInputData.checkInputnameProductNK("Nhập tên sản phẩm :");
        double price = CheckInputData.checkInputDouble("nhập giá bán sản phẩm :", 0 , "Giá bán");
          int quantity = CheckInputData.checkInputInt("Nhập số lượng sản phẩm :", 0);
           String nhaSanXuat = CheckInputData.checkInputNull("Nhập nhà sản xuất sản phẩm:", "Nhà sản xuấtt");
            double priceXK = CheckInputData.checkInputDouble("Nhập giá sản phẩm xuất khẩu", 0, "Giá xuất khẩu");
            String national = CheckInputData.checkInputNull("Nhập quốc gia xuất khẩu:", "Tên quốc gia");
            ProductXuatKhau productXuatKhau = new ProductXuatKhau(id, maProduct, nameProduct, price, quantity, nhaSanXuat, priceXK, national);
            productRepo.addProduct(productXuatKhau);
            System.out.println("Thêm mới thành công.");
         }
    }
}



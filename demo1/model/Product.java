package demo1.model;

public class Product {
    private int id = 1 ;
    private String tenSanPham ;
    private String maSanPham ;
    private double price ;
    private int quantity ;
    private String nhaSanXuat ;

    public Product() {

    }

    public Product(int id, String tenSanPham, String maSanPham, double price, int quantity, String nhaSanXuat) {
        this.id = id;
        this.tenSanPham = tenSanPham;
        this.maSanPham = maSanPham;
        this.price = price;
        this.quantity = quantity;
        this.nhaSanXuat = nhaSanXuat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", maSanPham='" + maSanPham + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", nhaSanXuat='" + nhaSanXuat + '\'' +
                '}';
    }
    public String getInfoToCSV() {
        return this.id + "," + this.tenSanPham + "," + this.maSanPham + "," + this.price + "," + this.quantity + "," + this.nhaSanXuat;
    }

}

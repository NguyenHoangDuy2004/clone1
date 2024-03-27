package demo1.model;

public class ProductXuatKhau extends Product{
    private double priceXK ;
    private String national ;

    public ProductXuatKhau() {
    }

    public ProductXuatKhau(int id, String tenSanPham, String maSanPham, double price, int quantity, String nhaSanXuat, double priceXuatKhau, String national) {
        super(id, tenSanPham, maSanPham, price, quantity, nhaSanXuat);
        this.priceXK = priceXK;
        this.national = national;
    }

    public double getPriceXuatKhau() {
        return priceXK;
    }

    public void setPriceXuatKhau(double priceXuatKhau) {
        this.priceXK = priceXuatKhau;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    @Override
    public String toString() {
        return super.toString() + "," + this.priceXK + "," + this.national;
    }
    @Override
    public String getInfoToCSV() {
        return super.getInfoToCSV() + "," + this.priceXK + "," + this.national;
    }

}

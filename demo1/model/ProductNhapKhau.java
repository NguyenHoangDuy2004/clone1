package demo1.model;

public class ProductNhapKhau extends Product {
    private double priceNK;
    private String province ;
    private double thueNK ;

    public ProductNhapKhau() {
    }

    public ProductNhapKhau(int id, String tenSanPham, String maSanPham, double price, int quantity, String nhaSanXuat, double priceNhapKhau, String province, double thueNhapKhau) {
        super(id, tenSanPham, maSanPham, price, quantity, nhaSanXuat);
        this.priceNK = priceNK;
        this.province = province;
        this.thueNK = thueNhapKhau;
    }

    public double getPriceNhapKhau() {
        return priceNK;
    }

    public void setPriceNhapKhau(double priceNhapKhau) {
        this.priceNK = priceNK;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }   

    public double getThueNhapKhau() {
        return thueNK;
    }

    public void setThueNhapKhau(double thueNhapKhau) {
        this.thueNK = thueNK;
    }

    @Override
    public String toString() {
        return super.toString() + "," + this.priceNK + "," + this.thueNK;
    }


    @Override
    public String getInfoToCSV() {
        return super.getInfoToCSV() + "," + this.priceNK + "," + this.thueNK;
    }

}

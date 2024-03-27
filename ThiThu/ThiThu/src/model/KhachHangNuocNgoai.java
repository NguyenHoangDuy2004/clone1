package model;

public class KhachHangNuocNgoai extends KhachHang{
    private String quoctich;

    public KhachHangNuocNgoai(String quoctich) {
        this.quoctich = quoctich;
    }

    public KhachHangNuocNgoai() {
    }

    public KhachHangNuocNgoai(int makhachhang, String hoten, String quoctich) {
        super(makhachhang, hoten);
        this.quoctich = quoctich;
    }

    public String getQuoctich() {
        return quoctich;
    }

    public void setQuoctich(String quoctich) {
        this.quoctich = quoctich;
    }

    @Override
    public String toString() {
        return "KhachHangNuocNgoai{" + super.toString()+
                "quoctich='" + quoctich + '\'' +
                '}';
    }
}

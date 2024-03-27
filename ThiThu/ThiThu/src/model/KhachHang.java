package model;

public class KhachHang {
   private int makhachhang;
    private String hoten;

    public KhachHang() {
    }

    public KhachHang(int makhachhang, String hoten) {
        this.makhachhang = makhachhang;
        this.hoten = hoten;
    }

    public int getMakhachhang() {
        return makhachhang;
    }

    public void setMakhachhang(int makhachhang) {
        this.makhachhang = makhachhang;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "makhachhang=" + makhachhang +
                ", hoten='" + hoten + '\'' +
                '}';
    }
}

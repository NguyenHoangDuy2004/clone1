package model;

public class KhachHangVietNam extends KhachHang {
    private String loaikhachhang;

    public KhachHangVietNam() {
    }

    public KhachHangVietNam(String loaikhachhang) {
        this.loaikhachhang = loaikhachhang;
    }

    public KhachHangVietNam(int makhachhang, String hoten, String loaikhachhang) {
        super(makhachhang, hoten);
        this.loaikhachhang = loaikhachhang;
    }

    public String getLoaikhachhang() {
        return loaikhachhang;
    }

    public void setLoaikhachhang(String loaikhachhang) {
        this.loaikhachhang = loaikhachhang;
    }

    @Override
    public String toString() {
        return "KhachHangVietNam{" + super.toString()+
                "loaikhachhang='" + loaikhachhang + '\'' +
                '}';
    }
}

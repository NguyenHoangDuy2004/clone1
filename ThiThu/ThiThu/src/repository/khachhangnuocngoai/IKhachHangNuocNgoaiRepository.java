package repository.khachhangnuocngoai;

import model.KhachHangNuocNgoai;

import java.util.List;

public interface IKhachHangNuocNgoaiRepository {
    public void them(KhachHangNuocNgoai khachHangNuocNgoai);
    public List danhSach();
    public List findAll();
    public void xoa(int id);
    public void timKiemID(int id);
    public void tinKiemTen(String name);
}

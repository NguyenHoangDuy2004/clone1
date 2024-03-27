package repository.khachhangvietnam;

import model.KhachHangVietNam;

import java.util.List;

public interface IKhachHangVietNamRepository {
    public void them(KhachHangVietNam khachHangVietNam);
    public List danhSach();
    public List findAll();
    public void xoa(int id);
    public void timKiemID(int id);
    public void tinKiemTen(String name);
}

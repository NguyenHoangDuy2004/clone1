package repository.XeMay;

import model.XeMay;

import java.util.List;

public interface iXeMayRepository {
    public void them(XeMay xeMay);
    public List danhSach();
    public List findAll();
    public void xoa(int id);
    public void timKiemID(int id);
    public void tinKiemTen(String name);
}

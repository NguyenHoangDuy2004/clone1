package repository.XeTai;

import model.XeTai;

import java.util.List;

public interface iXeTaiRepository {
    public void them(XeTai xeTai);
    public List danhSach();
    public List findAll();
    public void xoa(int id);
    public void timKiemID(int id);
    public void tinKiemTen(String name);
}

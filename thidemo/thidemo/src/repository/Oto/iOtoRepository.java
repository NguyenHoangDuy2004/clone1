package repository.Oto;

import model.Oto;

import java.util.List;

public interface iOtoRepository {
    public void them(Oto oto);
    public List danhSach();
    public List findAll();
    public void xoa(int id);
    public void timKiemID(int bienKiemSoat);
    public void tinKiemTen(String name);
}

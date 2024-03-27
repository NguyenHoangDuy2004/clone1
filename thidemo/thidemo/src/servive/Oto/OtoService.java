package servive.Oto;


import model.Oto;
import repository.Oto.OtoRepository;

import java.util.List;
import java.util.Scanner;

public class OtoService implements iOtoService{
    Scanner scanner = new Scanner(System.in);
    private OtoRepository otoRepository = new OtoRepository();
    @Override
    public void them() {

        Oto oto = this.getThongTin();
        otoRepository.them(oto);
        System.out.println("Thêm mới thành công");
        danhSach();
    }

    private Oto getThongTin() {
        System.out.println("Nhập vào thông tin : ");
        int bienKiemSoat = 0;

        System.out.println("Tên: ");
        String tenHangSanXuat = scanner.nextLine();

        System.out.println("Năm sản xuất: ");
        String namSanXuat = scanner.nextLine();

        System.out.println("Chủ sở hữu: ");
        String chuSoHuu = scanner.nextLine();

        System.out.println("số chỗ ngồi: ");
         int soChoNgoi = Integer.parseInt(scanner.nextLine());

        System.out.println("Kiểu Xe: ");
        String  kieuXe = scanner.nextLine();

        Oto oto = new Oto(bienKiemSoat,tenHangSanXuat,namSanXuat,chuSoHuu,soChoNgoi,kieuXe);

        return  oto;
    }

    @Override
    public void danhSach() {
        List<Oto> otoList = otoRepository.findAll();
        for (Oto oto : otoList) {
            System.out.println(oto);
        }
    }

    @Override
    public void xoa(int id) {
        otoRepository.xoa(id);
        danhSach();
    }

    @Override
    public void timKiemID(int id) {
        otoRepository.timKiemID(id);
    }

    @Override
    public void tinKiemTen(String name) {

    }
}

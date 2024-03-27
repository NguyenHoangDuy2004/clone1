package servive.XeMay;

import model.Oto;
import model.XeMay;
import repository.XeMay.XeMayRepository;

import java.util.List;
import java.util.Scanner;

public class XeMayService implements iXeMayService{
    Scanner scanner = new Scanner(System.in);
    XeMayRepository xeMayRepository = new XeMayRepository();
    @Override
    public void them() {
        XeMay xeMay = this.getThongTin();
        xeMayRepository.them(xeMay);
        System.out.println("Thêm mới thành công");
        danhSach();
    }
    private XeMay getThongTin() {
        System.out.println("Nhập vào thông tin : ");
        int bienKiemSoat = 0;

        System.out.println("Tên: ");
        String tenHangSanXuat = scanner.nextLine();

        System.out.println("Năm sản xuất: ");
        String namSanXuat = scanner.nextLine();

        System.out.println("Chủ sở hữu: ");
        String chuSoHuu = scanner.nextLine();

        System.out.println("số chỗ ngồi: ");
        int congSuat = Integer.parseInt(scanner.nextLine());

        XeMay xeMay = new XeMay(bienKiemSoat,tenHangSanXuat,namSanXuat,chuSoHuu,congSuat);

        return  xeMay;
    }
    @Override
    public void danhSach() {
        List<XeMay> xeMayList = xeMayRepository.findAll();
        for (XeMay xeMay : xeMayList) {
            System.out.println(xeMay);
        }
    }

    @Override
    public void xoa(int id) {

    }

    @Override
    public void timKiemID(int id) {

    }

    @Override
    public void tinKiemTen(String name) {

    }
}

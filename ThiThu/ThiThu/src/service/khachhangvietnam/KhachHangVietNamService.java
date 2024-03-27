package service.khachhangvietnam;

import model.KhachHangNuocNgoai;
import model.KhachHangVietNam;
import repository.khachhangvietnam.IKhachHangVietNamRepository;
import repository.khachhangvietnam.KhachHangVietNamRepository;

import java.util.List;
import java.util.Scanner;

public class KhachHangVietNamService implements IKhachHangVietNamService{
    public static IKhachHangVietNamRepository iKhachHangVietNamRepository = new KhachHangVietNamRepository();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void them() {
        KhachHangVietNam khachHangVietNam = this.getThongTin();
        iKhachHangVietNamRepository.them(khachHangVietNam);
        System.out.println("Thêm mới thành công");
        danhSach();
    }
    private KhachHangVietNam getThongTin() {
        System.out.println("Nhập vào thông tin Khách Hàng: ");
        System.out.println("Mã Khách Hàng: ");
        int makhachhang = 0;

        System.out.println("Tên: ");
        String hoten = scanner.nextLine();

        System.out.println("Ngày nhập viện:");
        String loaikhachhang = scanner.nextLine();

        KhachHangVietNam khachHangVietNam = new KhachHangVietNam(makhachhang,hoten,loaikhachhang);
        return  khachHangVietNam;
    }
    @Override
    public void danhSach() {
        List<KhachHangVietNam> khachHangVietNamList = iKhachHangVietNamRepository.findAll();
        for (KhachHangVietNam khachHangVietNam : khachHangVietNamList) {
            System.out.println(khachHangVietNam);
        }
    }

    @Override
    public void xoa(int id) {
iKhachHangVietNamRepository.xoa(id);
    }

    @Override
    public void timKiemID(int id) {
iKhachHangVietNamRepository.timKiemID(id);
    }

    @Override
    public void tinKiemTen(String name) {
iKhachHangVietNamRepository.tinKiemTen(name);
    }
}

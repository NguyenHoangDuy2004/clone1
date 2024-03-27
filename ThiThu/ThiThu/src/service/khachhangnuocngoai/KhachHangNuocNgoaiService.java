package service.khachhangnuocngoai;

import model.KhachHangNuocNgoai;
import repository.khachhangnuocngoai.IKhachHangNuocNgoaiRepository;
import repository.khachhangnuocngoai.KhachHangNuocNgoaiRepository;
import repository.khachhangvietnam.IKhachHangVietNamRepository;
import repository.khachhangvietnam.KhachHangVietNamRepository;

import java.util.List;
import java.util.Scanner;

public class KhachHangNuocNgoaiService implements IKhachHangNuocNgoaiService{
    private static IKhachHangNuocNgoaiRepository iKhachHangNuocNgoaiRepository = new KhachHangNuocNgoaiRepository();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void them() {
        KhachHangNuocNgoai khachHangNuocNgoai = this.getThongTin();
        iKhachHangNuocNgoaiRepository.them(khachHangNuocNgoai);
        System.out.println("Thêm mới thành công");
        danhSach();
    }
    private KhachHangNuocNgoai getThongTin() {
        System.out.println("Nhập vào thông tin Khách Hàng: ");
        System.out.println("Mã Khách Hàng: ");
        int makhachhang = 0;

        System.out.println("Tên: ");
        String hoten = scanner.nextLine();

        System.out.println("Ngày nhập viện:");
        String quoctich = scanner.nextLine();

        KhachHangNuocNgoai khachHangNuocNgoai = new KhachHangNuocNgoai(makhachhang,hoten,quoctich);
        return  khachHangNuocNgoai;
    }

    @Override
    public void danhSach() {
        List<KhachHangNuocNgoai> khachHangNuocNgoaiList = iKhachHangNuocNgoaiRepository.findAll();
        for (KhachHangNuocNgoai khachHangNuocNgoai : khachHangNuocNgoaiList) {
            System.out.println(khachHangNuocNgoai);
        }
    }

    @Override
    public void xoa(int id) {
iKhachHangNuocNgoaiRepository.xoa(id);
danhSach();
    }

    @Override
    public void timKiemID(int id) {
iKhachHangNuocNgoaiRepository.timKiemID(id);
    }

    @Override
    public void tinKiemTen(String name) {
iKhachHangNuocNgoaiRepository.tinKiemTen(name);
    }
}

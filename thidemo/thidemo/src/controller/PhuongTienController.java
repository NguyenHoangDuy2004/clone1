package controller;

import servive.Oto.OtoService;
import servive.XeMay.XeMayService;

import java.util.Scanner;

public class PhuongTienController {
    private static Scanner scanner = new Scanner(System.in);
    public static void main (String[]args){
        OtoService otoService = new OtoService();
        XeMayService xeMayService = new XeMayService();
        int chon = 0;
        boolean check;
        do {
            System.out.println("---CHƯƠNG TRÌNH ---");
            System.out.println("Chọn chức năng để tiếp tục: ");
            System.out.println("1. Thêm mới");
            System.out.println("2. Xóa");
            System.out.println("3. Xem danh sách");
            System.out.println("4. Tìm kiếm");
            System.out.println("5. Thoát");
            do {
                System.out.println("Nhập vào lựa chọn : ");
                check = false;
                try {
                    chon= Integer.parseInt(scanner.nextLine());
                }catch (NumberFormatException e){
                    check = true;
                    e.printStackTrace();
                }catch (Exception e){
                    check = true;
                    e.printStackTrace();
                }
            }while (check);
            switch (chon){
                case 1:
                    int luachon = 0;
                    do {
                        System.out.println("---THÊM MỚI---");
                        System.out.println("1. oto");
                        System.out.println("2.Xe Máy");
                        System.out.println("3.Xe Tải");
                        System.out.println("4. Thoát");
                        System.out.println("Nhập vào lựa chọn : ");
                        luachon = Integer.parseInt(scanner.nextLine());
                        switch (luachon){
                            case 1:
                                otoService.them();
                                break;
                            case 2:
                                xeMayService.them();
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                        }
                    }while (luachon<1||luachon>4||luachon!=4);
                    break;
                case 2:
                    int luachon1 = 0;
                    do {
                        System.out.println("---XÓA---");
                        System.out.println("1. oto");
                        System.out.println("2. xe máy");
                        System.out.println("3. xe tải");
                        System.out.println("4. Thoát");
                        System.out.println("Nhập vào sự lựa chọn : ");
                        luachon1 = Integer.parseInt(scanner.nextLine());
                        switch (luachon1){
                            case 1:
                                System.out.println("Nhập vào id: ");
                                int bienKiemSoat = Integer.parseInt(scanner.nextLine());
                                otoService.xoa(bienKiemSoat);
                                System.out.println("----------------------");
                                System.out.println("Xóa thành công" );
                                break;
                            case 2:
                                System.out.println("Nhập vào id : ");
                                int idSecond = Integer.parseInt(scanner.nextLine());
                                System.out.println("----------------------");
                                System.out.println("Xóa thành công" );
                                break;
                            case 3:
                                System.out.println("Nhập vào id : ");
                                int sda = Integer.parseInt(scanner.nextLine());
                                System.out.println("----------------------");
                                System.out.println("Xóa thành công" );
                                break;
                            case 4:
                                break;
                        }
                    }while (luachon1<1||luachon1>4||luachon1!=4);
                    break;
                case 3:
                    int luachon2 = 0;
                    do {
                        System.out.println("---HIỂN THỊ DANH SÁCH---");
                        System.out.println("1. 0TO");
                        System.out.println("2. Xe Máy");
                        System.out.println("3. Xe Tải");
                        System.out.println("4. Thoát");
                        System.out.println("Nhập vào sự lựa chọn: ");
                        luachon2 = Integer.parseInt(scanner.nextLine());
                        switch (luachon2){
                            case 1:
                                otoService.danhSach();
                                break;
                            case 2:
                                xeMayService.danhSach();
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                        }
                    }while (luachon2<1||luachon2>3||luachon2!=3);
                    break;
                case 4:
                    int luachon3 = 0;
                    do {
                        System.out.println("---TÌM KIẾM Phương tiện---");
                        System.out.println("1.Tìm kiếm theo biển kiểm soát");
                        System.out.println("2.Tìm kiếm theo tên");
                        System.out.println("3.Thoát");
                        System.out.println("Nhập vào sự lựa chọn");
                        luachon3 = Integer.parseInt(scanner.nextLine());
                        switch (luachon3){
                            case 1:
                                System.out.println("Nhập vào id: ");
                                int id = Integer.parseInt(scanner.nextLine());
                                otoService.timKiemID(id);

                                break;
                            case 2:
                                System.out.println("Nhập vào tên điện thoại : ");
                                String name = scanner.nextLine();
                                break;
                            case 3:
                                break;
                        }
                    }while (luachon3>3||luachon3<1||luachon3!=3);
                    break;
            }
        }while (chon>5||chon<1||chon!=5);
    }
}

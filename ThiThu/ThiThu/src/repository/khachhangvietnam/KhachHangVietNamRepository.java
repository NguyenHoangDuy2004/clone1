package repository.khachhangvietnam;

import model.KhachHangNuocNgoai;
import model.KhachHangVietNam;
import readfile.ReadFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class KhachHangVietNamRepository implements IKhachHangVietNamRepository{
    private final String FILE_PATH= "C:\\thidemo\\ThiThu\\src\\data\\KhachHangVietNam.csv";
    private List<KhachHangVietNam> khachHangVietNamList = new ArrayList<>();
    private Scanner scanner= new Scanner(System.in);
    private ReadFile readFile = new ReadFile();

    @Override
    public void them(KhachHangVietNam khachHangVietNam) {
        int lastID = 0;
        if (khachHangVietNamList.size()>0){
            lastID = khachHangVietNamList.get(khachHangVietNamList.size()-1).getMakhachhang();
        }
        khachHangVietNam.setMakhachhang(lastID+1);
        khachHangVietNamList.add(khachHangVietNam);
        writeFile(Collections.singletonList(khachHangVietNam),FILE_PATH,true);
    }
    public void writeFile(List<KhachHangVietNam> khachHangVietNams, String filePath, boolean append) {
        File file = new File(filePath);

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, append))) {
            for (KhachHangVietNam khachHangVietNam : khachHangVietNamList) {
                String line = khachHangVietNam.getMakhachhang() + "," + khachHangVietNam.getHoten() + "," + khachHangVietNam.getLoaikhachhang();
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException("Error writing to file: " + e.getMessage());
        }
    }
    public KhachHangVietNamRepository(){
khachHangVietNamList=danhSach();
    }
    @Override
    public List danhSach() {
        List<KhachHangVietNam> lists = new ArrayList<>();
        List<String> strings = readFile.ReadFile(FILE_PATH);
        for (String str : strings) {
            String[] temp = str.split(",");
            int makhachhang = Integer.parseInt(temp[0]);
            String tenkhachhang = temp[1];
            String loaikhachhang = temp[2];
            KhachHangVietNam khachHangVietNam = new KhachHangVietNam(makhachhang,tenkhachhang,loaikhachhang);
            lists.add(khachHangVietNam);

        }
        return lists;
    }

    @Override
    public List findAll() {
        return khachHangVietNamList;
    }

    @Override
    public void xoa(int id) {
        khachHangVietNamList = danhSach();
        KhachHangVietNam khachHangVietNamRemove = null;

        for (KhachHangVietNam khachHangVietNam : khachHangVietNamList) {
            if (khachHangVietNam.getMakhachhang()== id) {
                khachHangVietNamRemove = khachHangVietNam;
                break;
            }
        }

        if (khachHangVietNamRemove != null) {
            khachHangVietNamList.remove(khachHangVietNamRemove);
            writeFile(khachHangVietNamList, FILE_PATH, false);
        }
    }

    @Override
    public void timKiemID(int id) {
        for (KhachHangVietNam employee: khachHangVietNamList){
            if (employee.getMakhachhang()==id){
                System.out.println(employee);
            }
        }
    }

    @Override
    public void tinKiemTen(String name) {
        for (KhachHangVietNam khachHangVietNam : khachHangVietNamList) {
            if (khachHangVietNam.getHoten().equals(name)) {
                System.out.println(khachHangVietNam);
            }
        }
    }
}

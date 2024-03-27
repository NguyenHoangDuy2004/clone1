package repository.khachhangnuocngoai;

import model.KhachHang;
import model.KhachHangNuocNgoai;
import readfile.ReadFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class KhachHangNuocNgoaiRepository implements IKhachHangNuocNgoaiRepository {
    private final String FILE_PATH= "C:\\thidemo\\ThiThu\\src\\data\\KhachHangNuocNgoai.csv";
    private List<KhachHangNuocNgoai> khachHangNuocNgoaiList = new ArrayList<>();
    private Scanner scanner= new Scanner(System.in);
    private ReadFile readFile = new ReadFile();

    @Override
    public void them(KhachHangNuocNgoai khachHangNuocNgoai) {
        int lastID = 0;
        if (khachHangNuocNgoaiList.size()>0){
            lastID = khachHangNuocNgoaiList.get(khachHangNuocNgoaiList.size()-1).getMakhachhang();
        }
        khachHangNuocNgoai.setMakhachhang(lastID+1);
        khachHangNuocNgoaiList.add(khachHangNuocNgoai);
        writeFile(Collections.singletonList(khachHangNuocNgoai),FILE_PATH,true);
    }
    public void writeFile(List<KhachHangNuocNgoai> benhAnThuongs, String filePath, boolean append) {
        File file = new File(filePath);

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, append))) {
            for (KhachHangNuocNgoai khachHangNuocNgoai : khachHangNuocNgoaiList) {
                String line = khachHangNuocNgoai.getMakhachhang() + "," + khachHangNuocNgoai.getHoten() + "," + khachHangNuocNgoai.getQuoctich();
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException("Error writing to file: " + e.getMessage());
        }
    }
public KhachHangNuocNgoaiRepository(){
    khachHangNuocNgoaiList=danhSach();
}
    @Override
    public List danhSach() {
         List<KhachHangNuocNgoai> lists = new ArrayList<>();
        List<String> strings = readFile.ReadFile(FILE_PATH);
        for (String str : strings) {
            String[] temp = str.split(",");
            int makhachhang = 0;
            String tenkhachhang = temp[1];
            String quoctich = temp[2];
            KhachHangNuocNgoai khachHangNuocNgoai = new KhachHangNuocNgoai(makhachhang,tenkhachhang,quoctich);
            lists.add(khachHangNuocNgoai);

        }
        return lists;
    }

    @Override
    public List findAll() {
        return khachHangNuocNgoaiList;
    }

    @Override
    public void xoa(int id) {
        khachHangNuocNgoaiList = danhSach();
        KhachHangNuocNgoai khachHangNuocNgoaiRemove = null;

        for (KhachHangNuocNgoai khachHangNuocNgoai : khachHangNuocNgoaiList) {
            if (khachHangNuocNgoai.getMakhachhang()== id) {
                khachHangNuocNgoaiRemove = khachHangNuocNgoai;
                break;
            }
        }

        if (khachHangNuocNgoaiRemove != null) {
            khachHangNuocNgoaiList.remove(khachHangNuocNgoaiRemove);
            writeFile(khachHangNuocNgoaiList, FILE_PATH, false);
        }
    }

    @Override
    public void timKiemID(int id) {
        for (KhachHangNuocNgoai employee: khachHangNuocNgoaiList){
            if (employee.getMakhachhang()==id){
                System.out.println(employee);
            }
        }
    }

    @Override
    public void tinKiemTen(String name) {
        for (KhachHangNuocNgoai benhAnThuong : khachHangNuocNgoaiList){
            if (benhAnThuong.getHoten().equals(name)){
                System.out.println(benhAnThuong);
            }
        }

    }
}

package repository.XeMay;

import ReadFile.ReadFile;
import model.XeMay;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class XeMayRepository implements iXeMayRepository{
    private final String FILE_PATH= "C:\\thidemo\\thidemo\\src\\data\\xemay.csv";
    private List<XeMay> xeMayList = new ArrayList<>();
    private Scanner scanner= new Scanner(System.in);
    private ReadFile readFile = new ReadFile();
    @Override
    public void them(XeMay xeMay) {
        int lastID = 0;
        if (xeMayList.size()>0){
            lastID = xeMayList.get(xeMayList.size()-1).getBienkiemsoat();
        }
        xeMay.setBienkiemsoat(lastID+1);
        xeMayList.add(xeMay);
        writeFile(Collections.singletonList(xeMay),FILE_PATH,true);
    }
    public void writeFile(List<XeMay> xemays, String filePath, boolean append) {
        File file = new File(filePath);

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, append))) {
            for (XeMay xeMay : xeMayList) {
                String line = xeMay.getBienkiemsoat() + "," + xeMay.getTenhangsanxuat() + "," + xeMay.getNamsanxuat() + "," + xeMay.getChusohuu()+ "," + xeMay.getCongsuat();
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException("Error writing to file: " + e.getMessage());
        }
    }
    public XeMayRepository(){
        xeMayList = danhSach();
    }
    @Override
    public List danhSach() {
        List<XeMay> lists = new ArrayList<>();
        List<String> strings = readFile.ReadFile(FILE_PATH);
        for (String str : strings) {
            String[] temp = str.split(",");
            int bienkiemsoat = Integer.parseInt(temp[0]);
            String tenhangsanxuat = temp[1];
            String namsanxuat = temp[2];
            String chusohuu = temp[3];
            int congsuat = Integer.parseInt(temp[4]);
            XeMay xeMay = new XeMay(bienkiemsoat,tenhangsanxuat,namsanxuat,chusohuu,congsuat);
            lists.add(xeMay);

        }
        return lists;
    }



    @Override
    public List findAll() {
        return xeMayList;
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

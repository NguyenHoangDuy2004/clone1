package repository.Oto;

import ReadFile.ReadFile;
import model.Oto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OtoRepository implements iOtoRepository{
    private final String FILE_PATH= "C:\\thidemo\\thidemo\\src\\data\\oto.csv";
    private List<Oto> otoList = new ArrayList<>();
    private Scanner scanner= new Scanner(System.in);
    private ReadFile readFile = new ReadFile();
    @Override
    public void them(Oto oto) {
        int lastID = 0;
        if (otoList.size()>0){
            lastID = otoList.get(otoList.size()-1).getBienkiemsoat();
        }
        oto.setBienkiemsoat(lastID+1);
        otoList.add(oto);
        writeFile(Collections.singletonList(oto),FILE_PATH,true);
    }
    public void writeFile(List<Oto> otos, String filePath, boolean append) {
        File file = new File(filePath);

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, append))) {
            for (Oto oto : otoList) {
                String line = oto.getBienkiemsoat() + "," + oto.getTenhangsanxuat() + "," + oto.getNamsanxuat() + "," + oto.getChusohuu()+ "," + oto.getSochongoi()+","+oto.getKieuxe();
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException("Error writing to file: " + e.getMessage());
        }
    }
    public OtoRepository(){
        otoList = danhSach();
    }
    @Override
    public List danhSach() {
        List<Oto> lists = new ArrayList<>();
        List<String> strings = readFile.ReadFile(FILE_PATH);
        for (String str : strings) {
            String[] temp = str.split(",");
            int bienkiemsoat = Integer.parseInt(temp[0]);
            String tenhangsanxuat = temp[1];
            String namsanxuat = temp[2];
            String chusohuu = temp[3];
            int sochongoi = Integer.parseInt(temp[4]);
            String kieuxe = (temp[5]);
            Oto oto = new Oto(bienkiemsoat,tenhangsanxuat,namsanxuat,chusohuu,sochongoi,kieuxe);
            lists.add(oto);

        }
        return lists;
    }

    @Override
    public List findAll() {
        return otoList;
    }

    @Override
    public void xoa(int id) {
        otoList = danhSach();
        Oto otoToRemove = null;
        for (Oto oto : otoList) {
            if (oto.getBienkiemsoat()== id) {
                otoToRemove = oto;
                break;
            }
        }
        if (otoToRemove != null) {
            otoList.remove(otoToRemove);
            writeFile(otoList, FILE_PATH, false);
        }
    }

    @Override
    public void timKiemID(int bienKiemSoat) {
        for (Oto oto: otoList){
            if (oto.getBienkiemsoat()==bienKiemSoat){
                System.out.println(oto);
            }
        }
    }

    @Override
    public void tinKiemTen(String name) {

    }
}

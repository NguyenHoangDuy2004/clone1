package model;

public class Oto extends PhuongTienGiaoThong{
    private int sochongoi;
   private String kieuxe;

    public Oto() {
    }

    public Oto(int bienkiemsoat, String tenhangsanxuat, String namsanxuat, String chusohuu, int sochongoi, String kieuxe) {
        super(bienkiemsoat, tenhangsanxuat, namsanxuat, chusohuu);
        this.sochongoi = sochongoi;
        this.kieuxe = kieuxe;
    }
    public int getSochongoi() {
        return sochongoi;
    }

    public void setSochongoi(int sochongoi) {
        this.sochongoi = sochongoi;
    }

    public String getKieuxe() {
        return kieuxe;
    }

    public void setKieuxe(String kieuxe) {
        this.kieuxe = kieuxe;
    }



    @Override
    public String toString() {
        return "Oto{" + super.toString()+
                "sochongoi=" + sochongoi +
                ", kieuxe='" + kieuxe + '\'' +
                '}';
    }
}

package model;

public class PhuongTienGiaoThong {
    private  int bienkiemsoat;
    private String tenhangsanxuat;
    private String namsanxuat;
    private String chusohuu;

    public PhuongTienGiaoThong(int bienkiemsoat, String tenhangsanxuat, String namsanxuat, String chusohuu) {
        this.bienkiemsoat = bienkiemsoat;
        this.tenhangsanxuat = tenhangsanxuat;
        this.namsanxuat = namsanxuat;
        this.chusohuu = chusohuu;
    }

    public PhuongTienGiaoThong() {

    }

    public  int getBienkiemsoat() {
        return bienkiemsoat;
    }

    public  void setBienkiemsoat(int bienkiemsoat) {
        this.bienkiemsoat = bienkiemsoat;
    }

    public String getTenhangsanxuat() {
        return tenhangsanxuat;
    }

    public void setTenhangsanxuat(String tenhangsanxuat) {
        this.tenhangsanxuat = tenhangsanxuat;
    }

    public String getNamsanxuat() {
        return namsanxuat;
    }

    public void setNamsanxuat(String namsanxuat) {
        this.namsanxuat = namsanxuat;
    }

    public String getChusohuu() {
        return chusohuu;
    }

    public void setChusohuu(String chusohuu) {
        this.chusohuu = chusohuu;
    }

    @Override
    public String toString() {
        return "PhuongTienGiaoThong{" +
                "bienkiemsoat=" + bienkiemsoat +
                ", tenhangsanxuat='" + tenhangsanxuat + '\'' +
                ", namsanxuat='" + namsanxuat + '\'' +
                ", chusohuu='" + chusohuu + '\'' +
                '}';
    }
}

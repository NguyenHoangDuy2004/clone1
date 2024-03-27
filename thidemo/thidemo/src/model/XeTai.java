package model;

public class XeTai extends  PhuongTienGiaoThong {
    private int trongtai;

    public XeTai() {
    }

    public XeTai(int trongtai) {
        this.trongtai = trongtai;
    }

    public int getTrongtai() {
        return trongtai;
    }

    public void setTrongtai(int trongtai) {
        this.trongtai = trongtai;
    }

    @Override
    public String toString() {
        return "XeTai{" + super.toString() +
                "trongtai=" + trongtai +
                '}';
    }
}

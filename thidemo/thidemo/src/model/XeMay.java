package model;

public class XeMay extends PhuongTienGiaoThong{
    private int congsuat;

    public XeMay(int congsuat, String tenhangsanxuat, String namsanxuat, String chusohuu, int i) {
        this.congsuat = congsuat;
    }

    public XeMay() {
    }

    public int getCongsuat() {
        return congsuat;
    }

    public void setCongsuat(int congsuat) {
        this.congsuat = congsuat;
    }

    @Override
    public String toString() {
        return "XeMay{" + super.toString()+
                "congsuat=" + congsuat +
                '}';
    }
}

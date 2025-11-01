package quanlibansach;
public class sachtieuthuyet extends sach {
    private String theloai;
    private boolean lasachseries;
    public sachtieuthuyet(){}
    public sachtieuthuyet(String masach, String tieude, String tacgia, int namxuatban, int soluong, double giacoban, String theloai, boolean lasachseries) {
        super(masach, tieude, tacgia, namxuatban, soluong, giacoban);
        this.theloai = theloai;
        this.lasachseries = lasachseries;
    }
    public String getTheloai() {
        return theloai;
    }
    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }
    public boolean isLasachseries() {
        return lasachseries;
    }
    public void setLasachseries(boolean lasachseries) {
        this.lasachseries = lasachseries;
    }
    @Override
    public double tinhgiaban() {
        return getgiacoban() + (lasachseries ? 15000 : 0);
    }

    @Override
    public boolean kiemtratonkho(int soluongtoithieu) {
        return getsoluong() >= soluongtoithieu;
    }

    @Override
    public void capnhatvitri(String vitrimoi) {
        System.out.println("Da chuyen sach \"" + gettieude() + "\" den khu vuc: " + vitrimoi);
    }

    @Override
    public String toString() {
        return super.toString() + ", The loai: " + theloai +
               ", Series: " + lasachseries +
               ", Gia ban: " + tinhgiaban() + " VND";
    }
}

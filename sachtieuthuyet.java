public class sachtieuthuyet extends sach {
    private String theloai;
    private boolean lasachseries;

    public sachtieuthuyet(String masach, String tieude, String tacgia, int namxuatban,
                          int soluong, double giacoban,String vitri, String theloai, boolean lasachseries) {
        super(masach, tieude, tacgia, namxuatban, soluong, giacoban,vitri);
        this.theloai = theloai;
        this.lasachseries = lasachseries;
    }

    public String gettheloai() { return theloai; }
    public void settheloai(String theloai) { this.theloai = theloai; }
    public boolean getlasachseries() { return lasachseries; }
    public void setlasachseries(boolean lasachseries) { this.lasachseries = lasachseries; }

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
        setvitri(vitrimoi);
        System.out.println("Đã chuyển sách tiểu thuyết \"" + gettieude() + "\" đến khu vực: " + vitrimoi);
    }

    @Override
    public String toString() {
        return super.toString() + ", Thể loại: " + theloai +
                ", Là sách series: " + (lasachseries ? "Có" : "Không") +
                ", Giá bán: " + tinhgiaban();
    }
}

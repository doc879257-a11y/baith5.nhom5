public class sachtieuthuyet extends sach implements ikiemke {
    private String theloai;
    private boolean lasachseries;

    public sachtieuthuyet(String masach, String tieude, String tacgia, int namxuatban,
                          int soluong, double giacoban, String theloai, boolean lasachseries) {
        super(masach, tieude, tacgia, namxuatban, soluong, giacoban);
        this.theloai = theloai;
        this.lasachseries = lasachseries;
    }
    public String getTheloai() {
        return theloai;
    }

    public boolean isLasachseries() {
        return lasachseries;
    }
    public void setTheloai(String theloai) {
        this.theloai = theloai;
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
    public void capnhatvitri(String vitrimo) {
        System.out.println("Da chuyen sach " + gettieude() + " den " + vitrimo);
    }

    @Override
    public String toString() {
        return "[Tieu thuyet] " + super.toString() +
               " | The loai: " + theloai +
               " | Series: " + (lasachseries ? "Co" : "Khong") +
               " | Gia ban: " + tinhgiaban();
    }
   
}

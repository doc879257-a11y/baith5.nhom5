public class SachTieuThuyet extends Sach {
    private String theloai;
    private Boolean laSachSeries;
    public SachTieuThuyet(String masach, String tieude, String tacgia, int namxuatban, int soluong, String theloai,Boolean laSachSeries) {
        super(masach,tieude,tacgia,namxuatban,soluong);
        this.theloai = theloai;
        this.laSachSeries = laSachSeries;
    }
@Override 
    public void hienThiThongTin() {
        System.out.println("==================================");
        System.out.println(" THONG TIN SACH TIEU THUYET ");
        System.out.println("==================================");

        super.hienThiThongTin();
        System.out.println("theloai: " + theloai);
        System.out.println("laSachSeries: " + laSachSeries);
        System.out.println("==================================\n");
    }
}
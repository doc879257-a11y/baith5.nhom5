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
class MainTieuThuyet {
    public static void main(String args[]) {
        SachTieuThuyet tt1 = new SachTieuThuyet(
            "STT01", "Harry Potter va Hon đa Phu thuy", "J.K. Rowling", 1997, 300, "Phieu luu - Ky ao", true
        );
        SachTieuThuyet tt2 = new SachTieuThuyet
             ("STT02", "Đac Nhan Tam", "Dale Carnegie", 1936, 150, "Tam ly - Ky nang song", false
        );
        SachTieuThuyet tt3 = new SachTieuThuyet(
            "STT03", "Tram nam co đon", "Gabriel García Márquez", 1967, 120, "Hiện thực huyền ảo", false
        );
        SachTieuThuyet tt4 = new SachTieuThuyet(
            "STT04", "Sherlock Holmes: Tap 1", "Arthur Conan Doyle", 1892, 200, "Trinh tham", true
        );
        SachTieuThuyet tt5 = new SachTieuThuyet(
        "STT05", "Doraemon: Chu meo may đen tu tuong lai", "Fujiko F. Fujio", 1970, 500, "Thieu nhi - Hai huoc", true
        );
        tt1.hienThiThongTin();
        tt2.hienThiThongTin();
        tt3.hienThiThongTin();
        tt4.hienThiThongTin();
        tt5.hienThiThongTin();
    }
}

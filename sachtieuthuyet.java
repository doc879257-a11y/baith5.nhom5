class sachtieuthuyet extends sach implements ikiemke {
    private String theloai;
    private Boolean laSachSeries;
    private double giaban;

    public sachtieuthuyet(String masach, String tieude, String tacgia, int namxuatban, int soluong, double giaCoBan, String theloai, Boolean laSachSeries) {
        super(masach, tieude, tacgia, namxuatban, soluong, giaCoBan);
        this.theloai = theloai;
        this.laSachSeries = laSachSeries;
        this.giaban = tinhGiaBan();
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("==================================");
        System.out.println(" THONG TIN SACH TIEU THUYET ");
        System.out.println("==================================");
        super.hienThiThongTin();
        System.out.println("The loai: " + theloai);
        System.out.println("La sach series: " + laSachSeries);
        System.out.println("Gia ban: " + tinhGiaBan() + " VND");
    }

    public double getGiaBan() { return giaban; }
    @Override
    public double tinhGiaBan() {
        if (laSachSeries) return getgiaCoBan() + 15000;
        else return getgiaCoBan();
    }

    @Override
    public boolean kiemtratonkho(int soluongtoithieu) {
        return getSoluong() >= soluongtoithieu;
    }

    @Override
    public void capnhatvitri(String vitrimoi) {
        System.out.println("Da chuyen sach \"" + getTieude() + "\" den khu vuc " + vitrimoi);
    }

    @Override
    public String toString() {
        return "Sach tieu thuyet:\n" +
               super.toString() +
               "\nThe loai: " + theloai +
               "\nLa sach series: " + laSachSeries +
               "\nGia ban: " + tinhGiaBan() + " VND";
    }
}
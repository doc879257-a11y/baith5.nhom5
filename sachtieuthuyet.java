public class sachtieuthuyet extends sach {
    private String theLoai;
    private boolean laSachSeries;

    public sachtieuthuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong,
                          double giaCoBan, String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    @Override
    public double tinhGiaBan() {
        return getGiaCoBan() + (laSachSeries ? 15000 : 0);
    }

    @Override
    public String toString() {
        return "sachtieuthuyet{" +
                super.toString() +
                ", theLoai='" + theLoai + '\'' +
                ", laSachSeries=" + laSachSeries +
                '}';
    }
}
public class sachtieuthuyet extends sach implements ikiemke{
    private String theLoai;
    private boolean laSachSeries;
    private String viTri;
    public sachtieuthuyet() {
    }

    public sachtieuthuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String theLoai, boolean laSachSeries, double giaCoBan) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
        this.viTri="Chua xac dinh";
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public boolean isLaSachSeries() {
        return laSachSeries;
    }

    public void setLaSachSeries(boolean laSachSeries) {
        this.laSachSeries = laSachSeries;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return getSoLuong() >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        this.viTri=viTriMoi;
        System.out.println("Đã chuyển sách " + getTieuDe() + " đến khu vực: " + viTriMoi);
    }

    @Override
    public double tinhGiaBan() {
        return getGiaCoBan() + (laSachSeries ? 15000:0);
    }
    @Override
    public String toString() {
        return super.toString() + "Sách tiểu thuyết{" +
                "Thể loại='" + theLoai + '\'' +
                ", Là sách series=" + laSachSeries +
                ", Giá bán=" + tinhGiaBan() +
                '}';
    }
}

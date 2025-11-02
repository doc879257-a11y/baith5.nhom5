public class sachgiaotrinh extends sach {
    private String monHoc;
    private String capDo;

    public sachgiaotrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong,
                         double giaCoBan, String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    @Override
    public double tinhGiaBan() {
        int namHienTai = 2025;
        int soNam = namHienTai - getNamXuatBan();
        return getGiaCoBan() + (soNam * 5000);
    }

    @Override
    public String toString() {
        return "sachgiaotrinh{" +
                super.toString() +
                ", monHoc='" + monHoc + '\'' +
                ", capDo='" + capDo + '\'' +
                '}';
    }
}
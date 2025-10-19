public class sachgiaotrinh extends sach implements ikiemke {
    private String monHoc;
    private String capDo;
    private String viTri;

    public sachgiaotrinh() {}

    public sachgiaotrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String monHoc, String capDo, double giaCoBan) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
        this.viTri = "Chua xac dinh";
    }

    public String getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }

    public String getCapDo() {
        return capDo;
    }

    public void setCapDo(String capDo) {
        this.capDo = capDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return getSoLuong()>= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        this.viTri=viTriMoi;
        System.out.println("Da chuyen sach "+getTieuDe()+ " den khu vuc : "+viTriMoi);
    }

    @Override
    public double tinhGiaBan() {
        int soNamDaXuatBan = 2025- getNamXuatBan();
        return getGiaCoBan() + (soNamDaXuatBan*5000);
    }

    @Override
    public String toString() {
        return super.toString() + "Sách giáo trình{" +
                "Môn học='" + monHoc + '\'' +
                ", Cấp độ='" + capDo + '\'' +
                ", Giá bán=" + tinhGiaBan() +
                '}';
    }
}

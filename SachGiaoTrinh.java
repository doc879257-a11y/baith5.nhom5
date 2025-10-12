public class SachGiaoTrinh extends sach{
    private  String monHoc;
    private  String capDo;

    public SachGiaoTrinh() {
    }

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.monHoc = monHoc;
        this.capDo = capDo;
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

    @Override
    public String toString() {
        return super.toString() + "Sách giáo trình{" +
                "Môn học='" + monHoc + '\'' +
                ", Cấp độ='" + capDo + '\'' +
                '}';
    }
}

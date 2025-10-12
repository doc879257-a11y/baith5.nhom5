public class sachgiaotrinh extends sach
{
    private String monhoc;
    private String capdo;
    public sachgiaotrinh(String masach, String tieude, String tacgia, int namxuatban, int soluong, String monhoc)
    {
        super(masach, tieude,tacgia, namxuatban, soluong);
        this.monhoc = monhoc;
        this.capdo = capdo;
    }
    public String getmonhoc() {
        return monhoc;
    }
    public void setmonhoc(String monhoc) {
        this.monhoc = monhoc;
    }
    public String getcapdo() {
        return capdo;
    }
    public void setcapdo(String capdo) {
        this.capdo = capdo;
    }
    @Override
    public String toString()
    {
        return super.toString() + ", Môn học: " + monhoc + ", Cấp độ: " + capdo;
    }
}

public class sachgiaotrinh extends sach {
    private String monhoc;
    private String capdo;

    public sachgiaotrinh(String masach, String tieude, String tacgia, int namxuatban, int soluong, double giacoban, String vitri, String monhoc, String capdo) {
        super(masach, tieude, tacgia, namxuatban, soluong, giacoban, vitri);
        this.monhoc = monhoc;
        this.capdo = capdo;
    }

    public String getmonhoc() { return monhoc; }
    public void setmonhoc(String monhoc) { this.monhoc = monhoc; }
    public String getcapdo() { return capdo; }
    public void setcapdo(String capdo) { this.capdo = capdo; }

    public double tinhgiaban() {
        int nam = 2025 - getnamxuatban();
        if (nam < 0) nam = 0;
        return getgiacoban() + nam * 5000.0;
    }

    public String toString() {
        return "Sachgiaotrinh:  " + super.toString() + ", MonHoc=" + monhoc + ", CapDo=" + capdo + ", GiaBan=" + tinhgiaban() ;
    }
}

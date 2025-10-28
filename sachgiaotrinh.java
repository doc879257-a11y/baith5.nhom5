public class sachgiaotrinh extends sach implements ikiemke
{
    private String monhoc;
    private String capdo;
    public sachgiaotrinh(String masach, String tieude, String tacgia, int namxuatban, int soluong,double giacoban,String monhoc,String capdo)
    {
        super(masach, tieude,tacgia, namxuatban, soluong,giacoban);
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
    public double tinhgiaban() {
        int sonam = 2025 - getnamxuatban();
        return getgiacoban() + sonam * 5000;
    }
    @Override
    public boolean kiemtratonkho(int soluongtoithieu) {
        return getsoluong() >= soluongtoithieu;
    }

    @Override
    public void capnhatvitri(String vitrimoi) {
        System.out.println("Đã chuyển sách \"" + gettieude() + "\" đến khu vực: " + vitrimoi);
    }
    @Override
    public String toString()
    {
        return super.toString() + ", Môn học: " + monhoc + ", Cấp độ: " + capdo+",tinhgiaban:"+tinhgiaban();
    }
}

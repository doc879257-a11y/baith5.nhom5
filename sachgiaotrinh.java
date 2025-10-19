import java.time.LocalDate;

public class sachgiaotrinh extends sach implements ikiemke {
    private String monhoc;
    private String capdo;

    public sachgiaotrinh(String masach, String tieude, String tacgia, int namxuatban,
                         int soluong, double giacoban, String monhoc, String capdo) {
        super(masach, tieude, tacgia, namxuatban, soluong, giacoban);
        this.monhoc = monhoc;
        this.capdo = capdo;
    }
    public String getMonhoc() {
        return monhoc;
    }

    public String getCapdo() {
        return capdo;
    }
    public void setMonhoc(String monhoc) {
        this.monhoc = monhoc;
    }

    public void setCapdo(String capdo) {
        this.capdo = capdo;
    }
    @Override
    public double tinhgiaban() {
        int sonam = LocalDate.now().getYear() - getnamxuatban();
        return getgiacoban() + sonam * 5000;
    }

    @Override
    public boolean kiemtratonkho(int soluongtoithieu) {
        return getsoluong() >= soluongtoithieu;
    }

    @Override
    public void capnhatvitri(String vitrimo) {
        System.out.println("Da chuyen sach " + gettieude() + " den " + vitrimo);
    }

    @Override
    public String toString() {
        return "[Giao trinh] " + super.toString() +
               " | Mon hoc: " + monhoc +
               " | Cap do: " + capdo +
               " | Gia ban: " + tinhgiaban();
    }
}

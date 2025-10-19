import java.time.LocalDate;

public abstract class sach {
    private String masach;
    private String tieude;
    private String tacgia;
    private int namxuatban;
    private int soluong;
    private double giacoban;

    public sach(String masach, String tieude, String tacgia, int namxuatban, int soluong, double giacoban) {
        this.masach = masach;
        this.tieude = tieude;
        this.tacgia = tacgia;
        setnamxuatban(namxuatban);
        setsoduong(soluong);
        this.giacoban = giacoban;
    }

    public String getmasach() { return masach; }
    public String gettieude() { return tieude; }
    public String gettacgia() { return tacgia; }
    public int getnamxuatban() { return namxuatban; }
    public int getsoluong() { return soluong; }
    public double getgiacoban() { return giacoban; }

    public void setnamxuatban(int namxuatban) {
        int namhientai = LocalDate.now().getYear();
        if (namxuatban >= 0 && namxuatban < namhientai)
            this.namxuatban = namxuatban;
        else
            this.namxuatban = 0;
    }

    public void setsoduong(int soluong) {
        this.soluong = Math.max(soluong, 0);
    }

    public void setgiacoban(double giacoban) {
        this.giacoban = giacoban;
    }

    public abstract double tinhgiaban();

    public void hienthithongtin() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Ma sach: " + masach +
               " | Tieu de: " + tieude +
               " | Tac gia: " + tacgia +
               " | Nam XB: " + namxuatban +
               " | So luong: " + soluong +
               " | Gia co ban: " + giacoban;
    }
}

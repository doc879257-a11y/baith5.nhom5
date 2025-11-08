public abstract class sach implements igiaban, ikiemke {
    private String masach;
    private String tieude;
    private String tacgia;
    private int namxuatban;
    private int soluong;
    private double giacoban;
    private String vitri;

    public sach(String masach, String tieude, String tacgia, int namxuatban, int soluong, double giacoban,String vitri) {
        this.masach = masach;
        this.tieude = tieude;
        this.tacgia = tacgia;
        this.namxuatban = namxuatban;
        this.soluong = soluong;
        this.giacoban = giacoban;
        this.vitri = vitri;
    }

    public String getmasach() { return masach; }
    public String gettieude() { return tieude; }
    public String gettacgia() { return tacgia; }
    public int getnamxuatban() { return namxuatban; }
    public int getsoluong() { return soluong; }
    public double getgiacoban() { return giacoban; }
    public String getvitri() { return vitri; }

    public void setmasach(String masach) { this.masach = masach; }
    public void settieude(String tieude) { this.tieude = tieude; }
    public void settacgia(String tacgia) { this.tacgia = tacgia; }
    public void setnamxuatban(int namxuatban) { this.namxuatban = namxuatban; }
    public void setsoluong(int soluong) { this.soluong = soluong; }
    public void setgiacoban(double giacoban) { this.giacoban = giacoban; }
    public void setvitri(String vitri) { this.vitri = vitri; }

    @Override
    public String toString() {
        return "Mã sách: " + masach + ", Tiêu đề: " + tieude + ", Tác giả: " + tacgia +
                ", Năm XB: " + namxuatban + ", Số lượng: " + soluong +
                ", Giá cơ bản: " + giacoban + ", Vị trí: " + vitri;
    }
}

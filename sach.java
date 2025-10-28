abstract class sach implements igiaban, ikiemke {
    private String masach;
    private String tieude;
    private String tacgia;
    private int namxuatban;
    private int soluong;
    private double giacoban;
    private String vitri;

    public sach(String masach, String tieude, String tacgia, int namxuatban, int soluong, double giacoban, String vitri) {
        this.masach = masach;
        this.tieude = tieude;
        this.tacgia = tacgia;
        this.namxuatban = namxuatban;
        this.soluong = soluong;
        this.giacoban = giacoban;
        this.vitri = vitri;
    }

    public String getmasach() { return masach; }
    public void setmasach(String masach) { this.masach = masach; }
    public String gettieude() { return tieude; }
    public void settieude(String tieude) { this.tieude = tieude; }
    public String gettacgia() { return tacgia; }
    public void settacgia(String tacgia) { this.tacgia = tacgia; }
    public int getnamxuatban() { return namxuatban; }
    public void setnamxuatban(int namxuatban) { this.namxuatban = namxuatban; }
    public int getsoluong() { return soluong; }
    public void setsoluong(int soluong) { this.soluong = soluong; }
    public double getgiacoban() { return giacoban; }
    public void setgiacoban(double giacoban) { this.giacoban = giacoban; }
    public String getvitri() { return vitri; }
    public void setvitri(String vitri) { this.vitri = vitri; }

    public void hienthi() {
        System.out.println(toString());
    }

    public boolean kiemtratonkho(int soluongtoithieu) {
        return soluong >= soluongtoithieu;
    }

    public void capnhatvitri(String vitrimo) {
        this.vitri = vitrimo;
        System.out.println("Đã chuyển sách " + tieude + " đến khu vực: " + vitrimo + ".");
    }

    public abstract double tinhgiaban();

    public String toString() {
        return "Ma=" + masach + ", TieuDe=" + tieude + ", TacGia=" + tacgia + ", NamXB=" + namxuatban + ", SL=" + soluong + ", GiaCoBan=" + giacoban + ", ViTri=" + vitri;
    }
}

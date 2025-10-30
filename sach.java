abstract class sach implements igiaban, ikiemke {
    protected String masach;
    protected String tieude;
    protected String tacgia;
    protected int namxuatban;
    protected int soluong;
    protected double giacoban;

    public sach(String masach, String tieude, String tacgia, int namxuatban, int soluong, double giacoban, String vitri) {
        this.masach = masach;
        this.tieude = tieude;
        this.tacgia = tacgia;
        this.namxuatban = namxuatban;
        this.soluong = soluong;
        this.giacoban = giacoban;
        khosach.getInstance().themCapNhatViTri(masach, vitri);
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

    public String getvitri() {
        return khosach.getInstance().getViTri(this.masach);
    }

    public void hienthi() {
        System.out.println(toString());
    }

    public boolean kiemtratonkho(int soluongtoithieu) {
        return soluong >= soluongtoithieu;
    }

    public void capnhatvitri(String vitrimo) {
        khosach.getInstance().themCapNhatViTri(this.masach, vitrimo);
        System.out.println("Đã chuyển sách " + tieude + " (" + masach + ") đến khu vực: " + vitrimo + ".");
    }

    public abstract double tinhgiaban();

    public String toString() {
        String vitri = getvitri() != null ? getvitri() : "Khong xac dinh";
        return "Ma=" + masach + ", TieuDe=" + tieude + ", TacGia=" + tacgia + ", NamXB=" + namxuatban + ", SL=" + soluong + ", GiaCoBan=" + giacoban + ", ViTri=" + vitri;
    }
}
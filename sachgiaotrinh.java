class sachgiaotrinh extends sach implements ikiemke {
    private String monhoc;
    private String capdo;
    private double giaban;

    public sachgiaotrinh(String masach, String tieude, String tacgia, int namxuatban, int soluong, double giaCoBan, String monhoc, String capdo) {
        super(masach, tieude, tacgia, namxuatban, soluong, giaCoBan);
        this.monhoc = monhoc;
        this.capdo = capdo;
        this.giaban = tinhGiaBan();
    }
    
    public double getGiaBan() { 
        return giaban; 
    }
    @Override
    public double tinhGiaBan() {
        int soNamDaXuatBan = 2025 - getNamxuatban();
        return getgiaCoBan() + (soNamDaXuatBan * 5000);
    }
    @Override
    public boolean kiemtratonkho(int soluongtoithieu) {
        return getSoluong() >= soluongtoithieu;
    }
    @Override
    public void capnhatvitri(String vitrimoi) {
        System.out.println("Da chuyen sach \"" + getTieude() + "\" den khu vuc " + vitrimoi);
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Mon hoc: " + monhoc);
        System.out.println("Cap do: " + capdo);
        System.out.println("Gia ban: " + tinhGiaBan() + " VND");
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nMon hoc: " + monhoc +
               "\nCap do: " + capdo +
               "\nGia ban: " + tinhGiaBan() + " VND";
    }
}

class sachtieuthuyet extends sach {
    private String theloai;
    private boolean lasachseries;

    public sachtieuthuyet(String masach, String tieude, String tacgia, int namxuatban, int soluong, double giacoban, String vitri, String theloai, boolean lasachseries) {
        super(masach, tieude, tacgia, namxuatban, soluong, giacoban, vitri);
        this.theloai = theloai;
        this.lasachseries = lasachseries;
    }

    public String gettheloai() { return theloai; }
    public void settheloai(String theloai) { this.theloai = theloai; }
    public boolean getlasachseries() { return lasachseries; }
    public void setlasachseries(boolean lasachseries) { this.lasachseries = lasachseries; }

    public double tinhgiaban() {
        return getgiacoban() + (lasachseries ? 15000.0 : 0.0);
    }

    public String toString() {
        return "tieuthuyet" + super.toString() + ", TheLoai=" + theloai + ", LaSeries=" + lasachseries + ", GiaBan=" + tinhgiaban() ;
    }
}

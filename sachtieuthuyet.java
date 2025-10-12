public class sachtieuthuyet extends sach {
    private String theloai;
    private boolean lasachseries;

    public sachtieuthuyet() {
    }

    public sachtieuthuyet(String masach, String tieude, String tacgia, int namxuatban, int soluong, String theloai, boolean lasachseries) {
        super(masach, tieude, tacgia, namxuatban, soluong);
        this.theloai = theloai;
        this.lasachseries = lasachseries;
    }

    public String gettheloai() {
        return theloai;
    }

    public void settheloai(String theloai) {
        this.theloai = theloai;
    }

    public boolean getlasachseries() {
        return lasachseries;
    }

    public void setlasachseries(boolean lasachseries) {
        this.lasachseries = lasachseries;
    }

    @Override
    public String toString() {
        return super.toString() + ", the loai: " + theloai + ", la sach series: " + (lasachseries ? "co" : "khong");
    }

    @Override
    public void hienthithongtin() {
        System.out.println(super.toString());
        System.out.println("the loai: " + theloai);
        if (lasachseries)
            System.out.println("day la sach series.");
        else
            System.out.println("day khong phai la sach series.");
    }
}

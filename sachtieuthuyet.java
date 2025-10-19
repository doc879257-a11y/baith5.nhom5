public class sachtieuthuyet extends sach
{
    private  String theloai;
    private boolean lasachseries;
    public sachtieuthuyet(String masach, String tieude, String tacgia, int namxuatban,int soluong, String theloai, boolean lasachseries)
    {
        super(masach, tieude, tacgia, namxuatban,soluong);
        this.theloai = theloai;
        this.lasachseries= lasachseries;
    }
    public String gettheloai(){
        return theloai;
    }
    public void settheloai(String theloai) {
        this.theloai=theloai;
    }
    public boolean islaSachSeries() {
        return lasachseries;
    }
    public void setsasachseries(boolean lasachseries) {
        this.lasachseries = lasachseries;
    }
    @Override
    public String toString() {
        return super.toString() + ", Thể loại: " + theloai + ", Là sách series: " + (lasachseries ? "Có" : "Không");
    }
}

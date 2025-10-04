public class Sach {
    private String masach;
    private String tieude;
    private String tacgia;
    private int namxuatban;
    private int soluong;

    //Constructor//
    public Sach(String masach, String tieude, String tacgia, int namxuatban, int soluong) {
        this.masach = masach;
        this.tieude = tieude;
        this.tacgia = tacgia;
        this.namxuatban = namxuatban;
        this.soluong = soluong;
    }
    public String getMasach() {
        return masach;
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }

    public String getTieude() {
        return tieude;
    }

    public void setTieude(String tieude) {
        this.tieude = tieude;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public int getNamxuatban() {
        return namxuatban;
    }

    public void setNamxuatban(int namxuatban) {
        this.namxuatban = namxuatban;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        if(soluong >= 0) { // kiểm tra tính hợp lệ
            this.soluong = soluong;
        } else {
            System.out.println("Số lượng không hợp lệ!");
        }
    }

    public void hienThiThongTin() {
        System.out.println("masach: " + masach);
        System.out.println("tieude: " + tieude);
        System.out.println("tacgia: " + tacgia);
        System.out.println("namxuatban: " + namxuatban);
        System.out.println("soluong: " + soluong);
    }
}



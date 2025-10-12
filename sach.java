public class sach {
    private String masach;
    private String tieude;
    private String tacgia;
    private int namxuatban;
    private int soluong;

    public sach() {
    }

    public sach(String masach, String tieude, String tacgia, int namxuatban, int soluong) {
        this.masach = masach;
        this.tieude = tieude;
        this.tacgia = tacgia;
        setnamxuatban(namxuatban);
        setsoluong(soluong);
    }

    public String getmasach() {
        return masach;
    }

    public void setmasach(String masach) {
        this.masach = masach;
    }

    public String gettieude() {
        return tieude;
    }

    public void settieude(String tieude) {
        this.tieude = tieude;
    }

    public String gettacgia() {
        return tacgia;
    }

    public void settacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public int getnamxuatban() {
        return namxuatban;
    }

    public void setnamxuatban(int namxuatban) {
        int namhientai = java.time.Year.now().getValue();
        if (namxuatban > namhientai) {
            System.out.println("nam xuat ban khong hop le!");
            this.namxuatban = 0;
        } else {
            this.namxuatban = namxuatban;
        }
    }

    public int getsoluong() {
        return soluong;
    }

    public void setsoluong(int soluong) {
        if (soluong < 0) {
            System.out.println("so luong khong hop le!");
            this.soluong = 0;
        } else {
            this.soluong = soluong;
        }
    }

    public void hienthithongtin() {
        System.out.println("ma sach: " + masach);
        System.out.println("tieu de: " + tieude);
        System.out.println("tac gia: " + tacgia);
        if (namxuatban == 0) {
            System.out.println("nam xuat ban: chua cap nhat");
        } else {
            System.out.println("nam xuat ban: " + namxuatban);
        }
        System.out.println("so luong: " + soluong);
    }

    @Override
    public String toString() {
        return "ma sach: " + masach +
               ", tieu de: " + tieude +
               ", tac gia: " + tacgia +
               ", nam xuat ban: " + (namxuatban == 0 ? "chua cap nhat" : namxuatban) +
               ", so luong: " + soluong;
    }
}

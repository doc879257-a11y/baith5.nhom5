public abstract class sach {
    private String masach;
    private String tieude;
    private String tacgia;
    private int namxuatban;
    private int soluong;
    private double giaCoBan;

    public sach(String masach, String tieude, String tacgia, int namxuatban, int soluong, double giaCoBan) {
        this.masach = masach;
        this.tieude = tieude;
        this.tacgia = tacgia;
        this.namxuatban = namxuatban;
        this.soluong = soluong;
        this.giaCoBan = giaCoBan;
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
    public void setSoluong(int soluong) 
    {
        if (soluong >= 0) this.soluong = soluong;
            else System.out.println("So luong khong hop le!");
    }
    public double getgiaCoBan() { 
        return giaCoBan; 
    }
    public void setgiaCoBan(double giaCoBan) { 
        this.giaCoBan = giaCoBan; 
    }
    public abstract double tinhGiaBan();
    public void hienThiThongTin() {
        System.out.println("Ma sach: " + masach);
        System.out.println("Tieu de: " + tieude);
        System.out.println("Tac gia: " + tacgia);
        System.out.println("Nam xuat ban: " + namxuatban);
        System.out.println("So luong: " + soluong);
    }

    @Override
    public String toString() {
        return "Ma sach: " + masach +
               "\nTieu de: " + tieude +
               "\nTac gia: " + tacgia +
               "\nNam xuat ban: " + namxuatban +
               "\nSo luong: " + soluong;
    }
}


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
class TestSach {
    public static void main(String[] args) {
        Sach[] Mangsach = {
            new Sach("MS01", "Lap trinh Java", "Nguyen Van An", 2023, 5),
            new Sach("MS02", "Cau truc du lieu", "Tran Thi Binh", 2022, 8),
            new Sach("MS03", "Giai thuat", "Le Van Cuong", 2021, 3),
            new Sach("MS04", "He dieu hanh", "Pham Thi Dung", 2020, 6),
            new Sach("MS05", "Mang may tinh", "Le Huu Thanh", 2019, 4)
        };

        for (Sach Sach : Mangsach) {
            Sach.hienThiThongTin();
            System.out.println("------------------------");
        }
    }
}


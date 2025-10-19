import java.util.Scanner;
import java.util.*;

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

interface ikiemke {
    boolean kiemtratonkho(int soluongtoithieu);
    void capnhatvitri(String vitrimoi);
}

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
    
    public double getGiaBan() { return giaban; }
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

class sachtieuthuyet extends sach implements ikiemke {
    private String theloai;
    private Boolean laSachSeries;
    private double giaban;

    public sachtieuthuyet(String masach, String tieude, String tacgia, int namxuatban, int soluong, double giaCoBan, String theloai, Boolean laSachSeries) {
        super(masach, tieude, tacgia, namxuatban, soluong, giaCoBan);
        this.theloai = theloai;
        this.laSachSeries = laSachSeries;
        this.giaban = tinhGiaBan();
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("==================================");
        System.out.println(" THONG TIN SACH TIEU THUYET ");
        System.out.println("==================================");
        super.hienThiThongTin();
        System.out.println("The loai: " + theloai);
        System.out.println("La sach series: " + laSachSeries);
        System.out.println("Gia ban: " + tinhGiaBan() + " VND");
    }

    public double getGiaBan() { return giaban; }
    @Override
    public double tinhGiaBan() {
        if (laSachSeries) return getgiaCoBan() + 15000;
        else return getgiaCoBan();
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
    public String toString() {
        return "Sach tieu thuyet:\n" +
               super.toString() +
               "\nThe loai: " + theloai +
               "\nLa sach series: " + laSachSeries +
               "\nGia ban: " + tinhGiaBan() + " VND";
    }
}

class Maingiaotrinh {
    public static void main(String[] args) {
        sach[] Mangsach = {
            new sachgiaotrinh("SGT01", "Lap trinh Java", "Nguyen Van An", 2024, 120, 100000, "Lap trinh huong doi tuong", "Dai hoc"),
            new sachgiaotrinh("SGT02", "Cau truc du lieu va giai thuat", "Tran Thi Binh", 2023, 95, 120000, "Cau truc du lieu", "Dai hoc"),
            new sachgiaotrinh("SGT03", "Lap trinh C co ban", "Le Van Cuong", 2022, 80, 95000, "Ngon ngu lap trinh C", "Pho thong"),
            new sachgiaotrinh("SGT04", "Co so du lieu", "Pham Thi Dung", 2021, 100, 110000, "He quan tri co so du lieu", "Dai hoc"),
            new sachgiaotrinh("SGT05", "Mang may tinh", "Le Huu Thanh", 2020, 70, 105000, "Mang va bao mat thong tin", "Cao dang")
        };

        for (sach s : Mangsach) {
            s.hienThiThongTin();
            System.out.println("Ton kho >= 100: " + ((ikiemke)s).kiemtratonkho(100));
            ((ikiemke)s).capnhatvitri(" Ke A1 ");
            System.out.println(s.toString());
            System.out.println("------------------------");
        }
    }
}

class Maintieuthuyet {
    public static void main(String args[]) {
        sachtieuthuyet tt1 = new sachtieuthuyet(
            "STT01", "Harry Potter va Hon da Phu thuy", "J.K. Rowling", 1997, 300, 200000, "Phieu luu - Ky ao", true
        );
        System.out.println("Ton kho >= 150: " + ((ikiemke)tt1).kiemtratonkho(150));
        ((ikiemke)tt1).capnhatvitri("Ke A1");

        sachtieuthuyet tt2 = new sachtieuthuyet(
            "STT02", "Dac Nhan Tam", "Dale Carnegie", 1936, 150, 120000, "Tam ly - Ky nang song", false
        );
        System.out.println("Ton kho >= 100: " + ((ikiemke)tt2).kiemtratonkho(100));
        ((ikiemke)tt2).capnhatvitri("Ke B1");

        sachtieuthuyet tt3 = new sachtieuthuyet(
            "STT03", "Tram nam co don", "Gabriel García Márquez", 1967, 120, 150000, "Hien thuc huyen ao", false
        );
        System.out.println("Ton kho >= 90: " + ((ikiemke)tt3).kiemtratonkho(90));
        ((ikiemke)tt3).capnhatvitri("Ke C2");

        sachtieuthuyet tt4 = new sachtieuthuyet(
            "STT04", "Sherlock Holmes: Tap 1", "Arthur Conan Doyle", 1892, 200, 250000, "Trinh tham", true
        );
        System.out.println("Ton kho >= 110: " + ((ikiemke)tt4).kiemtratonkho(110));
        ((ikiemke)tt4).capnhatvitri("Ke A2");

        sachtieuthuyet tt5 = new sachtieuthuyet(
            "STT05", "Doraemon: Chu meo may den tu tuong lai", "Fujiko F. Fujio", 1970, 500, 180000, "Thieu nhi - Hai huoc", true
        );
        System.out.println("Ton kho >= 200: " + ((ikiemke)tt5).kiemtratonkho(200));
        ((ikiemke)tt5).capnhatvitri("Ke B2");

        tt1.hienThiThongTin();
        tt2.hienThiThongTin();
        tt3.hienThiThongTin();
        tt4.hienThiThongTin();
        tt5.hienThiThongTin();

        System.out.println("\n=== HIEN THI BANG toString() ===");
        System.out.println(tt1);
        System.out.println(tt2);
        System.out.println(tt3);
        System.out.println(tt4);
        System.out.println(tt5);
    }
}

class quanlysach {
    private ArrayList<sach> ds = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    public void themSach() {
        System.out.println("=== THEM SACH MOI ===");
        System.out.print("Loai sach (1. Giao trinh / 2. Tieu thuyet): ");
        int loai = Integer.parseInt(input.nextLine());

        System.out.print("Ma sach: ");
        String masach = input.nextLine();
        System.out.print("Tieu de: ");
        String tieude = input.nextLine();
        System.out.print("Tac gia: ");
        String tacgia = input.nextLine();
        System.out.print("Nam xuat ban: ");
        int namxuatban = Integer.parseInt(input.nextLine());
        System.out.print("So luong: ");
        int soluong = Integer.parseInt(input.nextLine());
        System.out.print("Gia co ban: ");
        double giaCoBan = Double.parseDouble(input.nextLine());

        if (loai == 1) {
            System.out.print("Mon hoc: ");
            String monhoc = input.nextLine();
            System.out.print("Cap do: ");
            String capdo = input.nextLine();
            ds.add(new sachgiaotrinh(masach, tieude, tacgia, namxuatban, soluong, giaCoBan, monhoc, capdo));
        } else {
            System.out.print("The loai: ");
            String theloai = input.nextLine();
            System.out.print("La sach series (true/false): ");
            boolean laSachSeries = Boolean.parseBoolean(input.nextLine());
            ds.add(new sachtieuthuyet(masach, tieude, tacgia, namxuatban, soluong, giaCoBan, theloai, laSachSeries));
        }

        System.out.println("==> Da them sach thanh cong!\n");
    }

    public void xoaSach() {
        System.out.print("Nhap ma sach can xoa: ");
        String masach = input.nextLine();
        sach sachCanXoa = null;

        for (sach s : ds) {
            if (s.getMasach().equals(masach)) {
                sachCanXoa = s;
                break;
            }
        }

        if (sachCanXoa != null) {
            ds.remove(sachCanXoa);
            System.out.println("==> Da xoa sach co ma: " + masach);
        } else {
            System.out.println("==> Khong tim thay ma sach!");
        }
    }

    public void capnhatSach() {
        System.out.print("Nhap ma sach can cap nhat: ");
        String masach = input.nextLine();
        for (sach s : ds) {
            if (s.getMasach().equals(masach)) {
                System.out.print("Nhap ma sach moi: ");
                s.setMasach(input.nextLine());
                System.out.print("Nhap tac gia moi: ");
                s.setTacgia(input.nextLine());
                System.out.println("==> Cap nhat thanh cong!");
                return;
            }
        }
        System.out.println("==> Khong tim thay ma sach!");
    }

    public void timkiem() {
        System.out.print("Nhap ma sach can tim: ");
        String masach = input.nextLine();
        for (sach s : ds) {
            if (s.getMasach().equals(masach)) {
                System.out.println("==> Thong tin sach:");
                s.hienThiThongTin();
                System.out.println("Gia ban uoc tinh: " + s.tinhGiaBan() + " VND");
                return;
            }
        }
        System.out.println("==> Khong tim thay ma sach!");
    }

    public void hienThiDanhSach() {
        if (ds.isEmpty()) {
            System.out.println("Danh sach trong!");
            return;
        }
        System.out.println("=== DANH SACH SACH ===");
        for (sach s : ds) {
            s.hienThiThongTin();
            System.out.println("Gia ban uoc tinh: " + s.tinhGiaBan() + " VND");
            System.out.println("-----------------------------------");
        }
    }

    public void themSachThuCong(sach s) {
        ds.add(s);
    }
}

class testquanlysach {
    public static void main(String[] args) {
        quanlysach ql = new quanlysach();
        sachgiaotrinh gt = new sachgiaotrinh("GT01", "Lap trinh Java", "Nguyen Van A", 2024, 50, 120000, "CNTT", "Dai hoc");
        sachtieuthuyet tt = new sachtieuthuyet("TT01", "Harry Potter", "J.K. Rowling", 2010, 30, 200000, "Fantasy", true);

        ql.themSachThuCong(gt);
        ql.themSachThuCong(tt);

        System.out.println("\n=== DANH SACH SACH CO SAN ===");
        ql.hienThiDanhSach();

        ikiemke kiemke = gt;
        System.out.println("Ton kho >= 100: " + kiemke.kiemtratonkho(100));
        kiemke.capnhatvitri("Kho A1-Ke 5");

        // === MENU BÌNH THƯỜNG ===
        Scanner input = new Scanner(System.in);
        int chon;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Them sach");
            System.out.println("2. Xoa sach");
            System.out.println("3. Cap nhat sach");
            System.out.println("4. Tim kiem sach");
            System.out.println("5. Hien thi danh sach");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            try {
                chon = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Gia tri khong hop le! Vui long nhap so.");
                chon = -1;
            }
            switch (chon) {
                case 1 -> ql.themSach();
                case 2 -> ql.xoaSach();
                case 3 -> ql.capnhatSach();
                case 4 -> ql.timkiem();
                case 5 -> ql.hienThiDanhSach();
                case 0 -> System.out.println("Thoat chuong trinh!");
                default -> System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 0);
        input.close();
    }
}
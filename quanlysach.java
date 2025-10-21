import java.util.Scanner;
import java.util.*;
public class quanlysach {
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


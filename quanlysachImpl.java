package sach;

import java.util.Scanner;
import java.util.*;
public class quanlysachImpl extends quanlysach implements iquanlysach {
    private ArrayList<sach> ds = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    @Override
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

    @Override
    public void Xoasach() {
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

    @Override
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

    @Override
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

    @Override
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
    @Override
    public void themSach(sach s) {
        ds.add(s);
        System.out.println("==> Da them sach vao danh sach!");
    }
    
    @Override
    public void timkiem(String masach) {
        for (sach s : ds) {
            if (s.getMasach().equals(masach)) {
                System.out.println("==> Thong tin sach tim thay:");
                s.hienThiThongTin();
                return;
            }
        }
        System.out.println("==> Khong tim thay sach co ma: " + masach);
    }
    
    @Override
    public void Xoasach(String masach) {
        Iterator<sach> it = ds.iterator();
        while (it.hasNext()) {
            sach s = it.next();
            if (s.getMasach().equals(masach)) {
                it.remove();
                System.out.println("==> Da xoa sach co ma: " + masach);
                return;
            }
        }
        System.out.println("==> Khong tim thay sach can xoa!");
    }
    @Override
    public void capnhatSach(sach s) {
        for (sach item : ds) {
            if (item.getMasach().equalsIgnoreCase(s.getMasach())) {
                item.setTieude(s.getTieude());
                item.setTacgia(s.getTacgia());
                item.setNamxuatban(s.getNamxuatban());
                item.setSoluong(s.getSoluong());
                item.setgiaCoBan(s.getgiaCoBan());
                System.out.println("Cap nhat thanh cong!");
                return;
            }
        }
        System.out.println("Khong tim thay ma sach!");
    }
}

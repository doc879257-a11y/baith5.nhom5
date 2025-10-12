import java.util.ArrayList;
import java.util.Scanner;

public class quanlysach {
    private ArrayList<sach> danhsach;
    private Scanner sc;

    public quanlysach() {
        danhsach = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    public void themsach() {
        System.out.println("chon loai sach muon them:");
        System.out.println("1. sach giao trinh");
        System.out.println("2. sach tieu thuyet");
        System.out.print("lua chon: ");
        int loai = sc.nextInt();
        sc.nextLine();

        System.out.print("nhap ma sach: ");
        String ma = sc.nextLine();
        System.out.print("nhap tieu de: ");
        String tieude = sc.nextLine();
        System.out.print("nhap tac gia: ");
        String tacgia = sc.nextLine();
        System.out.print("nhap nam xuat ban: ");
        int nam = sc.nextInt();
        System.out.print("nhap so luong: ");
        int soluong = sc.nextInt();
        sc.nextLine();

        if (loai == 1) {
            System.out.print("nhap mon hoc: ");
            String monhoc = sc.nextLine();
            System.out.print("nhap cap do: ");
            String capdo = sc.nextLine();
            sachgiaotrinh sgk = new sachgiaotrinh(ma, tieude, tacgia, nam, soluong, monhoc, capdo);
            danhsach.add(sgk);
        } else if (loai == 2) {
            System.out.print("nhap the loai: ");
            String theloai = sc.nextLine();
            System.out.print("co phai sach series khong (true/false): ");
            boolean laseries = sc.nextBoolean();
            sc.nextLine();
            sachtieuthuyet stt = new sachtieuthuyet(ma, tieude, tacgia, nam, soluong, theloai, laseries);
            danhsach.add(stt);
        } else {
            System.out.println("lua chon khong hop le!");
        }
    }

    public void hienthidanhsach() {
        if (danhsach.isEmpty()) {
            System.out.println("danh sach hien dang trong!");
            return;
        }

        System.out.println("\n=== DANH SACH SACH ===");
        for (sach s : danhsach) {
            System.out.println(s.toString());
        }
    }

    public sach timsachtheoma(String masach) {
        for (sach s : danhsach) {
            if (s.getmasach().equalsIgnoreCase(masach)) {
                return s;
            }
        }
        return null;
    }

    public void xoasachtheoma(String masach) {
        sach s = timsachtheoma(masach);
        if (s != null) {
            danhsach.remove(s);
            System.out.println("da xoa sach co ma: " + masach);
        } else {
            System.out.println("khong tim thay sach co ma: " + masach);
        }
    }

    public void capnhatsach(String masach) {
        sach s = timsachtheoma(masach);
        if (s == null) {
            System.out.println("khong tim thay sach can cap nhat!");
            return;
        }

        System.out.println("cap nhat thong tin cho sach co ma: " + masach);
        System.out.print("nhap tieu de moi: ");
        String tieude = sc.nextLine();
        System.out.print("nhap tac gia moi: ");
        String tacgia = sc.nextLine();
        System.out.print("nhap nam xuat ban moi: ");
        int nam = sc.nextInt();
        System.out.print("nhap so luong moi: ");
        int soluong = sc.nextInt();
        sc.nextLine();

        s.settieude(tieude);
        s.settacgia(tacgia);
        s.setnamxuatban(nam);
        s.setsoluong(soluong);

        System.out.println("da cap nhat thong tin sach!");
    }
}

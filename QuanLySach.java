import java.util.ArrayList;
import java.util.Scanner;
public class QuanLySach {
    private ArrayList <SachGiaoTrinh> ds = new ArrayList<>();
    private Scanner input = new Scanner(System.in);
    // Thêm sách mới
    public void ThemSach() {
        System.out.println("=== Them sach moi ===");
        System.out.println("Them ma sach: ");
        String masach = input.nextLine();
        System.out.println("Them ten sach: ");
        String tensach = input.nextLine();
        System.out.println("Them tac gia: ");
        String tacgia = input.nextLine();
        System.out.println("Them nam xuat ban: ");
        int namxuatban = Integer.parseInt(input.nextLine());
        System.out.println("Them so trang: ");
        int sotrang = Integer.parseInt(input.nextLine());
        System.out.println("Them mon hoc: ");
        String monhoc = input.nextLine();
        System.out.println("Them cap dao tao");
        String capdo = input.nextLine();

        SachGiaoTrinh s = new SachGiaoTrinh(masach, tensach, tacgia, namxuatban, sotrang, monhoc, capdo);
        ds.add(s);
        System.out.println("==> Da them sach thanh cong!\n");
    }
    public void Xoasach() {
        System.out.println("Nhap ma sach can xoa: ");
        String masach = input.nextLine();
        for (SachGiaoTrinh s : ds) {
            if(s.getMasach().equals(masach)) {
                ds.remove(s);
                System.out.println("==> Da xoa sach co ma: " + masach);
                return;
            }
        }
        System.out.println("==> Khong tim thay ma sach!");
    }
    public void CapnhatSach () {
        System.out.println("Nhap ma sach can cap nhat ");
        String masach = input.nextLine();
        for(SachGiaoTrinh s: ds) {
            if(s.getMasach().equals(masach)) {
                System.out.println("Nhap ten moi");
                s.setMasach(input.nextLine());
                System.out.println("Nhap tac gia moi");
                s.setTacgia(input.nextLine());
                System.out.println("==> Cap nhat thanh cong!");
                return;
            }
        }
        System.out.println("==> Khong tim thay ma sach!");
    }
    public void Timkiem () {
        System.out.println("Nhap ma sach can tim");
        String masach = input.nextLine();
        for(SachGiaoTrinh s: ds) {
            if(s.getMasach().equals(masach)) {
                System.out.println("==> Thong tin sach:");
                s.hienThiThongTin();
                return;
            }
        }
        System.out.println("==> Khong tim thay ma sach!");
    }
    public void hienThiDanhSach() {
        System.out.println("=== Danh sach sach giao trinh ===");
        for(SachGiaoTrinh s: ds){
            s.hienThiThongTin();
        }
    }
}
class TestQuanLySach {
    public static void main(String[] args) {
        // Tạo đối tượng từ lớp QuanLySach
        QuanLySach quanLySach = new QuanLySach();
        quanLySach.ThemSach();
        quanLySach.ThemSach(); 
        quanLySach.ThemSach();  
        quanLySach.ThemSach();  
        quanLySach.ThemSach(); 
        
        
        quanLySach.hienThiDanhSach();
        quanLySach.Timkiem();
    }
}
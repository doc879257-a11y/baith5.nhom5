import java.util.Scanner;
public class MainChucNang {
    public static void main(String args[]) {
        QuanLySach ql = new QuanLySach();
        Scanner input = new Scanner(System.in);
        int chon;
        do {
            System.out.println("\n=== MENU QUAN LY SACH ===");
            System.out.println("1. Them sach");
            System.out.println("2. Xoa sach");
            System.out.println("3. Cap nhat sach");
            System.out.println("4. Tim kiem sach");
            System.out.println("5. Hien thi tat ca sach");
            System.out.println("0. Chon sach:");
            chon = Integer.parseInt(input.nextLine());
            
            switch (chon) {
                case 1: ql.ThemSach(); break;
                case 2: ql.Xoasach(); break;
                case 3: ql.CapnhatSach(); break;
                case 4: ql.Timkiem(); break;
                case 5: ql.hienThiDanhSach(); break;
                case 0: System.out.println("==> Thoat chuong trinh."); break;
                default: System.out.println("==> Lua chon khong hop le!");
            }
        } while (chon !=0);
        input.close();        
    }
}

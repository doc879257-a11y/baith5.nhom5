package quanlibansach;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        iquanlisach quanly = new quanlisachimpl();
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            System.out.println("\n===== MENU QUAN LY SACH =====");
            System.out.println("1. Them Sach Giao Trinh");
            System.out.println("2. Them Sach Tieu Thuyet");
            System.out.println("3. Hien thi danh sach sach");
            System.out.println("4. Tim sach theo ma");
            System.out.println("5. Xoa sach");
            System.out.println("6. Tong gia ban tat ca");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            chon = sc.nextInt(); sc.nextLine();

            switch (chon) {
                case 1 -> {
                    System.out.print("Ma: "); String ma = sc.nextLine();
                    System.out.print("Tieu de: "); String td = sc.nextLine();
                    System.out.print("Tac gia: "); String tg = sc.nextLine();
                    System.out.print("Nam XB: "); int nam = sc.nextInt();
                    System.out.print("So luong: "); int sl = sc.nextInt();
                    System.out.print("Gia co ban: "); double gb = sc.nextDouble(); sc.nextLine();
                    System.out.print("Mon hoc: "); String mh = sc.nextLine();
                    System.out.print("Cap do: "); String cd = sc.nextLine();
                    quanly.themsach(new sachgiaotrinh(ma, td, tg, nam, sl, gb, mh, cd));
                }
                case 2 -> {
                    System.out.print("Ma: "); String ma = sc.nextLine();
                    System.out.print("Tieu de: "); String td = sc.nextLine();
                    System.out.print("Tac gia: "); String tg = sc.nextLine();
                    System.out.print("Nam XB: "); int nam = sc.nextInt();
                    System.out.print("So luong: "); int sl = sc.nextInt();
                    System.out.print("Gia co ban: "); double gb = sc.nextDouble(); sc.nextLine();
                    System.out.print("The loai: "); String tl = sc.nextLine();
                    System.out.print("Series (true/false): "); boolean sr = sc.nextBoolean(); sc.nextLine();
                    quanly.themsach(new sachtieuthuyet(ma, td, tg, nam, sl, gb, tl, sr));
                }
                case 3 -> quanly.hienthidanhsach();
                case 4 -> {
                    System.out.print("Nhap ma can tim: ");
                    String ma = sc.nextLine();
                    sach s = quanly.timsachtheoma(ma);
                    if (s != null) System.out.println(s);
                    else System.out.println("Khong tim thay!");
                }
                case 5 -> {
                    System.out.print("Nhap ma can xoa: ");
                    String ma = sc.nextLine();
                    System.out.println(quanly.xoasach(ma) ? "Da xoa!" : "Khong tim thay!");
                }
                case 6 -> System.out.println("Tong gia ban: " + quanly.tonggiabantatca() + " VND");
                case 0 -> System.out.println("Thoat chuong trinh!");
                default -> System.out.println("Chon sai!");
            }
        } while (chon != 0);
        sc.close();
    }
}

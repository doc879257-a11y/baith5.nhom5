package quanlibansach;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        iquanlisach quanly = new quanlisachimpl();
        Scanner sc = new Scanner(System.in);
        sach s1 = new sachgiaotrinh("GT01", "Lap trinh C co ban", "Nguyen Van A", 2020, 10, 85000, "Tin hoc", "Dai hoc");
        sach s2 = new sachtieuthuyet("TT02", "Dac Nhan Tam", "Dale Carnegie", 2019, 20, 99000, "Ky nang song", false);
        sach s3 = new sachgiaotrinh("GT03", "Cau truc du lieu", "Tran Thi B", 2021, 5, 125000, "Tin hoc", "Dai hoc");
        sach s4 = new sachtieuthuyet("TT04", "Harry Potter", "J.K. Rowling", 2007, 30, 150000, "Gia tuong", true);
        sach s5 = new sachgiaotrinh("GT05", "Toan cao cap", "Pham Van C", 2018, 15, 110000, "Toan hoc", "Cao dang");
        sach s6 = new sachtieuthuyet("TT06", "Sherlock Holmes", "Arthur Conan Doyle", 2015, 25, 135000, "Trinh tham", true);

        quanly.themsach(s1);
        quanly.themsach(s2);
        quanly.themsach(s3);
        quanly.themsach(s4);
        quanly.themsach(s5);
        quanly.themsach(s6);
        

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
                case 6 -> 
                {
                    double tong = quanly.tonggiabantatca();
                    java.text.DecimalFormat df = new java.text.DecimalFormat("#,### VND");
                    System.out.println("Tong gia ban tat ca sach: " + df.format(tong));
                }
                case 0 -> System.out.println("Thoat chuong trinh!");
                default -> System.out.println("Chon sai!");
            }
        } while (chon != 0);
        sc.close();
    }
}

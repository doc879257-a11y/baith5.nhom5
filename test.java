import java.util.Scanner;
import java.time.Year;

public class test {
    public static void main(String[] args) {
        quanlysach ql = new quanlysach();
        Scanner sc = new Scanner(System.in);
        int chon, namht = Year.now().getValue();

        // du lieu mau
        sachgiaotrinh sg1 = new sachgiaotrinh("SG001", "Lap trinh C", "Nguyen Van A", 2023, 50, 40000, "Lap trinh", "Dai hoc");
        sachgiaotrinh sg2 = new sachgiaotrinh("SG002", "Toan cao cap", "Tran Thi B", 2022, 30, 35000, "Toan hoc", "Dai hoc");
        sachtieuthuyet st1 = new sachtieuthuyet("ST001", "De men phieu luu ky", "To Hoai", 2020, 20, 50000, "Thieu nhi", true);
        sachtieuthuyet st2 = new sachtieuthuyet("ST002", "Harry Potter", "J.K. Rowling", 2010, 15, 80000, "Phieu luu", true);
        sachtieuthuyet st3 = new sachtieuthuyet("ST003", "Tuoi tho du doi", "Phung Quan", 2015, 10, 60000, "Lich su", false);

        ql.themsach(sg1);
        ql.themsach(sg2);
        ql.themsach(st1);
        ql.themsach(st2);
        ql.themsach(st3);

        do {
            System.out.println("\n=== MENU QUAN LY SACH ===");
            System.out.println("1. Hien thi danh sach sach");
            System.out.println("2. Them sach giao trinh");
            System.out.println("3. Them sach tieu thuyet");
            System.out.println("4. Tim sach theo ma");
            System.out.println("5. Xoa sach theo ma");
            System.out.println("6. Cap nhat so luong sach");
            System.out.println("7. Kiem ke va cap nhat vi tri");
            System.out.println("8. Tinh tong gia ban tat ca");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    ql.hienthidssach();
                    break;
                case 2:
                    System.out.print("Ma sach: "); String ma1 = sc.nextLine();
                    System.out.print("Tieu de: "); String td1 = sc.nextLine();
                    System.out.print("Tac gia: "); String tg1 = sc.nextLine();
                    System.out.print("Nam XB: "); int nam1 = sc.nextInt();
                    System.out.print("So luong: "); int sl1 = sc.nextInt();
                    System.out.print("Gia co ban: "); double g1 = sc.nextDouble(); sc.nextLine();
                    System.out.print("Mon hoc: "); String mon = sc.nextLine();
                    System.out.print("Cap do: "); String cap = sc.nextLine();
                    ql.themsach(new sachgiaotrinh(ma1, td1, tg1, nam1, sl1, g1, mon, cap));
                    break;
                case 3:
                    System.out.print("Ma sach: "); String ma2 = sc.nextLine();
                    System.out.print("Tieu de: "); String td2 = sc.nextLine();
                    System.out.print("Tac gia: "); String tg2 = sc.nextLine();
                    System.out.print("Nam XB: "); int nam2 = sc.nextInt();
                    System.out.print("So luong: "); int sl2 = sc.nextInt();
                    System.out.print("Gia co ban: "); double g2 = sc.nextDouble(); sc.nextLine();
                    System.out.print("The loai: "); String tl = sc.nextLine();
                    System.out.print("La series (true/false): "); boolean sr = sc.nextBoolean();
                    ql.themsach(new sachtieuthuyet(ma2, td2, tg2, nam2, sl2, g2, tl, sr));
                    break;
                case 4:
                    System.out.print("Nhap ma sach: ");
                    String ma = sc.nextLine();
                    sach s = ql.timsachtheoma(ma);
                    if (s != null) System.out.println(s);
                    else System.out.println("Khong tim thay sach!");
                    break;
                case 5:
                    System.out.print("Nhap ma can xoa: ");
                    String mx = sc.nextLine();
                    if (ql.xoasach(mx)) System.out.println("Da xoa!");
                    else System.out.println("Khong tim thay!");
                    break;
                case 6:
                    System.out.print("Nhap ma sach can cap nhat: ");
                    String mc = sc.nextLine();
                    System.out.print("Nhap so luong moi: ");
                    int slm = sc.nextInt();
                    if (ql.capnhatsoluong(mc, slm)) System.out.println("Da cap nhat!");
                    else System.out.println("Khong tim thay sach!");
                    break;
                case 7:
                    System.out.print("Nhap ma sach: ");
                    String mk = sc.nextLine();
                    sach ss = ql.timsachtheoma(mk);
                    if (ss != null && ss instanceof ikiemke) {
                        ikiemke kk = (ikiemke) ss;
                        System.out.print("Nhap so luong toi thieu: ");
                        int min = sc.nextInt(); sc.nextLine();
                        if (kk.kiemtratonkho(min)) System.out.println("Du hang ton kho");
                        else System.out.println("Thieu hang ton kho");
                        System.out.print("Nhap vi tri moi: ");
                        String vt = sc.nextLine();
                        kk.capnhatvitri(vt);
                    } else System.out.println("Khong tim thay sach hoac khong ho tro kiem ke!");
                    break;
                case 8:
                    System.out.println("Tong gia ban tat ca: " + ql.tonggiabantatca() + " VND");
                    break;
            }
        } while (chon != 0);
        sc.close();
    }
}

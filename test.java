import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        quanlysach ql = new quanlysach();
        int chon;

        sach s1 = new sach("b001", "lap trinh java", "nguyen van a", 2022, 10);
        sach s2 = new sach("b002", "co so du lieu", "tran thi b", 2021, 5);
        sach s3 = new sach();
        s3.setmasach("b003");
        s3.settieude("thiet ke web");
        s3.settacgia("le van c");
        s3.setnamxuatban(2021);
        s3.setsoluong(4);

        System.out.println("=== THONG TIN SACH CO BAN ===");
        s1.hienthithongtin();
        s2.hienthithongtin();
        s3.hienthithongtin();

        do {
            System.out.println("\n========== MENU QUAN LY SACH ==========");
            System.out.println("1. them sach moi");
            System.out.println("2. hien thi danh sach");
            System.out.println("3. tim sach theo ma");
            System.out.println("4. cap nhat thong tin sach");
            System.out.println("5. xoa sach theo ma");
            System.out.println("0. thoat");
            System.out.print(">> nhap lua chon cua ban: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    ql.themsach();
                    break;
                case 2:
                    ql.hienthidanhsach();
                    break;
                case 3:
                    System.out.print("nhap ma sach can tim: ");
                    String matim = sc.nextLine();
                    sach s = ql.timsachtheoma(matim);
                    if (s != null)
                        System.out.println("tim thay: " + s.toString());
                    else
                        System.out.println("khong tim thay sach co ma: " + matim);
                    break;
                case 4:
                    System.out.print("nhap ma sach can cap nhat: ");
                    String macap = sc.nextLine();
                    ql.capnhatsach(macap);
                    break;
                case 5:
                    System.out.print("nhap ma sach can xoa: ");
                    String maxoa = sc.nextLine();
                    ql.xoasachtheoma(maxoa);
                    break;
                case 0:
                    System.out.println("thoat chuong trinh. tam biet!");
                    break;
                default:
                    System.out.println("lua chon khong hop le!");
            }
        } while (chon != 0);
        sc.close();
    }
}

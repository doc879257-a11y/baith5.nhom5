import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        iquanlysach quanLy = new quanlysachimpl();

        while (true) {
            System.out.println("\n=== QUẢN LÝ THƯ VIỆN ===");
            System.out.println("1. Thêm sách");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Tìm kiếm sách");
            System.out.println("4. Xóa sách");
            System.out.println("5. Cập nhật vị trí sách");
            System.out.println("6. Kiểm tra tồn kho");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            int chon = sc.nextInt();
            sc.nextLine();

            if (chon == 0) break;

            switch (chon) {
                case 1 -> themSachMoi(sc, quanLy);
                case 2 -> quanLy.hienThiDanhSach();
                case 3 -> {
                    System.out.print("Nhập mã sách: ");
                    String ma = sc.nextLine();
                    sach s = quanLy.timKiemSach(ma);
                    if (s != null) {
                        System.out.println(s);
                        System.out.println("Giá bán: " + String.format("%.0f VNĐ", s.tinhGiaBan()));
                    } else {
                        System.out.println("Không tìm thấy!");
                    }
                }
                case 4 -> {
                    System.out.print("Nhập mã sách cần xóa: ");
                    quanLy.xoaSach(sc.nextLine());
                }
                case 5 -> {
                    System.out.print("Mã sách: ");
                    String maCapNhat = sc.nextLine();
                    sach sachCapNhat = quanLy.timKiemSach(maCapNhat);
                    if (sachCapNhat != null) {
                        System.out.print("Vị trí mới: ");
                        sachCapNhat.capNhatViTri(sc.nextLine());
                    } else {
                        System.out.println("Không tìm thấy sách!");
                    }
                }
                case 6 -> {
                    System.out.print("Mã sách: ");
                    String maKiemTra = sc.nextLine();
                    System.out.print("Số lượng tối thiểu: ");
                    int slMin = sc.nextInt();
                    sach sk = quanLy.timKiemSach(maKiemTra);
                    if (sk != null) {
                        System.out.println("Tồn kho đủ: " + sk.kiemTraTonKho(slMin));
                    } else {
                        System.out.println("Không tìm thấy sách!");
                    }
                }
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        }
        sc.close();
    }

    private static void themSachMoi(Scanner sc, iquanlysach quanLy) {
        System.out.println("Loại sách: 1. Giáo trình | 2. Tiểu thuyết");
        int loai = sc.nextInt();
        sc.nextLine();

        System.out.print("Mã sách: "); String ma = sc.nextLine();
        System.out.print("Tiêu đề: "); String tieuDe = sc.nextLine();
        System.out.print("Tác giả: "); String tacGia = sc.nextLine();
        System.out.print("Năm XB: "); int nam = sc.nextInt();
        System.out.print("Số lượng: "); int sl = sc.nextInt();
        System.out.print("Giá cơ bản: "); double gia = sc.nextDouble();
        sc.nextLine();

        sach sach;
        if (loai == 1) {
            System.out.print("Môn học: "); String mon = sc.nextLine();
            System.out.print("Cấp độ: "); String cap = sc.nextLine();
            sach = new sachgiaotrinh(ma, tieuDe, tacGia, nam, sl, gia, mon, cap);
        } else {
            System.out.print("Thể loại: "); String tl = sc.nextLine();
            System.out.print("Là series? (true/false): "); boolean series = sc.nextBoolean();
            sc.nextLine();
            sach = new sachtieuthuyet(ma, tieuDe, tacGia, nam, sl, gia, tl, series);
        }
        quanLy.themSach(sach);
    }
}
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        iquanlisach quanLy = new quanlisachimpl(); 
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            System.out.println("\n===== MENU QUẢN LÝ SÁCH =====");
            System.out.println("1. Thêm Sách Tiểu Thuyết");
            System.out.println("2. Thêm Sách Giáo Trình");
            System.out.println("3. Hiển thị danh sách sách");
            System.out.println("4. Tìm kiếm sách theo mã");
            System.out.println("5. Xóa sách theo mã");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            chon = sc.nextInt();
            sc.nextLine(); 

            switch (chon) {
                case 1 -> {
                    System.out.print("Nhập mã sách: ");
                    String ma = sc.nextLine();
                    System.out.print("Tiêu đề: ");
                    String td = sc.nextLine();
                    System.out.print("Tác giả: ");
                    String tg = sc.nextLine();
                    System.out.print("Năm xuất bản: ");
                    int nam = sc.nextInt();
                    System.out.print("Số lượng: ");
                    int sl = sc.nextInt();
                    System.out.print("Giá cơ bản: ");
                    double gb = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Thể loại: ");
                    String tl = sc.nextLine();
                    System.out.print("Là sách series? (true/false): ");
                    boolean series = sc.nextBoolean();

                    sach stt = new sachtieuthuyet(ma, td, tg, nam, sl, gb, tl, series);
                    quanLy.themsach(stt);
                    System.out.println(" Đã thêm sách tiểu thuyết!");
                }

                case 2 -> {
                    System.out.print("Nhập mã sách: ");
                    String ma = sc.nextLine();
                    System.out.print("Tiêu đề: ");
                    String td = sc.nextLine();
                    System.out.print("Tác giả: ");
                    String tg = sc.nextLine();
                    System.out.print("Năm xuất bản: ");
                    int nam = sc.nextInt();
                    System.out.print("Số lượng: ");
                    int sl = sc.nextInt();
                    System.out.print("Giá cơ bản: ");
                    double gb = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Môn học: ");
                    String mh = sc.nextLine();
                    System.out.print("Cấp độ (ĐH, THPT, ...): ");
                    String cd = sc.nextLine();

                    sach sgt = new sachgiaotrinh(ma, td, tg, nam, sl, gb, mh, cd);
                    quanLy.themsach(sgt);
                    System.out.println(" Đã thêm sách giáo trình!");
                }

                case 3 -> {
                    System.out.println("\n📚 DANH SÁCH SÁCH HIỆN CÓ:");
                    quanLy.hienthidanhsach();
                }

                case 4 -> {
                    System.out.print("Nhập mã sách cần tìm: ");
                    String matim = sc.nextLine();
                    sach kq = quanLy.timkiemsach(matim);
                    System.out.println(kq != null ? kq : "⚠Không tìm thấy sách!");
                }

                case 5 -> {
                    System.out.print("Nhập mã sách cần xóa: ");
                    String maxoa = sc.nextLine();
                    System.out.println(quanLy.xoasach(maxoa) ? "🗑️ Đã xóa sách!" : "⚠ Không tồn tại mã sách!");
                }

                case 0 -> System.out.println(" Kết thúc chương trình!");
                default -> System.out.println(" Lựa chọn không hợp lệ!");
            }

        } while (chon != 0);
        sc.close();
    }
}


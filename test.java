import java.util.Calendar;
import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        iquanlysach ql = new quanlysach();
        sach gt = new sachgiaotrinh("gt001","ctdl", "nguyen van a", 2022, 120, 90000, "a1-k1", "ctdl", "daihoc");
        sach tt = new sachtieuthuyet("tt001","doraemon", "fujiko", 2010, 50, 60000, "b2-k3", "thieunhi", true);
        ql.themsach(gt);
        ql.themsach(tt);
        int chon;

        do {
            System.out.println("\n===== MENU QUẢN LÝ SÁCH =====");
            System.out.println("1. Thêm sách giáo trình");
            System.out.println("2. Thêm sách tiểu thuyết");
            System.out.println("3. Hiển thị danh sách");
            System.out.println("4. Tìm kiếm sách");
            System.out.println("5. Xóa sách");
            System.out.println("6. Kiểm tra tồn kho");
            System.out.println("7. Cập nhật vị trí sách");
            System.out.println("8. Tính tổng giá bán tất cả sách");
            System.out.println("0. Thoát");
            System.out.print("Nhập Lựa Chọn: ");
            chon = sc.nextInt(); sc.nextLine();

            switch (chon) {
                case 1 -> {
                    System.out.print("Nhập mã sách: ");
                    String ma = sc.nextLine();
                    System.out.print("Nhập tiêu đề: ");
                    String td = sc.nextLine();
                    System.out.print("Nhập tác giả: ");
                    String tg = sc.nextLine();
                    int nam;
                    do {
                        System.out.print("Nhập năm xuất bản: ");
                        nam = sc.nextInt();
                        if (nam > Calendar.getInstance().get(Calendar.YEAR)) {
                            System.out.println(" Năm xuất bản không hợp lệ!(phải nhỏ hơn hoặc bằng năm hiện tại)");
                        }
                    } while (nam > Calendar.getInstance().get(Calendar.YEAR));

                    int sl;
                    do {
                        System.out.print("Nhập số lượng: ");
                        sl = sc.nextInt();
                        if (sl <= 0) System.out.println(" Số lượng phải lớn hơn 0!");
                    } while (sl <= 0);

                    double gia;
                    do {
                        System.out.print("Nhập giá cơ bản: ");
                        gia = sc.nextDouble();
                        if (gia <= 0) System.out.println(" Giá cơ bản phải lớn hơn 0!");
                    } while (gia <= 0);
                    sc.nextLine();
                    System.out.print("Vi tri:");
                    String vt = sc.nextLine();
                    System.out.print("Môn học: ");
                    String mh = sc.nextLine();
                    System.out.print("Cấp độ: ");
                    String cd = sc.nextLine();
                    ql.themsach(new sachgiaotrinh(ma, td, tg, nam, sl, gia,vt, mh, cd));
                }
                case 2 -> {
                    System.out.print("Nhập mã sách: ");
                    String ma = sc.nextLine();
                    System.out.print("Nhập tiêu đề: ");
                    String td = sc.nextLine();
                    System.out.print("Nhập tác giả: ");
                    String tg = sc.nextLine();
                    int nam;
                    do {
                        System.out.print("Nhập năm xuất bản: ");
                        nam = sc.nextInt();
                        if (nam > Calendar.getInstance().get(Calendar.YEAR)) {
                            System.out.println(" Năm xuất bản không hợp lệ! (phải nhỏ hơn hoặc bằng năm hiện tại)");
                        }
                    } while (nam > Calendar.getInstance().get(Calendar.YEAR));

                    int sl;
                    do {
                        System.out.print("Nhập số lượng: ");
                        sl = sc.nextInt();
                        if (sl <= 0) System.out.println(" Số lượng phải lớn hơn 0!");
                    } while (sl <= 0);

                    double gia;
                    do {
                        System.out.print("Nhập giá cơ bản: ");
                        gia = sc.nextDouble();
                        if (gia <= 0) System.out.println(" Giá cơ bản phải lớn hơn 0!");
                    } while (gia <= 0);
                    sc.nextLine();
                    System.out.print("Vi tri:");
                    String vt = sc.nextLine();
                    System.out.print("Thể loại: "); String tl = sc.nextLine();
                    System.out.print("Là series (true/false): ");
                    boolean ser = sc.nextBoolean();
                    ql.themsach(new sachtieuthuyet(ma, td, tg, nam, sl, gia,vt, tl, ser));
                }
                case 3 -> ql.hienthidanhsach();
                case 4 -> {
                    System.out.print("Nhập mã cần tìm: ");
                    String ma = sc.nextLine();
                    sach s = ql.timkiemsach(ma);
                    System.out.println(s != null ? s : "Không tìm thấy!");
                }
                case 5 -> {
                    System.out.print("Nhập mã cần xóa: ");
                    String ma = sc.nextLine();
                    System.out.println(ql.xoasach(ma) ? "Đã xóa!" : "Không tồn tại!");
                }
                case 6 -> {
                    System.out.print("Nhập mã sách cần kiểm tra: ");
                    String ma = sc.nextLine();
                    sach s = ql.timkiemsach(ma);
                    if (s != null) {
                        System.out.print("Nhập số lượng tối thiểu: ");
                        int min = sc.nextInt();
                        System.out.println(s.kiemtratonkho(min) ? "Đủ hàng trong kho." : "Không đủ hàng.");
                    } else System.out.println("Không tìm thấy sách!");
                }
                case  7 -> {
                    System.out.print("Nhập mã sách cần cập nhật: ");
                    String ma = sc.nextLine();
                    sach s = ql.timkiemsach(ma);

                    if (s != null) {
                        String vitrimoi;
                        boolean trung;
                        do {
                            System.out.print("Nhập vị trí mới: ");
                            vitrimoi = sc.nextLine();
                            trung = false;
                            for (sach khac : ((quanlysach) ql).getdanhsachsach()) {
                                if (khac != s && khac.getvitri().equalsIgnoreCase(vitrimoi)) {
                                    trung = true;
                                    System.out.println("Vị trí này đã được dùng cho sách khác (" + khac.gettieude() + "). Hãy nhập vị trí khác!");
                                    break;
                                }
                            }
                        } while (trung);

                        s.capnhatvitri(vitrimoi);
                    } else {
                        System.out.println("Không tìm thấy sách!");
                    }
                }
                case 8->{
                    double tong = ql.tonggiabantatca();
                    System.out.println("→ Tổng giá bán của tất cả sách có trong kho: " + tong + " VNĐ");
                    break;
                }
                case 0 -> System.out.println("Thoát chương trình!");
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (chon != 0);
        sc.close();
    }
}

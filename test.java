public class test {
    public static void main(String[] args)
    {
    // sach sach1 = new //sach("s001", "lap trinh java", "nguyen van a", 2020, 5);
    // sach sach2 = new sach();
    //  sach2.setmasach("s002");
    // sach2.settieude("cau truc du lieu");
    // sach2.settacgia("tran van b");
    // sach2.setnamxuatban(2019);
    // sach2.setsoluong(7);
    // System.out.println("=== thong tin sach 1 ===");
    //sach1.hienthithongtin();
    //System.out.println("=== thong tin sach 2 ===");
    //sach2.hienthithongtin();
    //quanlisach ql = new quanlisach();
    //sachgiaotrinh sg1 = new sachgiaotrinh("gt01", "lap trinh java", "nguyen van a", 85000, 2222, "dai hoc");
    // sachtieuthuyet st1 = new sachtieuthuyet("tt01", "dac nhan tam", "dale carnegie", 120000, "3333", false);
    // }
        quanlisach ql = new quanlisach();

        // Tạo các đối tượng sách
        sachgiaotrinh sg1 = new sachgiaotrinh("gt01", "lap trinh java", "nguyen van a", 85000, 55, "dai hoc");
        sachtieuthuyet st1 = new sachtieuthuyet("tt01", "dac nhan tam", "dale carnegie", 120000, 22,"tieu thuyet",true);

        // Gọi hàm themSach() để thêm vào danh sách
        ql.themsach(sg1);
        ql.themsach(st1);

        // Hiển thị danh sách
        System.out.println("=== danh sach sach ===");
        ql.hienThiDanhSach();

        // Tìm kiếm sách theo mã
        System.out.println("\n=== tim sach theo ma tt01 ===");
        sach timThay = ql.timKiem("tt01");
        if (timThay != null) {
            System.out.println(timThay);
        } else {
            System.out.println("khong tim thay sach!");
        }
        sach timSach = ql.timKiem("TT001");
        if (timSach != null) {
            System.out.println(timSach);
        } else {
            System.out.println("Khong tim thay sach!");
        }


        // Xóa sách
        System.out.println("\n=== xoa sach tt01 ===");
        ql.xoaxach("tt01");
        ql.hienThiDanhSach();
    }
}

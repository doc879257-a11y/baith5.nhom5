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
        sachgiaotrinh sg = new sachgiaotrinh("gt01", "lap trinh java", "nguyen van a", 2020, 55, 85000,"cntt","daihoc");
        sachtieuthuyet st = new sachtieuthuyet("tt01", "dac nhan tam", "dale carnegie", 2015, 22, 120000, "tâm lý học", true);

        // Gọi hàm themSach() để thêm vào danh sách
        ql.themsach(sg);
        ql.themsach(st);

        // Hiển thị danh sách
        System.out.println("=== danh sach sach ===");
        ql.hienthidanhsach();
        ikiemke kiemke = sg;
        System.out.println("\n=== KIỂM TRA TỒN KHO & CẬP NHẬT VỊ TRÍ ===");
        System.out.println("Đủ hàng? " + (kiemke.kiemtratonkho(40) ? "Có" : "Không"));
        kiemke.capnhatvitri("Kho A1 - Kệ 5");

        // Tìm kiếm sách theo mã
        //System.out.println("\n=== tim sach theo ma tt01 ===");
       // sach timThay = ql.timKiem("tt01");
        //if (timThay != null) {
          //  System.out.println(timThay);
        //} else {
          //  System.out.println("khong tim thay sach!");
        //}
        //sach timSach = ql.timKiem("TT001");
        //if (timSach != null) {
          //  System.out.println(timSach);
        //} else {
          //  System.out.println("Khong tim thay sach!");
        //}


        // Xóa sách
        //System.out.println("\n=== xoa sach tt01 ===");
        //ql.xoaxach("tt01");
        //ql.hienThiDanhSach();
    }
}

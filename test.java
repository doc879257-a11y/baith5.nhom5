public class test {
    public static void main(String[] args) {

//        sach sach1 = new sach("S001", "Lập trình Java", "Nguyễn Văn A", 2021, 5);
//        sach sach2 = new sach("S002", "Cấu trúc dữ liệu", "Trần Thị B", 2019, 3);
//
//        sach sach3 = new sach();
//        sach3.setMaSach("S003");
//        sach3.setTieuDe("Giai thuat");
//        sach3.setTacGia("Lê Văn C");
//        sach3.setNamXuatBan(2020);
//        sach3.setSoLuong(7);
//
//        sach1.hienThiThongTin();
//        sach2.hienThiThongTin();
//        sach3.hienThiThongTin();


        sach sach4 = new sachgiaotrinh("GT001", "Lap trinh Java", "Nguyen Van A", 2021, 10,
                "Cong nghe thong tin", "Dai hoc", 5000);

        sach sach5 = new sachtieuthuyet("TT001", "Harry Potter", "J.K. Rowling", 2005, 20,
                "Phieu luu - Gia tuong", true, 6000);


        quanlysach ql = new quanlysach();
        ql.themSach(sach4);
        ql.themSach(sach5);
        ql.hienThiDanhSach();
 
        sach timSach = ql.timSachTheoMa("TT001");
        if (timSach != null) {
            System.out.println(timSach);
        } else {
            System.out.println("Khong tim thay sach!");
        }
        sachtieuthuyet sach6 = new sachtieuthuyet("TT001", "Sherlock Holmes (Tai ban)",
                "Arthur Conan Doyle", 2023, 7, "Trinh tham", false, 6000);
        ql.capNhatSach("TT001", sach6);
        ql.xoaSach("GT001");
        ql.hienThiDanhSach();

        ikiemke kiemKe = new sachgiaotrinh("GT002", "Lap trinh C#", "Nguyen Van B", 2020, 120,
                "Khoa hoc may tinh", "Cao dang", 5500);

        System.out.println("Tồn kho đủ 100? " + kiemKe.kiemTraTonKho(100));
        kiemKe.capNhatViTri("Kho A1 - Kệ 5");
    }
}

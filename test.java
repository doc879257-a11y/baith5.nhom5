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


        sach sach4 = new SachGiaoTrinh("GT001", "Lap trinh Java", "Nguyen Van A", 2021, 10,
                "Cong nghe thong tin", "Dai hoc");

        sach sach5 = new SachTieuThuyet("TT001", "Harry Potter", "J.K. Rowling", 2005, 20,
                "Phieu luu - Gia tuong", true);


        QuanLySach ql = new QuanLySach();


        ql.themSach(sach4);
        ql.themSach(sach5);


        ql.hienThiDanhSach();


        System.out.println("\n--- TIM SACH THEO MA 'TT001' ---");
        sach timSach = ql.timSachTheoMa("TT001");
        if (timSach != null) {
            System.out.println(timSach);
        } else {
            System.out.println("Khong tim thay sach!");
        }

        SachTieuThuyet sach6 = new SachTieuThuyet("TT001", "Sherlock Holmes (Tai ban)",
                "Arthur Conan Doyle", 2023, 7, "Trinh tham", false);
        ql.capNhatSach("TT001", sach6);


        ql.xoaSach("GT001");


        ql.hienThiDanhSach();
    }
}

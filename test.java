public class test {
    public static void main(String[] args) {

        sach sach1 = new sach("S001", "Lập trình Java", "Nguyễn Văn A", 2021, 5);
        sach sach2 = new sach("S002", "Cấu trúc dữ liệu", "Trần Thị B", 2019, 3);

        sach sach3 = new sach();
        sach3.setMaSach("S003");
        sach3.setTieuDe("Giai thuat");
        sach3.setTacGia("Lê Văn C");
        sach3.setNamXuatBan(2020);
        sach3.setSoLuong(7);

        sach1.hienThiThongTin();
        sach2.hienThiThongTin();
        sach3.hienThiThongTin();
    }
}

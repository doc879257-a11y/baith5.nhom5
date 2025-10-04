public class test {
    public static void main(String[] args)
    {
        sach sach1 = new sach("s001", "lap trinh java", "nguyen van a", 2020, 5);
        sach sach2 = new sach();
        sach2.setmasach("s002");
        sach2.settieude("cau truc du lieu");
        sach2.settacgia("tran van b");
        sach2.setnamxuatban(2019);
        sach2.setsoluong(7);
        System.out.println("=== thong tin sach 1 ===");
        sach1.hienthithongtin();
        System.out.println("=== thong tin sach 2 ===");
        sach2.hienthithongtin();
    }
}

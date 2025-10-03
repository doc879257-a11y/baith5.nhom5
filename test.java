public class test {
    public static void main(String[] args) {
        sach s1 = new sach("b001", "lap trinh java", "nguyen van a", 2022, 10);
        sach s2 = new sach("b002", "co so du lieu", "tran thi b", 5);
        sach s3 = new sach();
        s3.setmasach("b003");
        s3.settieude("thiet ke web");
        s3.settacgia("le van c");
        s3.setnamxuatban(2021); 
        s3.setsoluong(4);
        System.out.println("Thong Tin Sach");
        System.out.println("Thong tin sach 1:");
        s1.hienthithongtin();
        System.out.println("Thong tin sach 2:");
        s2.hienthithongtin();
        System.out.println("Thong tin sach 3:");
        s3.hienthithongtin();
    }
}

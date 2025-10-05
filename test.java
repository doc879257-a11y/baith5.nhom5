class TestSach {
    public static void main(String[] args) {
        Sach[] Mangsach = {
            new Sach("MS01", "Lap trinh Java", "Nguyen Van An", 2023, 5),
            new Sach("MS02", "Cau truc du lieu", "Tran Thi Binh", 2022, 8),
            new Sach("MS03", "Giai thuat", "Le Van Cuong", 2021, 3),
            new Sach("MS04", "He dieu hanh", "Pham Thi Dung", 2020, 6),
            new Sach("MS05", "Mang may tinh", "Le Huu Thanh", 2019, 4)
        };

        for (Sach sach : Mangsach) {
            sach.hienThiThongTin();
            System.out.println("------------------------");
        }
    }
}
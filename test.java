public class test {
    public static void main(String[] args) {

        // ===== DANH SÁCH SÁCH GIÁO TRÌNH =====
        sach[] dsGiaoTrinh = {
            new sachgiaotrinh("SGT01", "Lap trinh Java", "Nguyen Van An", 2024, 120, 100000, "Lap trinh huong doi tuong", "Dai hoc"),
            new sachgiaotrinh("SGT02", "Cau truc du lieu va giai thuat", "Tran Thi Binh", 2023, 95, 120000, "Cau truc du lieu", "Dai hoc"),
            new sachgiaotrinh("SGT03", "Lap trinh C co ban", "Le Van Cuong", 2022, 80, 95000, "Ngon ngu lap trinh C", "Pho thong"),
            new sachgiaotrinh("SGT04", "Co so du lieu", "Pham Thi Dung", 2021, 100, 110000, "He quan tri co so du lieu", "Dai hoc"),
            new sachgiaotrinh("SGT05", "Mang may tinh", "Le Huu Thanh", 2020, 70, 105000, "Mang va bao mat thong tin", "Cao dang")
        };

        System.out.println("===== DANH SÁCH SÁCH GIÁO TRÌNH =====");
        for (sach s : dsGiaoTrinh) {
            s.hienThiThongTin();
            System.out.println("Ton kho >= 100: " + ((ikiemke)s).kiemtratonkho(100));
            ((ikiemke)s).capnhatvitri("Ke A1");
            System.out.println(s.toString());
            System.out.println("----------------------------");
        }

        // ===== DANH SÁCH SÁCH TIỂU THUYẾT =====
        sachtieuthuyet[] dsTieuThuyet = {
            new sachtieuthuyet("STT01", "Harry Potter va Hon da Phu thuy", "J.K. Rowling", 1997, 300, 200000, "Phieu luu - Ky ao", true),
            new sachtieuthuyet("STT02", "Dac Nhan Tam", "Dale Carnegie", 1936, 150, 120000, "Tam ly - Ky nang song", false),
            new sachtieuthuyet("STT03", "Tram nam co don", "Gabriel García Márquez", 1967, 120, 150000, "Hien thuc huyen ao", false),
            new sachtieuthuyet("STT04", "Sherlock Holmes: Tap 1", "Arthur Conan Doyle", 1892, 200, 250000, "Trinh tham", true),
            new sachtieuthuyet("STT05", "Doraemon: Chu meo may den tu tuong lai", "Fujiko F. Fujio", 1970, 500, 180000, "Thieu nhi - Hai huoc", true)
        };

        System.out.println("\n===== DANH SÁCH SÁCH TIỂU THUYẾT =====");
        for (sachtieuthuyet tt : dsTieuThuyet) {
            System.out.println("Ton kho >= 100: " + ((ikiemke)tt).kiemtratonkho(100));
            ((ikiemke)tt).capnhatvitri("Ke B" + tt.getMasach().substring(3, 4));
            tt.hienThiThongTin();
            System.out.println(tt.toString());
            System.out.println("----------------------------");
        }

        System.out.println("\n=== HIỂN THỊ TOÀN BỘ SÁCH ===");
        for (sach s : dsGiaoTrinh) {
            System.out.println(s);
        }
        for (sachtieuthuyet tt : dsTieuThuyet) {
            System.out.println(tt);
        }
    }
}

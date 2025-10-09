public class MainSachGiaoTrinh {
    public static void main (String args[]) {
        SachGiaoTrinh sg1 = new SachGiaoTrinh (
            "SGT01","Lap trinh Java","Nguyen Van An",2024,120,"Lap trinh huong đoi tuong","Dai hoc"
        );
        SachGiaoTrinh sg2 = new SachGiaoTrinh(
            "SGT02","Cau truc du lieu va giai thuat","Tran Thi Binh",2023,95,"Cau truc du lieu","Dai hoc"
        );
        SachGiaoTrinh sg3 = new SachGiaoTrinh(
            "SGT03","Lap trinh C co ban","Le Van Cuong",2022,80,"Ngon ngu lap trinh C","Pho thong"
        );
        SachGiaoTrinh sg4 = new SachGiaoTrinh(
            "SGT04","Co so du lieu","Pham Thi Dung",2021,100,"He quan tri co so du lieu","Dai hoc"
        );
        SachGiaoTrinh sg5 = new SachGiaoTrinh(
            "SGT05","Mang may tinh","Le Huu Thanh",2020,70,"Mang va bao mat thong tin","Cao dang"
        );
        sg1.hienThiThongTin();
        sg2.hienThiThongTin();
        sg3.hienThiThongTin();
        sg4.hienThiThongTin();
        sg5.hienThiThongTin();
    }
}

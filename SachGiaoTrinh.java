public class SachGiaoTrinh extends Sach  {
    private String monhoc;
    private String capdo;

    public SachGiaoTrinh(String masach, String tieude, String tacgia, int namxuatban, int soluong, String monhoc, String capdo) {
        super(masach,tieude,tacgia,namxuatban,soluong);
        this.monhoc = monhoc;
        this.capdo = capdo;
    }
    @Override
    public void hienThiThongTin() {
        System.out.println("==================================");
        System.out.println(" THONG TIN SACH GIAO TRINH ");
        System.out.println("==================================");
    
        super.hienThiThongTin(); // gọi hàm của lớp cha
        System.out.println("mon hoc: " + monhoc);
        System.out.println("cap do: " + capdo);
        System.out.println("==================================\n");
    }
}
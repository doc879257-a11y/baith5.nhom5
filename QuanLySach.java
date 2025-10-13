import java.util.ArrayList;


public class QuanLySach {
    private ArrayList<sach> danhsachSach;

    public QuanLySach(){
      danhsachSach = new ArrayList<>();
    }
    public QuanLySach(ArrayList<sach> danhsachSach){
        this.danhsachSach=danhsachSach;
    }

    public void themSach(sach Sach) {
        danhsachSach.add(Sach);
        System.out.println(" Da them sach: " + Sach.getTieuDe());
    }

    public sach timSachTheoMa(String maSach) {
        for (sach s : danhsachSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }

    public void xoaSach(String maSach) {
        sach sachCanXoa = timSachTheoMa(maSach);
        if (sachCanXoa != null) {
            danhsachSach.remove(sachCanXoa);
            System.out.println("🗑 Da xoa sach co ma: " + maSach);
        } else {
            System.out.println("Khong tim thay sach co ma: " + maSach);
        }
    }

    public void capNhatSach(String maSach, sach sachMoi) {
        for (sach s : danhsachSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                s.setTieuDe(sachMoi.getTieuDe());
                s.setTacGia(sachMoi.getTacGia());
                s.setNamXuatBan(sachMoi.getNamXuatBan());
                s.setSoLuong(sachMoi.getSoLuong());
                System.out.println("Da cap nhat sach co ma: " + maSach);
                return;
            }
        }
        System.out.println(" Khong tim thay sach de cap nhat!");
    }

    public void hienThiDanhSach() {
        if (danhsachSach.isEmpty()) {
            System.out.println(" Danh sach sach hien dang trong!");
            return;
        }

        System.out.println("\n===== DANH SACH SACH TRONG THU VIEN =====");
        for (sach s : danhsachSach) {
            System.out.println(s.toString());
            System.out.println("----------------------------------------");
        }
    }

}

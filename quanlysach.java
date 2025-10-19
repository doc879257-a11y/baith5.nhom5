import java.util.ArrayList;

public class quanlysach {
    private ArrayList<sach> danhsachSach;

    public quanlysach() {
        danhsachSach = new ArrayList<>();
    }

    public quanlysach(ArrayList<sach> danhsachSach) {
        this.danhsachSach = danhsachSach;
    }
    public void themSach(sach Sach) {
        danhsachSach.add(Sach);
        System.out.println(" Đã thêm sách: " + Sach.getTieuDe());
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
            System.out.println(" Đã xóa sách có mã: " + maSach);
        } else {
            System.out.println(" Không tìm thấy sách có mã: " + maSach);
        }
    }
    public void capNhatSach(String maSach, sach sachMoi) {
        sach sachCanCapNhat = timSachTheoMa(maSach);
        if (sachCanCapNhat != null) {
            sachCanCapNhat.setTieuDe(sachMoi.getTieuDe());
            sachCanCapNhat.setTacGia(sachMoi.getTacGia());
            sachCanCapNhat.setNamXuatBan(sachMoi.getNamXuatBan());
            sachCanCapNhat.setSoLuong(sachMoi.getSoLuong());
            sachCanCapNhat.setGiaCoBan(sachMoi.getGiaCoBan());
            System.out.println("Đã cập nhật sách có mã: " + maSach);
        } else {
            System.out.println("Không tìm thấy sách để cập nhật!");
        }
    }

    public void hienThiDanhSach() {
        if (danhsachSach.isEmpty()) {
            System.out.println("Danh sách sách hiện đang trống!");
            return;
        }
        for (sach s : danhsachSach) {
            System.out.println(s.toString());
            System.out.println(" Giá bán ước tính: " + s.tinhGiaBan() + " VNĐ");
        }
    }
}


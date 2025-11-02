import java.util.ArrayList;
import java.util.List;

public class quanlysachimpl implements iquanlysach {
    private List<sach> danhSach = new ArrayList<>();

    @Override
    public void themSach(sach sach) {
        if (timKiemSach(sach.getMaSach()) != null) {
            System.out.println("Mã sách đã tồn tại!");
        } else {
            danhSach.add(sach);
            System.out.println("Thêm sách thành công!");
        }
    }

    @Override
    public boolean xoaSach(String maSach) {
        sach sach = timKiemSach(maSach);
        if (sach != null) {
            danhSach.remove(sach);
            System.out.println("Xóa thành công!");
            return true;
        }
        System.out.println("Không tìm thấy sách!");
        return false;
    }

    @Override
    public sach timKiemSach(String maSach) {
        for (sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public void capNhatSach(String maSach, sach sachMoi) {
        sach sach = timKiemSach(maSach);
        if (sach != null) {
            int index = danhSach.indexOf(sach);
            danhSach.set(index, sachMoi);
            System.out.println("Cập nhật thành công!");
        } else {
            System.out.println("Không tìm thấy sách để cập nhật!");
        }
    }

    @Override
    public void hienThiDanhSach() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }
        System.out.println("=== DANH SÁCH SÁCH ===");
        for (sach s : danhSach) {
            System.out.println(s);
            System.out.println("Giá bán: " + String.format("%.0f VNĐ", s.tinhGiaBan()));
            System.out.println("---");
        }
    }

    @Override
    public List<sach> getDanhSach() {
        return danhSach;
    }
}
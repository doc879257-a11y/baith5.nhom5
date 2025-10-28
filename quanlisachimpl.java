import java.util.ArrayList;
import java.util.List;

public class quanlisachimpl implements iquanlisach{
    private List<sach> danhSachSach;

    public quanlisachimpl() {
        danhSachSach = new ArrayList<>();
    }

    @Override
    public void themsach(sach s) {
        danhSachSach.add(s);
    }

    @Override
    public boolean xoasach(String masach) {
        return danhSachSach.removeIf(s -> s.getmasach().equalsIgnoreCase(masach));
    }

    @Override
    public sach timkiensach(String maSach) {
        return null;
    }

    @Override
    public sach timkiemsach(String maSach) {
        for (sach s : danhSachSach) {
            if (s.getmasach().equalsIgnoreCase(maSach))
                return s;
        }
        return null;
    }

    @Override
    public void hienthidanhsach() {
        if (danhSachSach.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }
        for (sach s : danhSachSach) {
            System.out.println(s);
            System.out.println("--------------------------------------");
        }
    }

    @Override
    public List<sach> getTatCaSach() {
        return List.of();
    }

    @Override
    public List<sach> gettatcasach() {
        return danhSachSach;
    }
}

import java.util.ArrayList;
public class quanlisach {
    private ArrayList<sach> danhsachsach;
    public quanlisach() {
        danhsachsach = new ArrayList<>();
    }
    public void themsach(sach s) {
        danhsachsach.add(s);
    }
    public boolean xoaxach(String masach) {
        for (sach s : danhsachsach) {
            if (s.getmasach().equalsIgnoreCase(masach)) {
                danhsachsach.remove(s);
                return true;
            }
        }
        return false;
    }
    public sach timKiem(String masach) {
        for (sach s : danhsachsach) {
            if (s.getmasach().equalsIgnoreCase(masach)) {
                return s;
            }
        }
        return null;
    }
    public void hienThiDanhSach() {
        for (sach s : danhsachsach) {
            System.out.println(s);
        }
    }
}


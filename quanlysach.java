import java.util.ArrayList;

public class quanlysach {
    private ArrayList<sach> dssach = new ArrayList<>();

    public void themsach(sach s) {
        dssach.add(s);
    }

    public boolean xoasach(String ma) {
        return dssach.removeIf(s -> s.getmasach().equalsIgnoreCase(ma));
    }

    public sach timsachtheoma(String ma) {
        for (sach s : dssach)
            if (s.getmasach().equalsIgnoreCase(ma))
                return s;
        return null;
    }

    public boolean capnhatsoluong(String ma, int soluongmoi) {
        sach s = timsachtheoma(ma);
        if (s != null) {
            s.setsoduong(soluongmoi);
            return true;
        }
        return false;
    }

    public void hienthidssach() {
        System.out.println("===== DANH SACH SACH =====");
        for (sach s : dssach)
            System.out.println(s.toString());
    }

    public double tonggiabantatca() {
        double tong = 0;
        for (sach s : dssach)
            tong += s.tinhgiaban() * s.getsoluong();
        return tong;
    }
}

package quanlibansach;
import java.util.ArrayList;
import java.util.List;

public class quanlisachimpl implements iquanlisach {
    private final List<sach> dssach = new ArrayList<>();

    @Override
    public void themsach(sach s) {
        dssach.add(s);
    }

    @Override
    public sach timsachtheoma(String ma) {
        for (sach s : dssach) {
            if (s.getmasach().equalsIgnoreCase(ma)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public boolean xoasach(String ma) {
        return dssach.removeIf(s -> s.getmasach().equalsIgnoreCase(ma));
    }

    @Override
    public void hienthidanhsach() {
        if (dssach.isEmpty()) {
            System.out.println("Danh sach trong!");
        } else {
            System.out.println("\n===== DANH SACH SACH =====");
            for (sach s : dssach) {
                s.hienthithongtin();
            }
        }
    }

    @Override
    public boolean capnhatsoluong(String ma, int slmoi) {
        sach s = timsachtheoma(ma);
        if (s != null) {
            s.setsoluong(slmoi);
            return true;
        }
        return false;
    }

    @Override
    public double tonggiabantatca() {
        double sum = 0;
        for (sach s : dssach) sum += s.tinhgiaban();
        return sum;
    }

    @Override
    public List<sach> getdanhsach() {
        return dssach;
    }
}

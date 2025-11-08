import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class quanlysach implements iquanlysach {
    private ArrayList<sach> danhsachsach = new ArrayList<>();
    public ArrayList<sach> getdanhsachsach() {
        return danhsachsach;
    }
    @Override
    public void themsach(sach s) {
        danhsachsach.add(s);
    }

    @Override
    public boolean xoasach(String masach) {
        return danhsachsach.removeIf(s -> s.getmasach().equalsIgnoreCase(masach));
    }

    @Override
    public sach timkiemsach(String masach) {
        for (sach s : danhsachsach)
            if (s.getmasach().equalsIgnoreCase(masach)) return s;
        return null;
    }

    @Override
    public void hienthidanhsach() {
        if (danhsachsach.isEmpty())
            System.out.println("Danh sách sách trống!");
        else
            danhsachsach.forEach(System.out::println);
    }

    @Override
    public double tonggiabantatca() {
        double tong = 0;
        for (sach s : danhsachsach) {
            tong += s.tinhgiaban();
        }
        return tong;
    }
}
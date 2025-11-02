import java.util.List;

public interface iquanlysach {
    void themSach(sach sach);
    boolean xoaSach(String maSach);
    sach timKiemSach(String maSach);
    void capNhatSach(String maSach, sach sachMoi);
    void hienThiDanhSach();
    List<sach> getDanhSach();
}
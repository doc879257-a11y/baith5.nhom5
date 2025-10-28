import java.util.List;

public interface iquanlisach {
    void themsach(sach s);
    boolean xoasach(String maSach);
    sach timkiensach(String maSach);

    sach timkiemsach(String maSach);

    void hienthidanhsach();
    List<sach> getTatCaSach();

    List<sach> gettatcasach();
}

package quanlibansach;

import java.util.List;
public interface iquanlisach {
    void themsach(sach s);
    sach timsachtheoma(String ma);
    boolean xoasach(String ma);
    void hienthidanhsach();
    boolean capnhatsoluong(String ma, int slmoi);
    double tonggiabantatca();
    List<sach> getdanhsach();
}

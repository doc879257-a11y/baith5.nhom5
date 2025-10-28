package sach;

public interface iquanlysach {
    void themSach();
    void themSach(sach sach); // Tham số là kiểu Sach (thêm 1 quyển sách)
    void Xoasach();
    void Xoasach(String masach);  // Trả về true/false (xóa thành công hay không)
    void capnhatSach();
    void capnhatSach(sach sach);
    void timkiem();
    void timkiem(String masach); // Trả về kiểu Sach (tìm và trả lại quyển sách)
    void hienThiDanhSach();  // In ra danh sách sách hiện có
}
    


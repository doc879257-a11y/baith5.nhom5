import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class quanlysach implements iquanlysach {
    private ArrayList<sach> dssach = new ArrayList<>();

    public void themsach(sach s) {
        if (s != null) dssach.add(s);
    }

    public boolean xoasach(String ma) {
        return dssach.removeIf(s -> s.getmasach().equalsIgnoreCase(ma));
    }

    public sach timsachtheoma(String ma) {
        for (sach s : dssach)
            if (s.getmasach().equalsIgnoreCase(ma)) return s;
        return null;
    }

    public void hiendssach() {
        if (dssach.isEmpty()) {
            System.out.println("Danh sach trong");
            return;
        }
        for (sach s : dssach) {
            s.hienthi();
            System.out.println("Gia Ban: " + s.tinhgiaban());
        }
    }

    public boolean capnhatsoluong(String ma, int slmoi) {
        sach s = timsachtheoma(ma);
        if (s == null) return false;
        s.setsoluong(slmoi);
        return true;
    }

    public double tonggiabantatca() {
        double t = 0;
        for (sach s : dssach) t += s.tinhgiaban();
        return t;
    }

    public List<sach> getds() {
        return dssach;
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        iquanlysach ql = new quanlysach();
        sach gt = new sachgiaotrinh("gt001","ctdl", "nguyen van a", 2022, 120, 90000, "a1-k1", "ctdl", "daihoc");
        sach tt = new sachtieuthuyet("tt001","doraemon", "fujiko", 2010, 50, 60000, "b2-k3", "thieunhi", true);
        ql.themsach(gt);
        ql.themsach(tt);
        int chon;
        do {
            System.out.println("1. Them Sach Giao Trinh");
            System.out.println("2. Them Sach Tieu Thuyet");
            System.out.println("3. Hien Thi Danh Sach");
            System.out.println("4. Tim Kiem Theo Ma");
            System.out.println("5. Xoa Theo Ma");
            System.out.println("6. Cap Nhat So Luong");
            System.out.println("7. Kiem Tra Ton Kho + Cap Nhat Vi Tri");
            System.out.println("8. Tong Gia Ban Tat Ca");
            System.out.println("0. Thoat");
            chon = Integer.parseInt(sc.nextLine().trim());
            switch (chon) {
                case 1: {
                    System.out.print("Ma: "); String ma = sc.nextLine();
                    System.out.print("Tieu de: "); String td = sc.nextLine();
                    System.out.print("Tac gia: "); String tg = sc.nextLine();
                    System.out.print("Nam XB: "); int nam = Integer.parseInt(sc.nextLine());
                    System.out.print("So luong: "); int sl = Integer.parseInt(sc.nextLine());
                    System.out.print("Gia co ban: "); double gcb = Double.parseDouble(sc.nextLine());
                    System.out.print("Vi tri: "); String vt = sc.nextLine();
                    System.out.print("Mon hoc: "); String mh = sc.nextLine();
                    System.out.print("Cap do: "); String cd = sc.nextLine();
                    sach s = new sachgiaotrinh(ma, td, tg, nam, sl, gcb, vt, mh, cd);
                    ql.themsach(s);
                    break;
                }
                case 2: {
                    System.out.print("Ma: "); String ma = sc.nextLine();
                    System.out.print("Tieu de: "); String td = sc.nextLine();
                    System.out.print("Tac gia: "); String tg = sc.nextLine();
                    System.out.print("Nam XB: "); int nam = Integer.parseInt(sc.nextLine());
                    System.out.print("So luong: "); int sl = Integer.parseInt(sc.nextLine());
                    System.out.print("Gia co ban: "); double gcb = Double.parseDouble(sc.nextLine());
                    System.out.print("Vi tri: "); String vt = sc.nextLine();
                    System.out.print("The loai: "); String tl = sc.nextLine();
                    System.out.print("La series (true/false): "); boolean ls = Boolean.parseBoolean(sc.nextLine());
                    sach s = new sachtieuthuyet(ma, td, tg, nam, sl, gcb, vt, tl, ls);
                    ql.themsach(s);
                    break;
                }
                case 3: {
                    ql.hiendssach();
                    break;
                }
                case 4: {
                    System.out.print("Nhap ma: "); String ma = sc.nextLine();
                    sach s = ql.timsachtheoma(ma);
                    if (s == null) System.out.println("Khong tim thay");
                    else s.hienthi();
                    break;
                }
                case 5: {
                    System.out.print("Nhap ma: "); String ma = sc.nextLine();
                    boolean ok = ql.xoasach(ma);
                    System.out.println(ok ? "Da xoa" : "Khong tim thay");
                    break;
                }
                case 6: {
                    System.out.print("Nhap ma: "); String ma = sc.nextLine();
                    System.out.print("So luong moi: "); int sl = Integer.parseInt(sc.nextLine());
                    boolean ok = ql.capnhatsoluong(ma, sl);
                    System.out.println(ok ? "Da cap nhat" : "Khong tim thay");
                    break;
                }
                case 7: {
                    System.out.print("Nhap ma: "); String ma = sc.nextLine();
                    System.out.print("So luong toi thieu: "); int m = Integer.parseInt(sc.nextLine());
                    sach s = ql.timsachtheoma(ma);
                    if (s != null) {
                        boolean du = s.kiemtratonkho(m);
                        System.out.println(du ? "Du hang ton kho" : "Thieu hang ton kho");
                        System.out.print("Nhap vi tri moi: ");
                        String vt = sc.nextLine();
                        s.capnhatvitri(vt);
                    } else System.out.println("Khong tim thay sach");
                    break;
                }
                case 8: {
                    System.out.println("Tong gia ban tat ca: " + ql.tonggiabantatca() + " VND");
                    break;
                }
            }
        } while (chon != 0);
        sc.close();
    }
}

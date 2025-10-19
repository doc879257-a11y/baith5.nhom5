public abstract class sach
{
    private String masach;
    private String tieude;
    private String tacgia;
    private int namxuatban;
    protected int soluong;
    protected double giacoban;
    public sach(String masach, String tieude, String tacgia, int namxuatban, int soluong,double giacoban)
    {
        this.masach = masach;
        this.tieude = tieude;
        this.tacgia = tacgia;
        this.namxuatban = namxuatban;
        this.soluong = soluong;
        this.giacoban = giacoban;
    }
    public sach() {}
    public String getmasach()
    {
        return masach;
    }
    public void setmasach(String masach)
    {
        this.masach = masach;
    }
    public String gettieude()
    {
        return tieude;
    }
    public void settieude(String tieude)
    {
        this.tieude = tieude;
    }
    public String gettacgia()
    {
        return tacgia;
    }
    public void settacgia(String tacgia)
    {
        this.tacgia = tacgia;
    }
    public int getnamxuatban()
    {
        return namxuatban;
    }
    public void setnamxuatban(int namxuatban)
    {
        if (namxuatban > 0)
        {
            this.namxuatban = namxuatban;
        } else
        {
            System.out.println("nam xuat ban khong hop le!");
        }
    }
    public int getsoluong()
    {
        return soluong;
    }
    public void setsoluong(int soluong)
    {
        if (soluong >= 0) {
            this.soluong = soluong;
        } else {
            System.out.println("so luong khong hop le!");
        }
    }

    public void setgiacoban(double giacoban) {
        this.giacoban = giacoban;
    }
    public double getgiacoban() {return giacoban;};

    public void hienthithongtin()
    {
        System.out.println("ma sach: " + masach);
        System.out.println("tieu de: " + tieude);
        System.out.println("tac gia: " + tacgia);
        System.out.println("nam xuat ban: " + namxuatban);
        System.out.println("so luong: " + soluong);
        System.out.println("gia co ban"+giacoban);
        System.out.println("--------------------------");
    }
    public abstract double tinhgiaban();
    @Override
    public String toString() {
        return "Mã: " + masach + ", Tiêu đề: " + tieude +
                ", Tác giả: " + tacgia + ", Năm XB: " + namxuatban +
                ", Số lượng: " + soluong + ", Giá cơ bản: " + giacoban;
    }

}

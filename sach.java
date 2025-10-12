public class sach
{
    private String masach;
    private String tieude;
    private String tacgia;
    private int namxuatban;
    protected int soluong;
    public sach(String masach, String tieude, String tacgia, int namxuatban, int soluong)
    {
        this.masach = masach;
        this.tieude = tieude;
        this.tacgia = tacgia;
        this.namxuatban = namxuatban;
        this.soluong = soluong;
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
    public void hienthithongtin()
    {
        System.out.println("ma sach: " + masach);
        System.out.println("tieu de: " + tieude);
        System.out.println("tac gia: " + tacgia);
        System.out.println("nam xuat ban: " + namxuatban);
        System.out.println("so luong: " + soluong);
        System.out.println("--------------------------");
    }
}

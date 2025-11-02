package quanlibansach;
import java.text.DecimalFormat;
public abstract class sach implements igiaban, ikiemke {
    protected  String masach;
    protected String tieude;
    protected String tacgia;
    protected int namxuatban;
    protected int soluong;
    protected double giacoban;
    public sach() {}
    public sach(String masach, String tieude, String tacgia, int namxuatban, int soluong, double giacoban) {
        this.masach = masach;
        this.tieude = tieude;
        this.tacgia = tacgia;
        if (namxuatban <= 0) {
            this.namxuatban = 0;
        } else {
            this.namxuatban = namxuatban;
        }
        if (soluong < 0) {
            this.soluong = 0;
        } else {
            this.soluong = soluong;
        }
        this.giacoban = giacoban;
    }

    public sach(String masach, String tieude, String tacgia, int soluong, double giacoban) {
        this.masach = masach;
        this.tieude = tieude;
        this.tacgia = tacgia;
        this.namxuatban = 0;  
        if (soluong < 0) {
            this.soluong = 0;
        } else {
            this.soluong = soluong;
        }
        this.giacoban = giacoban;
    }

    public String getmasach() 
    { 
        return masach;
    }
    public String gettieude()
    { 
        return tieude; 
    }
    public String gettacgia()
    { 
        return tacgia; 
    }
    public int getnamxuatban()
    { 
        return namxuatban; 
    }
    public int getsoluong()
    { 
        return soluong; 
    }
    public double getgiacoban() 
    { 
        return giacoban; 
    }

    public void setmasach(String masach)
    {
        this.masach = masach;
    }
    public void settieude(String tieude)
    {
        this.tieude = tieude;
    }
    public void settacgia(String tacgia)
    {
        this.tacgia = tacgia;
    }
    public void setnamxuatban(int namxuatban)
    {
        if (namxuatban <= 0) {
            this.namxuatban = 0;
        } else {
            this.namxuatban = namxuatban;
        }
    }
    public void setsoluong(int soluong) 
    { 
        if (soluong < 0) {
            this.soluong = 0;
        } else {
            this.soluong = soluong;
        }
    }
    public void setgiacoban(double giacoban)
    {
        this.giacoban = giacoban;
    }
    //Phuong thuc truu tuong

    public abstract double tinhgiaban();

    public String dinhdangVN(double so) {
        DecimalFormat df = new DecimalFormat("#,### VND");
        return df.format(so);
    }
     

    @Override
    public boolean kiemtratonkho(int sltoithieu) {
        return soluong >= sltoithieu;
    }

    @Override
    public void capnhatvitri(String vitrimo) {
        System.out.println("Da chuyen sach " + tieude + " den khu vuc: " + vitrimoi);
    }

    public void hienthithongtin() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Ma: " + masach + ", Tieu de: " + tieude + ", Tac gia: " + tacgia +
               ", Nam XB: " + namxuatban + ", SL: " + soluong + ", Gia co ban: " + dinhdangVN(giacoban);
    }
}

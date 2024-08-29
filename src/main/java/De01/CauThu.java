/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De01;

/**
 *
 * @author ADMIN
 */
public class CauThu {
    public int soao;
    public String hoTen;
    public int namSinh;
    public int  luongCung;
    public int tienThuong;
    public int  tienPhat;
    public CauThu(int soao, String hoTen, int namSinh, int luongCung, int tienThuong, int tienPhat){
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.luongCung = luongCung;
        this.tienThuong = tienThuong;
        this.tienPhat = tienPhat;
    }

    public int getSoao() {
        return soao;
    }

    public void setSoao(int soao) {
        this.soao = soao;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public double getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(int luongCung) {
        this.luongCung = luongCung;
    }

    public double getTienThuong() {
        return tienThuong;
    }

    public void setTienThuong(int tienThuong) {
        this.tienThuong = tienThuong;
    }

    public double getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(int tienPhat) {
        this.tienPhat = tienPhat;
    }
    public double tinhLuongThucLanh(){
        return (luongCung + tienThuong - tienPhat);
    }       
   public void xuat(){
       System.out.println("Cau [hoTen: " + hoTen + ", namSinh:" + namSinh + ", luongCung:" + luongCung+ ", tienthuong: " +tienThuong+ ", Tienphat:"+ tienPhat+", tinhluongthuclanh:"+ tinhLuongThucLanh());
   }
}

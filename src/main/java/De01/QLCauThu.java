/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De01;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class QLCauThu {
    ArrayList<CauThu> DScauThu = new ArrayList<>();
    
    
    public QLCauThu() {
        this.DScauThu = new ArrayList<>();
        //Danh sách cau thu
        DScauThu.add(new CauThu(1, "Nguyen Van A", 1998, 7000, 2000, 500));
        DScauThu.add(new CauThu(2, "Nguyen Van B", 1990, 9000, 2000, 200));
        DScauThu.add(new CauThu(3, "Nguyen Van C", 1985, 7000, 2000, 0));
        DScauThu.add(new CauThu(4, "Nguyen Van D", 1986, 10000, 3000, 200));
        DScauThu.add(new CauThu(5, "Nguyen Van E", 1987, 7000, 2000, 500));
        DScauThu.add(new CauThu(6, "Nguyen Van F", 1995, 7000, 2000, 500));
        DScauThu.add(new CauThu(7, "Nguyen Van G", 1992, 7000, 2000, 500));
        DScauThu.add(new CauThu(8, "Nguyen Van H", 1991, 7000, 2000, 500));
        DScauThu.add(new CauThu(9, "Nguyen Van I", 1982, 7000, 2000, 500));
        DScauThu.add(new CauThu(10, "Nguyen Van J", 1983, 7000, 2000, 500));
        DScauThu.add(new CauThu(11, "Nguyen Van K", 1984, 7000, 2000, 500));
        
    }
    public boolean themCauThu(CauThu cauThu) {
        for (CauThu ct : DScauThu) {
            if (ct.getSoao() == cauThu.getSoao()) {
                return false; // Số áo đã tồn tại
            }
        }
        DScauThu.add(cauThu);
        return true;
    }
     public void xuatThongTinDanhSachCauThu() {
        int tongLuong = 0;
        for (CauThu cauThu : DScauThu) {
            System.out.println("Số áo: " + cauThu.getSoao() +
                               ", Họ tên: " + cauThu.getHoTen()+
                               ", Tuổi: " + (2024 - cauThu.getNamSinh()) +
                               ", Lương thực lãnh: " + cauThu.tinhLuongThucLanh());
            tongLuong += cauThu.tinhLuongThucLanh();
        }
        System.out.println("Tổng tiền lương CLB phải trả cho cầu thủ: " + tongLuong);
    }
       public ArrayList<CauThu> timCauThuLuongCaoNhat() {
        ArrayList<CauThu> result = new ArrayList<>();
        if (DScauThu.isEmpty()) {
            return result;
        }

        double maxLuongThucLanh = DScauThu.get(0).tinhLuongThucLanh();
        for (CauThu cauThu : DScauThu) {
            double luongThucLanh = cauThu.tinhLuongThucLanh();
            if (luongThucLanh > maxLuongThucLanh) {
                maxLuongThucLanh = luongThucLanh;
            }
        }

        for (CauThu cauThu : DScauThu) {
            if (cauThu.tinhLuongThucLanh() == maxLuongThucLanh) {
                result.add(cauThu);
            }
        }
        return result;
    }
       public double tinhLuongCungTrungBinh() {
        if (DScauThu.isEmpty()) {
            return 0.0;
        }

        double tongLuongCung = 0.0;
        for (CauThu cauThu : DScauThu) {
            tongLuongCung += cauThu.getLuongCung();
        }
        return tongLuongCung / DScauThu.size();
    }
    
}

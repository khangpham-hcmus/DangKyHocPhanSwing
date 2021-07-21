package pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Sinhvien {
    private String masv;
    private String hoten;
    private String gioitinh;

    private Set<Sinhvienhocphan> danhsachHocPhanDK=new HashSet<>(0);

    public Set<Sinhvienhocphan> getDanhsachHocPhanDK() {
        return danhsachHocPhanDK;
    }

    public void setDanhsachHocPhanDK(Set<Sinhvienhocphan> danhsachHocPhanDK) {
        this.danhsachHocPhanDK = danhsachHocPhanDK;
    }

    private Lophoc lophoc;

    public Lophoc getLophoc() {
        return lophoc;
    }

    public void setLophoc(Lophoc lophoc) {
        this.lophoc = lophoc;
    }

    private Taikhoan taikhoan;

    public Taikhoan getTaikhoan() {
        return taikhoan;
    }

    public void setTaikhoan(Taikhoan taikhoan) {
        this.taikhoan = taikhoan;
    }

    @Id
    @Column(name = "masv", nullable = false, length = 10)
    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    @Basic
    @Column(name = "hoten", nullable = true, length = 50)
    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    @Basic
    @Column(name = "gioitinh", nullable = true, length = 3)
    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sinhvien sinhvien = (Sinhvien) o;
        return Objects.equals(masv, sinhvien.masv) && Objects.equals(hoten, sinhvien.hoten) && Objects.equals(gioitinh, sinhvien.gioitinh);
    }

    @Override
    public int hashCode() {
        return Objects.hash(masv, hoten, gioitinh);
    }
}

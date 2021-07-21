package pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Taikhoan {
    private String cmnd;
    private String matkhau;
    private Integer loaitaikhoan;

    private Sinhvien sinhvien;

    public Sinhvien getSinhvien() {
        return sinhvien;
    }

    public void setSinhvien(Sinhvien sinhvien) {
        this.sinhvien = sinhvien;
    }

    private Giaovu giaovu;

    public Giaovu getGiaovu() {
        return giaovu;
    }

    public void setGiaovu(Giaovu giaovu) {
        this.giaovu = giaovu;
    }

    @Id
    @Column(name = "cmnd", nullable = false, length = 10)
    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    @Basic
    @Column(name = "matkhau", nullable = true, length = 50)
    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    @Basic
    @Column(name = "loaitaikhoan", nullable = true)
    public Integer getLoaitaikhoan() {
        return loaitaikhoan;
    }

    public void setLoaitaikhoan(Integer loaitaikhoan) {
        this.loaitaikhoan = loaitaikhoan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Taikhoan taikhoan = (Taikhoan) o;
        return Objects.equals(cmnd, taikhoan.cmnd) && Objects.equals(matkhau, taikhoan.matkhau) && Objects.equals(loaitaikhoan, taikhoan.loaitaikhoan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cmnd, matkhau, loaitaikhoan);
    }
}

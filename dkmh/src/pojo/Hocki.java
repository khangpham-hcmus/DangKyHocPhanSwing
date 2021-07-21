package pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Hocki {
    private String mahk;
    private String tenhk;
    private String namhoc;
    private String ngaybd;
    private String ngaykt;
    private Set<Hocphan> danhsachHocPhan=new HashSet<>(0);

    public Set<Hocphan> getDanhsachHocPhan() {
        return danhsachHocPhan;
    }

    public void setDanhsachHocPhan(Set<Hocphan> danhsachHocPhan) {
        this.danhsachHocPhan = danhsachHocPhan;
    }

    @Id
    @Column(name = "mahk", nullable = false, length = 6)
    public String getMahk() {
        return mahk;
    }

    public void setMahk(String mahk) {
        this.mahk = mahk;
    }

    @Basic
    @Column(name = "tenhk", nullable = true, length = 3)
    public String getTenhk() {
        return tenhk;
    }

    public void setTenhk(String tenhk) {
        this.tenhk = tenhk;
    }

    @Basic
    @Column(name = "namhoc", nullable = true, length = 4)
    public String getNamhoc() {
        return namhoc;
    }

    public void setNamhoc(String namhoc) {
        this.namhoc = namhoc;
    }

    @Basic
    @Column(name = "ngaybd", nullable = true, length = 10)
    public String getNgaybd() {
        return ngaybd;
    }

    public void setNgaybd(String ngaybd) {
        this.ngaybd = ngaybd;
    }

    @Basic
    @Column(name = "ngaykt", nullable = true, length = 10)
    public String getNgaykt() {
        return ngaykt;
    }

    public void setNgaykt(String ngaykt) {
        this.ngaykt = ngaykt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hocki hocki = (Hocki) o;
        return Objects.equals(mahk, hocki.mahk) && Objects.equals(tenhk, hocki.tenhk) && Objects.equals(namhoc, hocki.namhoc) && Objects.equals(ngaybd, hocki.ngaybd) && Objects.equals(ngaykt, hocki.ngaykt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mahk, tenhk, namhoc, ngaybd, ngaykt);
    }
}

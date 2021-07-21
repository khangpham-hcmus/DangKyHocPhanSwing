package pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;
import java.util.Set;

@Entity
public class Monhoc {
    private String mamh;
    private String tenmh;
    private Integer sotinchi;

    private Set<Hocphan> danhsachHocPhan;

    public Set<Hocphan> getDanhsachHocPhan() {
        return danhsachHocPhan;
    }

    public void setDanhsachHocPhan(Set<Hocphan> danhsachHocPhan) {
        this.danhsachHocPhan = danhsachHocPhan;
    }

    @Id
    @Column(name = "mamh", nullable = false, length = 8)
    public String getMamh() {
        return mamh;
    }

    public void setMamh(String mamh) {
        this.mamh = mamh;
    }

    @Basic
    @Column(name = "tenmh", nullable = true, length = 50)
    public String getTenmh() {
        return tenmh;
    }

    public void setTenmh(String tenmh) {
        this.tenmh = tenmh;
    }

    @Basic
    @Column(name = "sotinchi", nullable = true)
    public Integer getSotinchi() {
        return sotinchi;
    }

    public void setSotinchi(Integer sotinchi) {
        this.sotinchi = sotinchi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monhoc monhoc = (Monhoc) o;
        return Objects.equals(mamh, monhoc.mamh) && Objects.equals(tenmh, monhoc.tenmh) && Objects.equals(sotinchi, monhoc.sotinchi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mamh, tenmh, sotinchi);
    }
}

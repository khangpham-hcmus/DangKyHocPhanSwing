package pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;
import java.util.Set;

@Entity
public class Lophoc {
    private String malop;


    private Set<Hocphan> danhsachHocPhan;

    public Set<Hocphan> getDanhsachHocPhan() {
        return danhsachHocPhan;
    }

    public void setDanhsachHocPhan(Set<Hocphan> danhsachHocPhan) {
        this.danhsachHocPhan = danhsachHocPhan;
    }

    private Set<Sinhvien> danhsachSinhVien;

    public Set<Sinhvien> getDanhsachSinhVien() {
        return danhsachSinhVien;
    }

    public void setDanhsachSinhVien(Set<Sinhvien> danhsachSinhVien) {
        this.danhsachSinhVien = danhsachSinhVien;
    }

    @Id
    @Column(name = "malop", nullable = false, length = 6)
    public String getMalop() {
        return malop;
    }

    public void setMalop(String malop) {
        this.malop = malop;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lophoc lophoc = (Lophoc) o;
        return Objects.equals(malop, lophoc.malop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(malop);
    }
}

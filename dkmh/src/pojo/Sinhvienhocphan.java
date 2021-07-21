package pojo;

import javax.persistence.Entity;
import javax.persistence.IdClass;
import java.util.Objects;

@Entity
@IdClass(SinhvienhocphanPK.class)
public class Sinhvienhocphan {
    private SinhvienhocphanPK idSinhVienDKHP;

    private Sinhvien sinhvien;

    public Sinhvien getSinhvien() {
        return sinhvien;
    }

    public void setSinhvien(Sinhvien sinhvien) {
        this.sinhvien = sinhvien;
    }

    private Hocphan hocphan;

    public Hocphan getHocphan() {
        return hocphan;
    }

    public void setHocphan(Hocphan hocphan) {
        this.hocphan = hocphan;
    }

    public Sinhvienhocphan() {
    }

    public Sinhvienhocphan(SinhvienhocphanPK idSinhVienDKHP) {
        this.idSinhVienDKHP = idSinhVienDKHP;
    }

    public SinhvienhocphanPK getIdSinhVienDKHP() {
        return idSinhVienDKHP;
    }

    public void setIdSinhVienDKHP(SinhvienhocphanPK idSinhVienDKHP) {
        this.idSinhVienDKHP = idSinhVienDKHP;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sinhvienhocphan)) return false;
        Sinhvienhocphan that = (Sinhvienhocphan) o;
        return Objects.equals(getIdSinhVienDKHP(), that.getIdSinhVienDKHP());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdSinhVienDKHP());
    }
}

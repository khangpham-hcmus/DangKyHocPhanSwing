package pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class SinhvienhocphanPK implements Serializable {
    private String masv;
    private String mamh;
    private String malop;
    private String mahk;

    @Column(name = "masv", nullable = false, length = 10)
    @Id
    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    @Column(name = "mamh", nullable = false, length = 8)
    @Id
    public String getMamh() {
        return mamh;
    }

    public void setMamh(String mamh) {
        this.mamh = mamh;
    }

    @Column(name = "malop", nullable = false, length = 6)
    @Id
    public String getMalop() {
        return malop;
    }

    public void setMalop(String malop) {
        this.malop = malop;
    }

    @Column(name = "mahk", nullable = false, length = 6)
    @Id
    public String getMahk() {
        return mahk;
    }

    public void setMahk(String mahk) {
        this.mahk = mahk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SinhvienhocphanPK that = (SinhvienhocphanPK) o;
        return Objects.equals(masv, that.masv) && Objects.equals(mamh, that.mamh) && Objects.equals(malop, that.malop) && Objects.equals(mahk, that.mahk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(masv, mamh, malop, mahk);
    }
}

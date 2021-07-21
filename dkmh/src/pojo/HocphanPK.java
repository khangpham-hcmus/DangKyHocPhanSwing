package pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class HocphanPK implements Serializable {
    private String mamh;
    private String malop;
    private String mahk;

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
        HocphanPK hocphanPK = (HocphanPK) o;
        return Objects.equals(mamh, hocphanPK.mamh) && Objects.equals(malop, hocphanPK.malop) && Objects.equals(mahk, hocphanPK.mahk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mamh, malop, mahk);
    }
}

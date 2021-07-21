package pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Giaovu {
    private String magiaovu;
    private String hoten;
    private Taikhoan taikhoan;

    public Taikhoan getTaikhoan() {
        return taikhoan;
    }

    public void setTaikhoan(Taikhoan taikhoan) {
        this.taikhoan = taikhoan;
    }

    @Id
    @Column(name = "magiaovu", nullable = false, length = 10)
    public String getMagiaovu() {
        return magiaovu;
    }

    public void setMagiaovu(String magiaovu) {
        this.magiaovu = magiaovu;
    }

    @Basic
    @Column(name = "hoten", nullable = true, length = 50)
    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Giaovu giaovu = (Giaovu) o;
        return Objects.equals(magiaovu, giaovu.magiaovu) && Objects.equals(hoten, giaovu.hoten);
    }

    @Override
    public int hashCode() {
        return Objects.hash(magiaovu, hoten);
    }
}

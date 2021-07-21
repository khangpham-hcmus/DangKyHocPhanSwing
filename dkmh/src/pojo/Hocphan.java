package pojo;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@IdClass(HocphanPK.class)
public class Hocphan {
    private Hocphan idHocPhan;
    private String gvlt;
    private Integer cahoc;
    private String phonghoc;
    private Integer ngayhoc;

    private Set<Sinhvienhocphan> danhsachSinhVienDKHP =new HashSet<>(0);

    public Set<Sinhvienhocphan> getDanhsachSinhVienDKHP() {
        return danhsachSinhVienDKHP;
    }

    public void setDanhsachSinhVienDKHP(Set<Sinhvienhocphan> danhsachSinhVienDKHP) {
        this.danhsachSinhVienDKHP = danhsachSinhVienDKHP;
    }

    private Monhoc monhoc;

    public Monhoc getMonhoc() {
        return monhoc;
    }

    public void setMonhoc(Monhoc monhoc) {
        this.monhoc = monhoc;
    }

    private Hocki hocki;

    public Hocki getHocki() {
        return hocki;
    }

    public void setHocki(Hocki hocki) {
        this.hocki = hocki;
    }

    private Lophoc lophoc;

    public Lophoc getLophoc() {
        return lophoc;
    }

    public void setLophoc(Lophoc lophoc) {
        this.lophoc = lophoc;
    }

    public Hocphan() {
    }

    public Hocphan(Hocphan idHocPhan, String gvlt, Integer cahoc, String phonghoc, Integer ngayhoc) {
        this.idHocPhan = idHocPhan;
        this.gvlt = gvlt;
        this.cahoc = cahoc;
        this.phonghoc = phonghoc;
        this.ngayhoc = ngayhoc;
    }

    public Hocphan getIdHocPhan() {

        return idHocPhan;
    }

    public void setIdHocPhan(Hocphan idHocPhan) {
        this.idHocPhan = idHocPhan;
    }

    @Basic
    @Column(name = "gvlt", nullable = true, length = 50)
    public String getGvlt() {
        return gvlt;
    }

    public void setGvlt(String gvlt) {
        this.gvlt = gvlt;
    }

    @Basic
    @Column(name = "cahoc", nullable = true)
    public Integer getCahoc() {
        return cahoc;
    }

    public void setCahoc(Integer cahoc) {
        this.cahoc = cahoc;
    }

    @Basic
    @Column(name = "phonghoc", nullable = true, length = 4)
    public String getPhonghoc() {
        return phonghoc;
    }

    public void setPhonghoc(String phonghoc) {
        this.phonghoc = phonghoc;
    }

    @Basic
    @Column(name = "ngayhoc", nullable = true)
    public Integer getNgayhoc() {
        return ngayhoc;
    }

    public void setNgayhoc(Integer ngayhoc) {
        this.ngayhoc = ngayhoc;
    }

}

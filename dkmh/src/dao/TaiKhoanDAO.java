package dao;

import org.hibernate.Session;
import pojo.Taikhoan;
import utils.HibernateUtil;

import java.util.List;

public class TaiKhoanDAO {
    public static List<Taikhoan> getDanhSachTaiKhoan()
    {
        List<Taikhoan> dstk=null;
        try
        {
            Session ss= HibernateUtil.getSessionFactory().openSession();
            String hql="from Taikhoan";
            dstk=ss.createQuery(hql).list();
        }
        catch (Exception e)
        {
            System.out.println("Exception in TaiKhoanDAO:"+e.getMessage());
        }
        return dstk;
    }
}

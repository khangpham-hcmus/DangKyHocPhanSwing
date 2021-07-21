package MainPackage;

import dao.TaiKhoanDAO;
import pojo.Taikhoan;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try{
            List<Taikhoan> dstk= TaiKhoanDAO.getDanhSachTaiKhoan();
            System.out.println("So luong tai khoan la: "+dstk.size());
        }
        catch (Exception e)
        {
            System.out.println("Exception in main: "+e.getMessage());
        }
    }
}

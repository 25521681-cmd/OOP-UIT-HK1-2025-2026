import java.util.Scanner;

public class DanhSachNhanVien{
    private NhanVien[] ds; private Integer SoLuong;
    public void Nhap(Scanner inp)
    {
        System.out.print("Hay nhap so luong nhan vien trong cong ty: ");
        SoLuong = Integer.parseInt(inp.next());
        ds = new NhanVien[SoLuong];
        for(int i = 0; i<SoLuong; i+=1)
        {
            System.out.print("Hay nhap 1/2 tuong ung voi coder/tester: ");
            Integer phanLoai = Integer.parseInt(inp.next());
            if(phanLoai == 1)
            {
                NhanVien nv = new LapTrinhVien();
                nv.Nhap(inp);
                ds[i] = nv;
            }
            else
            {
                NhanVien nv = new KiemChungVien();
                nv.Nhap(inp);
                ds[i] = nv;
            }
        }
    }
    public Integer TongLuongNhanVien()
    {
        Integer tong_luong_nhan_vien = 0;
        for(int i = 0; i<ds.length; i+=1)
        {
            tong_luong_nhan_vien += ds[i].GetLuong();
        }
        return tong_luong_nhan_vien;
    }
}

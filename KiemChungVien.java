import java.util.Scanner;

public class KiemChungVien extends NhanVien{
    private Integer SoLoi;
    public void Nhap(Scanner inp)
    {
        System.out.println("Hay nhap thong tin cho kiem chung vien: ");
        System.out.print("Hay nhap ma nhan vien: ");
        MaNV = inp.nextLine();
        System.out.print("Hay nhap ho ten nhan vien: ");
        HoTen = inp.nextLine();
        System.out.print("Hay nhap nam sinh nhan vien: ");
        NamSinh = Integer.parseInt(inp.next());
        System.out.print("Hay nhap luong co ban nhan vien: ");
        LuongCoBan = Integer.parseInt(inp.next());
        System.out.print("Hay nhap so loi ma nhan vien phat hien duoc: ");
        SoLoi = Integer.parseInt(inp.next());
        System.out.println();
    }
    public Integer GetLoai()
    {
        return 2;
    }
    public Integer GetLuong()
    {
        return (LuongCoBan + SoLoi*50000);
    }
}

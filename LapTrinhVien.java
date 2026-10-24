import java.util.Scanner;

public class LapTrinhVien extends NhanVien{
    private Integer SoGio_OverTime;
    public void Nhap(Scanner inp)
    {
        System.out.println("Hay nhap thong tin cho lap trinh vien: ");
        System.out.print("Hay nhap ma nhan vien: ");
        MaNV = inp.nextLine();
        System.out.print("Hay nhap ho ten nhan vien: ");
        HoTen = inp.nextLine();
        System.out.print("Hay nhap nam sinh nhan vien: ");
        NamSinh = Integer.parseInt(inp.next());
        System.out.print("Hay nhap luong co ban nhan vien: ");
        LuongCoBan = Integer.parseInt(inp.next());
        System.out.print("Hay nhap so gio over time: ");
        SoGio_OverTime = Integer.parseInt(inp.next());
        System.out.println();
    }
    public Integer GetLoai()
    {
        return 1;
    }
    public Integer GetLuong()
    {
        return (LuongCoBan + SoGio_OverTime*200000);
    }
}

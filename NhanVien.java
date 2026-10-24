import java.util.Scanner;
public abstract class NhanVien {
    protected String MaNV; protected String HoTen; 
    protected Integer NamSinh; protected Integer LuongCoBan;
    public abstract void Nhap(Scanner inp);
    public abstract Integer GetLuong();
    public abstract Integer GetLoai();
}

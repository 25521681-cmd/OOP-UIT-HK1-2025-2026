import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        DanhSachNhanVien ds = new DanhSachNhanVien();
        ds.Nhap(inp);
        System.out.println("Tong luong nhan vien la: " + ds.TongLuongNhanVien());
        inp.close();
    }
}

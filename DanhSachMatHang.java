import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class DanhSachMatHang {
    static class MatHang{
        static   int id=1;
        private  String Ma_MatHang,Ten_MatHang,DonViTinh;
        private int GiaBan,GiaMua,LoiNhuan;
        public void in(Scanner sc){
            if(id<10){
                Ma_MatHang = "MH00";
            }
            else if(id<100){
                Ma_MatHang = "MH0";
            }
            else {
                Ma_MatHang = "MH";
            }
            Ma_MatHang += Integer.toString(id++);
            Ten_MatHang=sc.nextLine();
            DonViTinh = sc.nextLine();
            GiaMua=Integer.parseInt(sc.nextLine());
            GiaBan=Integer.parseInt(sc.nextLine());
        }

        public int getLoiNhuan() {
            return GiaBan-GiaMua;
        }
        public String getMa_MatHang() {
            return Ma_MatHang;
        }
        @Override
        public String toString(){
            return Ma_MatHang+ " " + Ten_MatHang + " " +  DonViTinh + " " + GiaMua + " " + GiaBan+ " " + getLoiNhuan();
        }
    }

    public static void main(String[] args) {
        List<MatHang> list = new ArrayList<>();
        Scanner sc  = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while(n -- > 0){
            MatHang mh = new MatHang();
            mh.in(sc);
            list.add(mh);
        }
        list.sort(Comparator.comparing(MatHang::getLoiNhuan).reversed().thenComparing(MatHang::getMa_MatHang));
        for(MatHang i:list){
            System.out.println(i);
        }
    }
}
import java.util.Scanner;

public class KhaiBaoLopNhanVien {
    static class NhanVien{
        private String ID_NV="00001";
        private String Name;
        private String Gender;
        private String Birthday;
        private String Address;
        private String Tax;
        private String Day;
        public void in(){
            Scanner sc= new Scanner(System.in);
            Name = sc.nextLine();
            Gender = sc.nextLine();
            Birthday = sc.nextLine();
            Address =sc.nextLine();
            Tax = sc.nextLine();
            Day = sc.nextLine();
        }
        @Override
        public String toString(){
            return ID_NV + " "+ Name + " "+ Gender+ " "+ Birthday + " "+ Address + " "+ Tax + " "+ Day;
        }
    }

    public static void main(String[] args) {
        NhanVien nv = new NhanVien();
        nv.in();
        System.out.println(nv);
    }
}

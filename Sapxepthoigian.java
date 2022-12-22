import java.util.*;

public class Sapxepthoigian {
    static class time{
        private int hours;
        private int minutes;
        private int seconds;
        public void in(Scanner sc){
            hours = sc.nextInt();
            minutes = sc.nextInt();
            seconds = sc.nextInt();
        }
        public int getTime(){
            return hours*60*60 + minutes*60 + seconds;
        }
        public void out(){
            System.out.println(hours+" "+minutes+" "+seconds);
        }
    }

    public static void main(String[] args) {
        List<time>  t = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0){
            time t1 = new time();
            t1.in(sc);
            t.add(t1);
        }
        t.sort(Comparator.comparing(time::getTime));
        t.forEach(time :: out);
    }
}

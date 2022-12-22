import java.util.Scanner;

public class phantichthuasonguyento {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int t,tmp=1;
        t = input.nextInt();
        while(t>0){
            int n,cout=0;
            n= input.nextInt();
            System.out.print("Test "+ tmp +": ");
            while(n%2==0){
                cout++;
                n/=2;
            }
            if(cout>0) System.out.print("2(" + cout +") ");
            cout=0;
            for(int i=3;i<=Math.sqrt(n);i++){
                while(n%i==0){
                    cout++;
                    n/=i;
                }
                if(cout>0){
                    System.out.print(i+ "(" + cout + ") ");
                    cout=0;
                }
            }
            if(n!=1){
                System.out.println(n+"(1)");
            }
            else{
                System.out.println();
            }
            tmp++;
            t--;
        }
    }
}

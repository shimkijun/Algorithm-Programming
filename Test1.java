import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m,i,sum =0;
        n = sc.nextInt();
        m = sc.nextInt();

        for(i=1; i <= n;i++){
            if(i % m==0){
                sum=sum+i;
            }
        }
        System.out.printf("%d",sum);
    }
}

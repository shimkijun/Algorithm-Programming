import java.util.Scanner;

public class Test9 {
    static int[] cnt = new int[50001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, j;
        n = sc.nextInt();
        for(i=1; i<=n; i++){
            System.out.println("i = " + i);
            for(j=i; j<=n; j=j+i){
                System.out.println("j = " + j);
                cnt[j]++;
            }
        }
        for(i=1; i<=n; i++){
            System.out.printf("%d ", cnt[i]);
        }
    }
}
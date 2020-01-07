import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, i, sum = 0;
        a = sc.nextInt();
        b = sc.nextInt();
        for(i=a;i<b;i++){
            System.out.printf("%d + ",i);
            sum = sum+i;
        }
        //System.out.printf("%d",b);
        System.out.printf("%d",i);
        //sum = sum + i;
        sum = sum + i;
        System.out.printf(" = %d",sum);
    }
}

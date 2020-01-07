import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, sum=1;
        n = sc.nextInt();
        System.out.printf("%d",1);
        for(i=2; i<n; i++){
            if(n%i==0){
                System.out.printf(" + %d",i);
                sum = sum+i;
            }
        }
        System.out.printf(" = %d",sum);
    }
}
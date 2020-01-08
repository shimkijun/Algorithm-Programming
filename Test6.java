import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] a = str.toCharArray();
        int res=0,cnt=0,i;
        for(i=0; i< a.length; i++ ){
            if(a[i] >= 48 && a[i] <=57){
                res = res*10+(a[i]-48);
            }
        }
        System.out.printf("%d\n",res);
        for(i=1;i<=res;i++){
            if(res%i==0) cnt++;
        }
        System.out.printf("%d\n",cnt);
    }
}

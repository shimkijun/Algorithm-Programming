import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] a = str.toCharArray();
        int year,age;
        if(a[7] == '1' || a[7] == '2' ){
            year=1900+((a[0]-48)*10+(a[1]-48));
        }else{
            year = 2000+((a[0]-48)*10+(a[1]-48));
        }
        age = 2020-year+1;
        System.out.printf("%d ", age);
        if(a[7] == '1' || a[7] == '3' ) System.out.printf("M\n");
        else System.out.printf("W\n");
    }
}

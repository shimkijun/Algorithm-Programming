import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] a = str.toCharArray();
        char[] b = new char[101];
        int i, p=0;
        for(i=0; i<a.length; i++){
            if(a[i] != ' '){
                if(a[i]>=65 && a[i] <= 90){
                    b[p++] = (char) (a[i]+32);
                }else {
                    b[p++] = a[i];
                }
            }
        }
        System.out.println(String.valueOf(b));
    }
}
public class Test6 {
    public static void main(String[] args) {
        char[] a = new char[100];
        int res=0,cnt=0,i;
        System.out.printf("%s",a);
        for(i=0; a[i] != '\0'; i++ ){
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

public class Test10 {

    static int digit_sum(int x){
        int sum = 0, tmp;
        while(x>0){
            tmp=x%10;
            sum=sum+tmp;
            x=x/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n, i, sum = 0, max=-2147000000, res = 0;
        int[] num = {125,15232,97};
        n = 3;
        for(i=0;i < n; i++){
            sum=digit_sum(num[i]);
            if(sum > max){
                max=sum;
                res=num[i];
            }
        }
        System.out.printf("%d\n",res);
    }
}

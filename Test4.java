import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        //첫번째
//        Scanner sc = new Scanner(System.in);
//        int n,i,j,age,max=-2147000000,min=2147000000;
//        System.out.println("인원수 입력");
//        n = sc.nextInt();
//        int[] ages = new int[n];
//        for(i=0;i<n;i++){
//            System.out.printf("나이 입력 %d ",i+1);
//            int num = sc.nextInt();
//            ages[i] = num;
//        }

        //두번째
//        Scanner sc = new Scanner(System.in);
//        int n,i,j,age,max=-2147000000,min=2147000000;
//        System.out.println("인원수 입력");
//        n = sc.nextInt();
//        for(i=0;i<n;i++){
//            System.out.printf("나이 입력 %d ",i+1);
//            int num = sc.nextInt();
//            if(num > max) max = num;
//            if(num<min) min = num;
//        }
//        System.out.printf("%d",max - min);

        //세번째
        int i,age,max=-2147000000,min=2147000000;
        int[] ages = {13, 15, 34, 23, 45, 65, 33, 11, 26, 42};
        for(i = 0;i < ages.length; i++){
            age = ages[i];
            if(age > max) max = age;
            if(age<min) min = age;
        }
        System.out.printf("%d",max - min);
    }
}

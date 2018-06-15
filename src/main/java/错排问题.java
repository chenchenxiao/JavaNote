import java.util.Scanner;

public class 错排问题 {
     
    public static long fn(int m){
        if(m == 1){
            return 0;
        }else if(m == 2){
            return 1;
        }else{
            return (m-1)*(fn(m-1)+fn(m-2));
        }
    }
     
    public static long JieCheng(int n){
        long num = 1;
        for(int i=n;i>=1;i--){
            num = num * i;
        }
        return num;
    }
     
    public static long C(int n,int m){
        long part1 = JieCheng(n);
        long part2 = JieCheng(m);
        long part3 = JieCheng(n - m);
 
        return part1 / (part2 * part3);
    }
     
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int m = sc.nextInt();
            long result = C(n,m)*fn(m);
            System.out.println(result);
        }
    }
}
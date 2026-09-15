import java.util.Scanner ;

public class factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int temp = 1 ;

        for(int i = 1 ;i<= number ; i++){
            temp = temp * i ;
        }

        System.out.println("Factorial:" + temp );
    }
}

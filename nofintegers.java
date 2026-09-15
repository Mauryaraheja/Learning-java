import java.util.Scanner;

public class nofintegers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int temp = 0 ;
        while(number!=0){
            number = number / 10 ;
            temp += 1 ;
        }
        System.out.println("Number of digits:"+ temp);
    }
}

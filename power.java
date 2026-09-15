import java.util.Scanner ;

public class power {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int number = sc.nextInt();
        System.out.println("Enter power:");
        int power = sc.nextInt();

        int result = 1 ;

        for(int i = 1 ; i<= power ; i++){
            result = result * number ;
        }
        System.out.println("Power of number is "+result);
    }
}

import java.util.Scanner ;

public class power {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int number = sc.nextInt();
        System.out.println("Enter power:");
        int power = sc.nextInt();

        for(int i = 1 ; i<= power ; i++){
            number = number*number ;
        }
        System.out.println("Power of number is"+ number);
    }
}

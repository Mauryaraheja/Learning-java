import java.util.Scanner ;

public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int rev = 0 ;

        while(number!=0){
            int digit = number % 10;
            rev = rev*10 + digit ;
            number = number / 10;
        }

        if(number == rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}

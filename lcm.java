import java.util.Scanner ;

public class lcm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        int a = sc.nextInt();
        int b = sc.nextInt();
        int orga = a ;
        int orgb = b;

        while(b!=0){
            int temp = b ;
            b = a%b ;
            a = temp ;
        }
        int gcd = a ;
        System.out.println("LCM:" + ((orga*orgb)/gcd));
    }
}

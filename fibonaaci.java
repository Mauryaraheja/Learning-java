import java.util.Scanner ;

public class fibonaaci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int a = 0 ;
        int b = 1  ;

        System.out.print(a +" ");
        if (number >1){
            System.out.print(b+" ");
        }

        for(int i = 2 ; i< number ; i++){
            int c = a+b ; 
            System.out.print(c + " " );
            a = b ;
            b = c ;
        }
    }
}

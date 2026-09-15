import java.util.Scanner ;


public class alphabet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if((ch >= 65 && ch <= 90) || (ch >= 97 && ch<= 122)){
            System.out.println("You typed a alphabet");
        }
        else {
            System.out.println("Not a Alphabet");
        }
    } 
}

public class ExceptionDemo {

    public static void main(String[] args) {
        //Arithmetic Exception
        try {
            int a = 10;
            int b = 0;

            int result = a/b ;
            System.out.println(result) ; 
        } catch( ArithmeticException e) {
            System.out.println("Arithmetic Exception:Cannot be divided by 0");
        }

        //null point exception
        try{
            String str = null ;
            System.out.println(str.length());
        } catch (NullPointerException e){
            System.out.println("Nullpointer exception - String is empty");
        }

        //ArrayIndexOutOfBoundsException
        try{
            int [] str = {20,3,40};
            System.out.println(str[5]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array doesn't consists that element");
        }
    }
}

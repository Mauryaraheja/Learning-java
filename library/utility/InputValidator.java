package library.utility;

public class InputValidator {
    public static void validateResource(int resourceId){
        if(resourceId <= 0 ){
            throw new IllegalArgumentException("Invalid Resource id ");
        }
    }
    public static void fineDays(int overdueDays){
        if(overdueDays <0 ){
            throw new IllegalArgumentException("Invalid Over due Days");
        }
    }
}

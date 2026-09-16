package library.model;
import library.service.Printable;

public class DigitalResource extends LibraryResource implements Printable {
    public DigitalResource(int resourceId,String title , String Author){
        super(resourceId, title, Author);
    }

    @Override 
    public double calculateFine(int overdueDays){
        return overdueDays*0.2 ;
    }

    @Override 
    public void printDetails(){
        System.out.println("Library Name: " + libraryName);
        System.out.println("Resource ID: " + getResourceId());
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Type: DigitalResource");
    }
}

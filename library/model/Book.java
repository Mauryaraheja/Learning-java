package library.model;
import library.service.Printable ;
import library.utility.InputValidator ;

public class Book extends LibraryResource implements Printable  {
    public Book(int resourceId,String title , String author){
        super(resourceId, title, author);
        InputValidator.validateResource(resourceId);
    }

    @Override 
    public double calculateFine(int overdueDays){
        InputValidator.fineDays(overdueDays);
        return overdueDays *5.0 ;
    }

    @Override 
    public void printDetails(){
        System.out.println("Library Name: " + libraryName);
        System.out.println("Resource ID: " + getResourceId());
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Type: Book");
    }
}   


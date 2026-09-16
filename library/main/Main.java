package library.main;

import library.model.Book;
import library.model.DigitalResource;
import library.model.LibraryResource;
import library.service.Printable;

public class Main{
    public static void main(String[] args){
        LibraryResource[] resources = new LibraryResource[5];

        resources[0] = new Book(12,"Metamorphism","Franz Kakfa");
        resources[1] = new Book(13,"Metamorpism","Franz Kakfa");
        resources[2] = new Book(14,"Metaorhism","Franz Kakfa");
        resources[3] = new DigitalResource(15,"Metamphism","Franz Kakfa");
        resources[4] = new Book(16,"Metmorphism","Franz Kakfa");

        int overdueDays[] = {2,3,1,4,0};

        for (int i = 0; i < resources.length; i++) {
            System.out.println("--------------------------------------------------");

            if (resources[i] instanceof Printable) {
                ((Printable) resources[i]).printDetails();
            }

            System.out.println("Overdue Days: " + overdueDays[i]);
            System.out.println("Fine: Rs. " + resources[i].calculateFine(overdueDays[i]));
        }

        System.out.println("==================================================");
        LibraryResource.displayTotalResources();
    }
}

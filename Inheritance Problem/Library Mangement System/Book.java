//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Book extends LibraryItem {
    private int numberOfPages;
    private String publisher;

    public Book(String var1, String var2, int var3, int var4, String var5) {
        super(var1, var2, var3);
        this.numberOfPages = var4;
        this.publisher = var5;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Pages: " + this.numberOfPages);
        System.out.println("Publisher: " + this.publisher);
    }
}

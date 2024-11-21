//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class LibraryItem {
    private String title;
    private String author;
    private int itemID;

    public LibraryItem(String var1, String var2, int var3) {
        this.title = var1;
        this.author = var2;
        this.itemID = var3;
    }

    public void displayDetails() {
        System.out.println("Item ID: " + this.itemID);
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
    }

    public int getItemID() {
        return this.itemID;
    }
}

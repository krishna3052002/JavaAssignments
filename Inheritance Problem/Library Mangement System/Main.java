//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fer

import java.util.Date;

public class Main {
    public Main() {
    }

    public static void main(String[] var0) {
        Library var1 = new Library();
        Book var2 = new Book("Java Programming", "John Doe", 101, 500, "Tech Publishers");
        var1.addItem(var2);
        Book var3 = new Book("Data Structures", "Jane Smith", 102, 350, "CS Books");
        var1.addItem(var3);
        Journal var4 = new Journal("AI Research", "Dr. AI", 201, 15, new Date());
        var1.addItem(var4);
        System.out.println("Library Items:");
        var1.displayAllItems();
        System.out.println("Removing item with ID 101...");
        var1.removeItem(101);
        System.out.println("Updated Library Items:");
        var1.displayAllItems();
    }
}

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.Iterator;

public class Library {
    private ArrayList<LibraryItem> items = new ArrayList();

    public Library() {
    }

    public void addItem(LibraryItem var1) {
        this.items.add(var1);
        System.out.println("Item added successfully.");
    }

    public void removeItem(int var1) {
        Iterator var2 = this.items.iterator();

        LibraryItem var3;
        do {
            if (!var2.hasNext()) {
                System.out.println("Item not found.");
                return;
            }

            var3 = (LibraryItem)var2.next();
        } while(var3.getItemID() != var1);

        this.items.remove(var3);
        System.out.println("Item removed successfully.");
    }

    public void displayAllItems() {
        if (this.items.isEmpty()) {
            System.out.println("No items in the library.");
        } else {
            Iterator var1 = this.items.iterator();

            while(var1.hasNext()) {
                LibraryItem var2 = (LibraryItem)var1.next();
                var2.displayDetails();
                System.out.println("-----");
            }

        }
    }
}

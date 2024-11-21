//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Date;

public class Journal extends LibraryItem {
    private int volumeNumber;
    private Date publicationDate;

    public Journal(String var1, String var2, int var3, int var4, Date var5) {
        super(var1, var2, var3);
        this.volumeNumber = var4;
        this.publicationDate = var5;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Volume Number: " + this.volumeNumber);
        System.out.println("Publication Date: " + this.publicationDate);
    }
}

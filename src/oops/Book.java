package oops;

public class Book {

    // state
    private int totalNUmberOfPages;

    public void noOfPages(int totalNUmberOfPages) {
        this.totalNUmberOfPages = totalNUmberOfPages;

    }

    void read() {
        System.out.println("Oncourse in reading the given book");
    }

}

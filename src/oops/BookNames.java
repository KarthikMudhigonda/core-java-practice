package oops;

public class BookNames {
    public static void main(String[] args) {
        Book artOfComupterProgramming = new Book();
        Book effectiveJava = new Book();
        Book cleanCode = new Book();

        artOfComupterProgramming.read();
        effectiveJava.read();
        cleanCode.read();

        artOfComupterProgramming.noOfPages(260);
        effectiveJava.noOfPages(394);
        cleanCode.noOfPages(180);
    }

}

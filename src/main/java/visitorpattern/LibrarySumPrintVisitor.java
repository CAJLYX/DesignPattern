package visitorpattern;

//´òÓ¡×ÜÒ³Êý
public class LibrarySumPrintVisitor implements LibraryVisitor{

    private int sum = 0;
    @Override
    public void visit(Book book) {
        sum = sum + book.getNumberOfPages();
    }

    @Override
    public void visit(Article article) {
        sum = sum + article.getNumberOfPages();
    }
    public void printSum(){
        System.out.println("Sum= "+ sum);
    }
}

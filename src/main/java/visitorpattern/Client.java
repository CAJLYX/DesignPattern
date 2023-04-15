package visitorpattern;

public class Client {
    public static void main(String[] args) {
        //被访问者  有接收访问accept方法
        Book book = new Book("红楼梦", "曹雪芹", 0, 1200);
        //访问者  有访问visitor方法
        LibrarySumPrintVisitor librarySumPrintVisitor = new LibrarySumPrintVisitor();
        //调用过程
        book.accept(librarySumPrintVisitor);
        librarySumPrintVisitor.printSum();
    }
}

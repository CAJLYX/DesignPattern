package visitorpattern;

public class Client {
    public static void main(String[] args) {
        //��������  �н��շ���accept����
        Book book = new Book("��¥��", "��ѩ��", 0, 1200);
        //������  �з���visitor����
        LibrarySumPrintVisitor librarySumPrintVisitor = new LibrarySumPrintVisitor();
        //���ù���
        book.accept(librarySumPrintVisitor);
        librarySumPrintVisitor.printSum();
    }
}

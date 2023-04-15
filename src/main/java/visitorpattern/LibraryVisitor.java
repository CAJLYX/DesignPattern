package visitorpattern;

public interface LibraryVisitor {
    public void visit(Book book);
    public void visit(Article article);
}

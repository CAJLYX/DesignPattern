package visitorpattern;

public interface LibraryItemInterface {
    public void accept(LibraryVisitor visitor);
}

package visitorpattern;

public class Article implements LibraryItemInterface{
    private String m_title;//论文名
    private String m_author;//作者名
    private int m_start_page;
    private int m_end_page;

    public Article(String m_title, String m_author, int m_start_page, int m_end_page) {
        this.m_title = m_title;
        this.m_author = m_author;
        this.m_start_page = m_start_page;
        this.m_end_page = m_end_page;
    }

    public int getNumberOfPages(){
        return m_end_page-m_start_page;
    }

    @Override
    public void accept(LibraryVisitor visitor) {
        visitor.visit(this);
    }
}

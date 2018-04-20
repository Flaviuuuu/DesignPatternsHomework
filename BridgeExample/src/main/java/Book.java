public class Book implements Manuscript {
    private String _title, _text, _author;

    public Book(String title, String text, String author) {
        _title = title;
        _text = text;
        _author = author;
    }

    public Book(BackwardsStyle backwardsStyle) {

    }

    public String getTitle() {
        return _title;
    }

    public String getText() {
        return _text;
    }

    public String getAuthor() {
        return _author;
    }

    public void Print() {
        System.out.println("=====" + _title + "=====");
        System.out.println("            by " + _author);
        System.out.println(_text);
    }
}
package week9;

public class Music extends Product {

    private String genre;
    private String format;

    public Music(String id, Category category, double price, String genre, String format) {

        super(id, category, price);
        this.genre = genre;
        this.format = format;

    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return "Music{" +
                "genre ='" + genre + '\'' +
                ", format ='" + format + '\'' +
                '}';
    }
}

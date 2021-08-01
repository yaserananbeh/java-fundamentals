package inheritance;

public class Review {
    private String body;
    private String author;
    private String numOfStars;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getNumOfStars() {
        return numOfStars;
    }

    public void setNumOfStars(String numOfStars) {
        this.numOfStars = numOfStars;
    }

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", numOfStars=" + numOfStars +
                '}';
    }
}

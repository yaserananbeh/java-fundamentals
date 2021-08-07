package inheritance;

import java.util.ArrayList;

import static org.apache.commons.math3.util.Precision.round;

public class Theater {
    private String name;
    private double stars;

    private double SumOfStars;

    private final ArrayList<Object> reviews =new ArrayList<>();

    private final ArrayList<String> movies=new ArrayList<>();

    public ArrayList<Object> getReviews() {
        return reviews;
    }

    public String setReviews(String author,String body,int numOfStars) {
        if(reviews.contains(author)) return "You have submitted a review before";
        Review oneReview=new Review();
        oneReview.setAuthor(author);
        oneReview.setBody(body);
        if (numOfStars<0){
            numOfStars=0;
        }
        if (numOfStars>5){
            numOfStars=5;
        }

        String numOfStarsToString=String.valueOf(numOfStars);
        oneReview.setNumOfStars(numOfStarsToString);

        ArrayList <String> oneReviewContent=new ArrayList<>();

        oneReviewContent.add(oneReview.getAuthor());
        oneReviewContent.add(oneReview.getBody());
        oneReviewContent.add(oneReview.getNumOfStars());

        reviews.add(oneReviewContent);

        double sum=getSumOfStars()+numOfStars; //add the new num to the last sum
        setSumOfStars(sum); //set the sum of the stars
        double star=getSumOfStars()/(reviews.size());
        setStars(round(star, 2));
        return "";
    }
    public String setReviews(String author,String body,int numOfStars,String movie) {
        Review oneReview=new Review();
        oneReview.setAuthor(author);
        oneReview.setBody(body);
        if (numOfStars<0){
            numOfStars=0;
        }
        if (numOfStars>5){
            numOfStars=5;
        }
        reviews.add(oneReview.getAuthor());
        reviews.add(oneReview.getBody());
        reviews.add(oneReview.getNumOfStars());

        return "";
    }
    public double getSumOfStars() {
        return SumOfStars;
    }

    public void setSumOfStars(double sumOfStars) {
        SumOfStars = sumOfStars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double getStars() {
        return stars;
    }

    public void setStars(double stars) {
        this.stars = stars;
    }
    public ArrayList<String> getMovies() {
        return movies;
    }

    public void setMovie(String movie) {
        this.movies.add(movie);
    }
    public void removeMovie(String movie) {
        this.movies.remove(movie);
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", movies=" + movies +
                ", reviews=" + reviews +
                '}';
    }
}


package inheritance;

import java.util.ArrayList;

import static org.apache.commons.math3.util.Precision.round;

public class Shop {
    private String name;
    private String description;
    private String price;
    private double SumOfStars;
    private double stars;

    private ArrayList<Object> reviews =new ArrayList<Object>();


    public ArrayList<Object> getReviews() {
        return reviews;
    }

    public String setReviews(String author,String body,int numOfStars) {
//        System.out.println(reviews.contains(author));
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


    public double getStars() {
        return stars;
    }

    public void setStars(double stars) {
        this.stars = stars;
    }
    public String getName() {
        return name;
    }
    public double getSumOfStars() {
        return SumOfStars;
    }

    public void setSumOfStars(double sumOfStars) {
        SumOfStars = sumOfStars;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if(price<=0){
            this.price="$";
        }else if(price>5){
            this.price="$$$$$";
        }
        else
        {
            String priceToString="";
            for (int i = 0; i < price; i++) {
                priceToString+="$";
            }
            this.price = priceToString;
        }
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", price='" + price + '\'' +
                ", description='" + description + '\'' +
                ", reviews=" + reviews +
                '}';
    }
}

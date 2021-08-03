package inheritance;

import java.util.ArrayList;

import static org.apache.commons.math3.util.Precision.round;

public class Shop {
    private String name;
    private String description;
    private String price;
    private double SumOfStars;
    private double stars;

    private final ArrayList<String> reviews =new ArrayList<>();


    public ArrayList<String> getReviews() {
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

        reviews.add(oneReview.getAuthor());
        reviews.add(oneReview.getBody());
        reviews.add(oneReview.getNumOfStars());


        double sum=getSumOfStars()+numOfStars; //add the new num to the last sum
        setSumOfStars(sum); //set the sum of the stars
        double star=getSumOfStars()/(double)(reviews.size()/3);
        // divided by three because every review add three element in the reviews array
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

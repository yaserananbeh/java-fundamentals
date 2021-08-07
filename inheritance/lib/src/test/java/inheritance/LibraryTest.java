/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test
    void testInstanceOfRestaurant() {
        System.out.println("test 1 SUCCESS");
        Restaurant McDonald = new Restaurant();
        McDonald.setName("McDonald"); // the name of the restaurant
        McDonald.setStars(0); //default stars start from zero
        McDonald.setPrice(2);
        String expected = "Restaurant{name='McDonald', stars=0.0, price='$$', reviews=[]}";
        assertEquals(expected, McDonald.toString());
    }

    @Test
    void testInstanceOfReview() {
        System.out.println("test 2 SUCCESS");
        Review review = new Review();
        review.setAuthor("khalid");
        review.setBody("bad service");
        review.setNumOfStars("1");
        String expected = "Review{body='bad service', author='khalid', numOfStars=1}";
        assertEquals(expected, review.toString());
    }

    @Test
    void testReviewForOneRestaurant() {
        System.out.println("test 3 SUCCESS");
        Restaurant kfc = new Restaurant();
        kfc.setName("kfc");
        kfc.setStars(0);
        kfc.setPrice(5);

        kfc.setReviews("khalid", "bad service", 0);
        kfc.setReviews("mohammad", "great service", 5);
        String expected = "Restaurant{name='kfc', stars=2.5, price='$$$$$', reviews=[[khalid, bad service, 0], " +
                "[mohammad, great service, 5]]}";
        assertEquals(expected, kfc.toString());
    }

    @Test
    void testSetReviewForEachRestaurant() {
        System.out.println("test 4 SUCCESS");
        Restaurant shawermaji = new Restaurant();
        shawermaji.setName("shawermaji");
        shawermaji.setStars(0);
        shawermaji.setPrice(2);
        Restaurant maker = new Restaurant();
        maker.setName("maker");
        maker.setStars(0);
        maker.setPrice(5);

        shawermaji.setReviews("yaser", "bad service", 0);

        maker.setReviews("khalid", "great service", 5);


        ArrayList<Object> expected1 = new ArrayList<>();
        ArrayList<String> oneReviewExpected1 = new ArrayList<>();
        oneReviewExpected1.add("yaser");
        oneReviewExpected1.add("bad service");
        oneReviewExpected1.add("0");
        expected1.add(oneReviewExpected1);
        assertEquals(expected1, shawermaji.getReviews());
        ArrayList<Object> expected2 = new ArrayList<>();
        ArrayList<String> oneReviewExpected2 = new ArrayList<>();
        oneReviewExpected2.add("khalid");
        oneReviewExpected2.add("great service");
        oneReviewExpected2.add("5");
        expected2.add(oneReviewExpected2);
        assertEquals(expected2, maker.getReviews());
    }

    @Test
    void testUpdateStars() {
        System.out.println("test 5 SUCCESS");
        Restaurant shawermaji = new Restaurant();
        shawermaji.setName("shawermaji");
        shawermaji.setStars(0);
        shawermaji.setPrice(5);

        shawermaji.setReviews("yaser", "bad service", 0);
        shawermaji.setReviews("sameer", "great service", 5);
        shawermaji.setReviews("mohammad", "great service", 1);
        double expected = 2.0;
        assertEquals(expected, shawermaji.getStars());
    }

    @Test
    void testShop() {
        System.out.println("test 6 SUCCESS");
        Shop shop1 = new Shop();
        shop1.setName("H&M");
        shop1.setStars(0);
        shop1.setPrice(5);
        shop1.setDescription("Fashion Store");

        shop1.setReviews("yaser", "great but very expensive", 3);
        String expected = "Shop{name='H&M', stars=3.0, price='$$$$$', description='Fashion Store', reviews=[[yaser, " +
                "great but very expensive, 3]]}";
        assertEquals(expected, shop1.toString());
    }

    @Test
    void testTheater() {
        System.out.println("test 7 SUCCESS");
        Theater theater1 = new Theater();
        theater1.setName("Prime");
        theater1.setStars(0);

        theater1.setMovie("fast7");
        theater1.setMovie("transporter");
        String expected = "Theater{name='Prime', stars=0.0, movies=[fast7, transporter], reviews=[]}";
        assertEquals(expected, theater1.toString());
    }

    @Test
    void testTheaterReviewable() {
        System.out.println("test 8 SUCCESS");
        Theater theater1 = new Theater();
        theater1.setName("Prime");
        theater1.setStars(0);

        theater1.setReviews("yaser", "great but very expensive", 0);
        theater1.setReviews("khalid", "great but very expensive", 5);
        theater1.setMovie("fast7");
        theater1.setMovie("transporter");
        String expected = "Theater{name='Prime', stars=2.5, movies=[fast7, transporter], reviews=[[yaser, great but " +
                "very expensive, 0], [khalid, great but very expensive, 5]]}";
        assertEquals(expected, theater1.toString());
    }

    @Test
    void testAddMovieRemoveMovieFromTheater() {
        System.out.println("test 9 SUCCESS");
        Theater theater1 = new Theater();
        theater1.setName("Prime");
        theater1.setStars(0);

        theater1.setMovie("fast7");
        theater1.setMovie("test");
        theater1.setMovie("Avengers");
        theater1.setMovie("transporter");

        theater1.removeMovie("test");
        String expected = "Theater{name='Prime', stars=0.0, movies=[fast7, Avengers, transporter], reviews=[]}";
        assertEquals(expected, theater1.toString());
    }
}

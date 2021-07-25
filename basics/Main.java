import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Main {
    public static void main(String[] args) {
        System.out.println(clock());
        System.out.println(flipNHeads(5));
        System.out.println(pluralize("dog",5));
    }
    public static String pluralize(String animalName,int count) {
        if(count>1){
            return "I own "+ count +" "+animalName+"s.";
        }
        else{
         return "I own "+ count +" "+animalName+".";
        }
    }
    public static double randomNum() {
        return Math.random();
    }
    public static String flipNHeads(int n) {
        int numOfFlips=0;
        int numOfHeadsInRow=0;
        while (n!=numOfHeadsInRow){
            double randomNum =randomNum();
            numOfFlips++;
            if(randomNum<=0.5){
                System.out.println("heads");
                numOfHeadsInRow++;
            }else{
                System.out.println("tails");
                numOfHeadsInRow=0;

            }
        }
//        System.out.println(n);
//        System.out.println("It took "+numOfFlips+" flip "+numOfHeadsInRow+" head in a row. ");
        return "It took "+numOfFlips+" flip "+numOfHeadsInRow+" head in a row. ";
    }
    public static String clock(){
        long lastSec = 0;
        while(true){
            LocalDateTime now = LocalDateTime.now();
            String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            long sec = System.currentTimeMillis() / 1000;
            if (sec != lastSec) {
                System.out.println(time);
                lastSec = sec;
            }
        }
    }

}
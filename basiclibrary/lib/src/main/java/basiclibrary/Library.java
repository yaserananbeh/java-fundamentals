/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.*;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String[] args) {
        //calling the first function and printing the acceptedArray

        System.out.println("------- First func --------------");
        System.out.println(Arrays.toString(roll(3)));
        System.out.println("------------------------------");

        //calling the second function and printing the return value
        // that will be a true if there's a duplicating inside the sent array otherwise the value will be false
        System.out.println("-------- Second func ---------");
        int [] sentArr={1,2,6,3,2,1,1,11};
        System.out.println("Is there any duplicate inside the provided array ? the answer is: "+containsDuplicates(sentArr));
        System.out.println("------------------------------");

        System.out.println("------ Third func -------------");
        int [] func3Arr={5,10,15};
        System.out.println("The average for the provided array elements is : "+getAverage(func3Arr));
        System.out.println("------------------------------");
        System.out.println("------ Fourth func -------------");
        int [][] func4Arr={
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        System.out.println("The Lowest average array ");
        System.out.println(Arrays.toString(getLowestAverage(func4Arr)));
        System.out.println("------------------------------");
        System.out.println("------ Fifth func -------------");
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        System.out.println(Arrays.toString(lowHighTemp(weeklyMonthTemperatures)));

        System.out.println("------------------------------");
        System.out.println("------ Sixth func -------------");
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Hedge");
        System.out.println(tally(votes) + " received the most votes!");
        System.out.println("------------------------------");

    }
    public static int [] roll(int n){
        int [] arr=new int[n];
        int min=1;
        int max=6;

        for (int i=0; i<n;i++){
            arr[i]=min + (int)(Math.random() * ((max - min) + 1));;
        }
        return arr;
    }
    public static boolean containsDuplicates(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    if (arr[i] == arr[j]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static double getAverage(int [] arr){
        double avg=0;
        int sum=0;
        int lengthOfArr=arr.length;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        avg=(double) sum/lengthOfArr;
        return avg;
    }
    public static int[] getLowestAverage(int [][] arr){
        double lowestAvg=500;
        int [] lowestAvgArr=new int[arr[0].length];
        for (int i = 0; i < arr.length; i++) {
        double [] arrayOfAverages=new double[arr[i].length];
            int sumEachArr=0;
            for (int j = 0; j < arr[i].length; j++) {
                sumEachArr+=arr[i][j];
            }
            arrayOfAverages[i]=(double) sumEachArr/arr[i].length;
            if(arrayOfAverages[i]<lowestAvg){
                lowestAvg=arrayOfAverages[i];
                lowestAvgArr=arr[i];
            }
        }
        return lowestAvgArr;

    }
    public static String[] lowHighTemp(int [][] arr){
        int min=arr[0][0];
        int max=arr[0][0];
        ArrayList<String> finalArray=new ArrayList<String>();
        HashSet<Integer> seenTemp=new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                seenTemp.add(arr[i][j]);
                if(arr[i][j]>max){
                    max =arr[i][j];
                }
                if(arr[i][j]<min){
                    min=arr[i][j];
                }
            }
        }
        finalArray.add("High: "+max);
        finalArray.add("Low: "+min);
        for (int i = min; i < max; i++) {
            if (!seenTemp.contains(i)) {
                finalArray.add("Never saw temperature: " + i);
            }
        }
        String [] finalArr=new String[finalArray.size()];
        for (int i = 0; i < finalArray.size(); i++) {
            finalArr[i]=finalArray.get(i);
        }
        return finalArr;
    }
    public static String tally(List<String> votes ){
        HashMap<String,Integer> lastResults=new HashMap<String,Integer>();

        for (String item :
                votes) {
            if(!lastResults.containsKey(item)){
                lastResults.put(item,1);
            }
            else {
                lastResults.put(item,lastResults.get(item)+1);
            }
        }
        int maxVotes=0;
        String winner="";
        for (String value :
                lastResults.keySet()) {
            if(lastResults.get(value)>maxVotes){
                maxVotes=lastResults.get(value);
                winner=value;
            }
        }
//        System.out.println(winner);
        return winner;
    }
}

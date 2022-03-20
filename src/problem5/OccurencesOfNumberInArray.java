package problem5;

import java.util.Arrays;

public class OccurencesOfNumberInArray {
    public static void main(String[]args){
        int [] array = {0,1,22,3,44,55,3,22,44,3,64,53,6,7,2,5,7,3,7,5};
        int numToCheck = Integer.parseInt(args[0]);
        //Finding out how many times 7 occurs in the array
        Arrays.sort(array);
        int result = (int)Arrays.stream(array).filter(i -> { return (i == numToCheck); }).count();
        System.out.println(numToCheck + " occurs " + result + " times.");
    }
}

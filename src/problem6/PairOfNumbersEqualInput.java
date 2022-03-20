package problem6;

import java.util.Arrays;

public class PairOfNumbersEqualInput {

    public static void main(String[]args){
        int [] arrayOfInts = {0,1,2,3,4,5,6,7,8,8,1,2,324,343,2};
        Arrays.sort(arrayOfInts);
        int number = Integer.parseInt(args[0]);
        int firstNumber = 0;
        int secondNumber = 0;
        boolean pairEqualsNumber = false;
        for(int i =0; i < arrayOfInts.length; i++){
            for(int x = 0; x < arrayOfInts.length; x++){
                if( i != x){
                    if((arrayOfInts[i] + arrayOfInts[x]) == number){
                        pairEqualsNumber = true;
                        firstNumber = arrayOfInts[i];
                        secondNumber = arrayOfInts[x];
                    }
                }
            }
        }
        if(pairEqualsNumber) {
            System.out.println("Pair of numbers that equals passed in numer are " + firstNumber + " and " + secondNumber + ".");
        }else{
            System.out.println("There are no pairs thay equal the passed in number");
        }
    }
}

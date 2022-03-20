package problem11;

import java.util.Arrays;
import java.util.stream.Stream;

public class EnglishWords {
    public static void main(String[] args){
        String firstWord = args[0];
        String secondWord = args[1];
        System.out.println("First word is: " + firstWord + ", second word is: " + secondWord);
        char [] firstWordArray = firstWord.toCharArray();
        char [] secondWordArray = secondWord.toCharArray();
        Arrays.sort(firstWordArray);
        Arrays.sort(secondWordArray);
        boolean sameCharacterAndOccurences = true;
        if(firstWordArray.length == secondWordArray.length){
            for(int i = 0; i < firstWordArray.length; i++){

                Stream<Character> charStream = new String(firstWordArray).chars().mapToObj(x->(char)x);
                int finalI = i;
                System.out.println("Character we are viewing is " + firstWordArray[finalI]);
                int occurences_in_first_array = (int) charStream.filter(x -> x == firstWordArray[finalI]).count();
                System.out.println("Occurences int first array are: " + occurences_in_first_array);
                charStream.close();
                Stream<Character> charStream2 = new String(secondWordArray).chars().mapToObj( x -> (char)x);
                int occurences_in_second_array = (int)charStream2.filter(x -> x == firstWordArray[finalI]).count();
                System.out.println("Occurences in second array are: " + occurences_in_second_array);

                if(occurences_in_first_array != occurences_in_second_array){
                    sameCharacterAndOccurences = false;
                }
            }
        }else{
            sameCharacterAndOccurences = false;
        }
        if(sameCharacterAndOccurences){
            System.out.println("First word: " + firstWord + " and second word: " + secondWord + " have the same length and occurences of each character");
        }else{
            System.out.println("Second word: " + firstWord + " and second word: " + secondWord + " do not have the same occurences in each string");
        }
    }
}

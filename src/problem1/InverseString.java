package problem1;

public class InverseString {

    public static void main(String [] args){
        String word = args[0];
        String result = "";
        for(int i = 0; i < word.toCharArray().length; i++){
            Character temp = word.toCharArray()[i];
            if(Character.isUpperCase(temp)){
                temp = Character.toLowerCase(temp);
            }
            else{
                temp = Character.toUpperCase(temp);
            }
            result += temp;
        }
        System.out.println(result);
        if(new StringBuilder(result).reverse().toString().equalsIgnoreCase(result)){
            System.out.println(word + " is a palidrome");
        }else{
            System.out.println(word + " is not a palidrome");
        }
    }


}

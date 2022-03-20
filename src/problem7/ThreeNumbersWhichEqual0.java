package problem7;

public class ThreeNumbersWhichEqual0 {
    public static void main(String[]args){
        int [] numbers = {-3,-7,-22,-55,-66,-54,-78,-33,99,100,33,-45};
        String numbersList = "";
        for(int i =0; i < numbers.length; i++){
            for(int x = 0; x < numbers.length;x++){
                for(int y =0; y < numbers.length;y++){
                    if(i != x && i != y && x != y){
                        if( numbers[i] + numbers[x] + numbers[y] == 0){
                            numbersList = numbers[i] + " , " + numbers[x] + " , " + numbers[y];
                            break;
                        }
                    }
                }
            }
        }
        if(!numbersList.equalsIgnoreCase("")){
            System.out.print("Numbers that add up to 0 are: ");
            System.out.println(numbersList);
        }else{
            System.out.println("There are not any 3 number in this list that add up to 0");
        }
    }
}

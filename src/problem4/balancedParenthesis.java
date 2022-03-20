package problem4;

public class balancedParenthesis {

    public static void main(String [] args){
        String input = args[0];
        int leftParenthesis = 0;
        int leftSquareBracket = 0;
        int leftCurlyBracket = 0;
        boolean balanced = true;
        for(int i = 0; i < input.length(); i++)
        {
            char temp = input.charAt(i);
            switch(temp){
                case '(':
                    leftParenthesis += 1;
                    break;
                case '[':
                    leftSquareBracket += 1;
                    break;
                case '{':
                    leftCurlyBracket += 1;
                    break;
                case ')':
                    if(leftParenthesis > 0){
                        leftParenthesis -= 1;
                    }else {
                        balanced = false;
                    }
                    break;
                case ']':
                    if(leftSquareBracket > 0){
                        leftSquareBracket -= 1;
                    }else{
                        balanced = false;
                    }
                    break;
                case '}':
                    //rightCurlyBracket += 1;
                    if(leftCurlyBracket > 0){
                        leftCurlyBracket -=1;
                    }else{
                        balanced = false;
                    }
                    break;
            }
        }
        if(balanced == false || leftParenthesis > 0 || leftCurlyBracket > 0 || leftSquareBracket > 0){
            System.out.println("String is not balanced");
        }else{
            System.out.println("String is balanced");
        }
    }
}

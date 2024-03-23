package lab_list4;

public class Brackets {
    public static boolean isBalancedBrackets(String expression){
        ArrayStack<Character> stack = new ArrayStack<>();
        for(int i=0; i<expression.length();i++){
            char c = expression.charAt(i);
            if(isOppenningBracket(c)){
                stack.push(c);
            }else if(isClosingBracket(c)){
                if(stack.isEmpty()){
                    return false;
                }else if (isMatchingBracket(stack.top(), c)){
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
    public static boolean isOppenningBracket(char c){
        return c == '(' || c == '[' || c == '{';
    }
    public static boolean isClosingBracket(char c){
        return c == ')' || c == ']' || c == '}';
    }
    public static boolean isMatchingBracket(char open, char close){
        return (open == '(' && close == ')') || (open == '[' && close == ']') || (open == '{' && close == '}');
    }
}

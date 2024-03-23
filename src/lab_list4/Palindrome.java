package lab_list4;

public class Palindrome {
    public static boolean isPalindrome(String expression){
        ArrayStack<Character> stack = new ArrayStack<>();
        for(int i=0; i<expression.length();i++){
            char c = expression.charAt(i);
            stack.push(c);
        }
        ArrayStack<Character> reversedStack = new ArrayStack<>(stack.size());
        String reversedExpression = "";
        while (!stack.isEmpty()) {
            reversedExpression += stack.pop();
        }
        return expression.equals(reversedExpression);
    }
}

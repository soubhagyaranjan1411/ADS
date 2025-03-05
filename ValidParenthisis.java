import java.util.Stack;

public class ValidParenthisis {
    //given a string coantaining only characters '(',')','{','}','[',']', determine if the input string is valid.
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }else if(ch==')' && !stack.isEmpty() && stack.peek()=='('){
                stack.pop();
            }else if(ch=='}' && !stack.isEmpty() && stack.peek()=='{'){
                stack.pop();
            }else if(ch==']' && !stack.isEmpty() && stack.peek()=='['){
                stack.pop();
            }else{
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "()[]{}";
        System.out.println("Input:  " + s1);
        System.out.println("Output: " + isValid(s1));
    }
}

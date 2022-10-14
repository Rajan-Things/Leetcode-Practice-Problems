import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        boolean flag = true;
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(') stack.push(')');
            else if(ch == '[') stack.push(']');
            else if(ch == '{') stack.push('}');
            else if(stack.isEmpty() || stack.pop() != ch) {
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println(stack.isEmpty());
        else
            System.out.println(false);
    }
}

import java.util.Stack;
public class ValidParenthesis {
    public static boolean isValid (String str){
        Stack <Character> stack= new Stack<>();
        for(char c : str.toCharArray()){
            if(c=='('|| c=='{' || c=='['){
                stack.push(c);
            }
            else{
                char top = stack.peek();
                if((c==')' && top=='(')||(c=='}' && top=='{') ||(c==']' && top ==']') ){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String str= "(}";
        System.out.println(isValid(str));
    }
}

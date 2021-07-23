package stack.and.queue;

public class ValidateBrackets {

    public boolean validateBrackets(String string){

        Stack<Character> leftBracketsStack = new Stack<>();


        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) == '{' || string.charAt(i) == '[' || string.charAt(i) == '(' ){
                leftBracketsStack.push(string.charAt(i));
            }else{

                if(leftBracketsStack.isEmpty()){
                    return false;
                }

                if(string.charAt(i) == '}' && leftBracketsStack.peek() == '{' ||
                string.charAt(i) == ']' && leftBracketsStack.peek() == '[' ||
                string.charAt(i) == ')' &&  leftBracketsStack.peek() == '('){
                    leftBracketsStack.pop();

                }

            }

        }
        return leftBracketsStack.isEmpty();
    }

}

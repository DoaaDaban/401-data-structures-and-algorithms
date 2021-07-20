package stack.and.queue;

public class PseudoQueue {
    public Stack<Integer> stack1;
    public Stack<Integer> stack2;

    public PseudoQueue() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();

    }

    public void enqueue(int value){

        while (stack1.top!=null){
            stack2.push(stack1.pop());
        }
        stack1.push(value);
        while (stack2.top != null){
            stack1.push(stack2.pop());

        }
    }


    public int dequeue(){

        if (stack1.top == null){
            throw new IllegalArgumentException("Empty");
        }
        int popped = stack1.peek();
        stack1.pop();
        return popped;
    }

    @Override
    public String toString() {

            return stack1.toString();

    }
}


//   <<< THIS IS A SECOND SOLUTION >>>

//    public void enqueue(int value){
//        stack1.push(value);
//    }

//    public int dequeue(){
//
//        if(stack1.isEmpty() && stack2.isEmpty()){
//            throw new IllegalArgumentException("Empty");
//        }
//
//        if(stack2.isEmpty()){
//            while (!stack1.isEmpty()){
//                stack2.push((stack1.peek()));
//                stack1.pop();
//            }
//            return stack2.pop();
//        }else{
//            return stack2.pop();
//        }
//    }

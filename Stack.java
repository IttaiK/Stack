public class Stack{

    //check that it kicks it back properly
    //careful of overflow/underflow

    private int[] stack;
    private int index = 0;

    public Stack(){
        throw new RuntimeException("NoGivenSizeException");
    }

    public Stack(int size){
        stack = new int[size];
    }

    public void push(int num){
        if(index+1 > stack.length){
            throw new RuntimeException("StackOverflowException");
        }
        stack[index++] = num;
    }

    public int pop(){
        if(index-1 < 0){
            throw new RuntimeException("StackUnderflowException");
        }
        return stack[--index];
    }
}
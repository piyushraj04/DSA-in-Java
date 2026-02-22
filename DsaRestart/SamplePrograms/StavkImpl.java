public class StavkImpl {

    static int[] stack;;
    static int top;

    public void createStack(int size) {
        stack = new int[size];
        top = -1;
        System.out.println("Stack is created of size " + size);
    }

    public void push(int n) {
        if (top == stack.length - 1) {
            System.out.println("Stack is Overflow...!!!");
            return;
        } else {
            stack[++top] = n;
            System.out.println(n + " has been inserted in the stack...");
        }
    }

    public void pop(){
        if(top==-1){
            System.out.println("Stack underflow");
        }
        else{
            System.out.println(stack[top]+" has been deleted...!!!");
        }
    }

    

    public static void main(String[] args) {

    }
}

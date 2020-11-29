package Stack;

public class Stack {
    private int top;
    private int max_size;
    private int[] arr;

    public Stack(int max_size) {
        this.top = -1;
        this.max_size = max_size;
        arr = new int[max_size];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return max_size == top + 1;
    }

    public int getMaxSize() {
        return max_size;
    }

    public void push(int a)
    {
        if(!isFull()) {
            arr[++top] = a;
        }
    }

    public int pop()
    {
        if(isEmpty())
            return -1;

        return arr[top--];
    }

}

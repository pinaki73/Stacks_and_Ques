public class Stack {
    int arr[];
    int top;
    int capacity;

    Stack(int size) {
        arr = new int[size];
        top = -1;
        capacity = size;
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("The stack is full");
            System.exit(1);
        } else {
            System.out.println("we added an element");
            arr[++top] = x;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            System.exit(1);
        } else {
            System.out.println("Element is popped");
        }
        return arr[top--];
    }


    private boolean isEmpty() {
        return top == -1;
    }

    private boolean isFull() {
        return top == capacity - 1;
    }

    public void display() {
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        }

    }
}

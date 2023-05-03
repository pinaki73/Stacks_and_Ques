public class Queue {
    int arr[];
    int rear;
    int front;
    int capacity;

    Queue(int size) {
        arr = new int[size];
        rear = -1;
        front = -1;
        capacity = size;
    }

    public void enqueue(int x) {
        front = 0;
        if (isFull()) {
            System.out.println("The stack is full");
            System.exit(1);
        } else {
            System.out.println("element is enqueued");
            if (front == -1){
                front = 0;
            }
            rear++;
            arr[rear] = x;
        }

    }



    public int dequeue() {
        int e = 0;
        if (isEmpty()) {
            System.out.println("The stack is empty");
            System.exit(1);
        } else {
            System.out.println("Element is dequeued");
            e = arr[front];
            if (front >= rear) {
                front = rear = -1;
            } else {
                front++;
            }
        }
        return e;
    }




    private boolean isEmpty() {
        return (rear == -1 && front ==-1);
    }

    private boolean isFull() {
        return rear == capacity - 1;
    }

    public void display() {
        for (int i = front; i <= rear; i++) {
            System.out.println(arr[i]);
        }
    }
}




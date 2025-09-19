package Tasks;


class CIEStack {
    int[] a;
    int top, n;

    // Constructor
    CIEStack(int n) {
        a = new int[n];
        top = 0;
        this.n = n;
    }

    // Push Operation
    boolean Push(int x) {
        if (top == n) {
            return false; // Stack Overflow
        }
        a[top++] = x;
        return true;
    }

    // Pop Operation
    int Pop() {
        if (top == 0) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        return a[--top];
    }

    // Peek Operation
    int Peek() {
        if (top == 0) {
            System.out.println("Stack is Empty!");
            return -1;
        }
        return a[top - 1];
    }

    // Check if Empty
    boolean isEmpty() {
        return top == 0;
    }

    // Check if Full
    boolean isFull() {
        return top == n;
    }

    // Display stack
    void Display() {
        if (top == 0) {
            System.out.println("Stack is Empty!");
            return;
        }
        System.out.println("Stack elements:");
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}

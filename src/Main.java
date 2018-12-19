public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(100);
        stack.push(5);
        stack.push(10);
        stack.push(15);
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) sb.append(stack.pop()).append(", ");
        System.out.println(sb);
    }}

class Stack {
    private int size;
    private int[] stackArray;
    private int top;

    public Stack(int s) {
        size = s;
        stackArray = new int[size];
        top = -1;
    }

    public void push(int e) { stackArray[++top] = e;
    }

    public long pop() { return stackArray[top--];
    }

    public boolean isEmpty() { return (top == -1);
    }
}



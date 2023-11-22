//LAB QUESTION 1

import java.util.Scanner;

class ques1stack {

    private int top = -1;
    private int size;
    private int[] stack;

    ques1stack(int size) {
        this.size = size;
        stack = new int[size];
    }

    void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            stack[top] = value;
        }
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1; 
        } else {
            int poppedValue = stack[top];
            top--;
            return poppedValue;
        }
    }
}

 class driver {
    public static void main(String[] args) {
        int s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of stack");
        s = sc.nextInt();

        ques1stack obj = new ques1stack(s);

        System.out.println("**STACK MENU**");
        System.out.println("1. push");
        System.out.println("2. pop");

        int input = sc.nextInt();

        if (input == 1) {
            System.out.println("Enter value to push");
            int pushValue = sc.nextInt();
            obj.push(pushValue);
        } else if (input == 2) {
            int poppedValue = obj.pop();
            if (poppedValue != -1) {
                System.out.println("Popped Value: " + poppedValue);
            }
        }
    }
}

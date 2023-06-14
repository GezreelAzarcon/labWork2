package CompleteCode;

public class CompleteCode {
        public static class StackBasic {
            private int maxSize;
            private int top;
            private int[] stackArray;
            // constructor
            public StackBasic(int size) {
                maxSize = size;
                stackArray = new int[maxSize];
                top = -1; // initially stack is empty
            }
            // Add element to top of stack
            public void push(int value) {
                if(top + 1 >= maxSize){
                    System.out.println("Stack Full1!");
                    ;
                }else{
                    top++;
                    stackArray[top] = value;
                }
            }
            // Remove element from top of stack
            public void pop() {
                if(top == -1) {
                    System.out.println("The stack is empty!");
                }else{
                    top--;
                }
            }
            // Return top of stack
            public int peek() {
                if(top == -1){
                    top = 1;
                }else{
                    ;
                }
                return(stackArray[top]);
            }
            public static void main(String[] args) {
                StackBasic stack = new StackBasic(3);

                // Example
                stack.pop(); // stack is empty validation
                stack.push(1);
                stack.push(4);
                System.out.println("Top element: " + stack.peek());
                stack.pop();
                stack.push(6);
                stack.push(10);
                stack.push(100); // stack already full validation
                System.out.println("Top element: " + stack.peek());
            }
        }
    }
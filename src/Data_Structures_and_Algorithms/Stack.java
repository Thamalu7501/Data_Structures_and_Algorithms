package Data_Structures_and_Algorithms;

class StackImplement{
    public int arr[];
    public int top;
    public int capacity;

    public StackImplement(int size)     // Constructor to initialize
    {
        arr = new int[size];    // Initialize the size of the array
        capacity = size;
        top = -1;
    }

    public void push(int x)     // Add elements to the StackImplement
    {
        if (isFull()){      // Checks whether the stack is full
            System.out.println("Stack is full\nProgram is Terminated\n");
            System.exit(1);
        }
        System.out.println("Inserting an element" +x);
        arr[top++] = x;
    }

    public int pop()        // Removes an element
    {
        if (isEmpty()){     // Checks whether the stack is empty
            System.out.println("Stack is Empty");
            System.exit(1);
        }
        return arr[top--];
    }
}
public class Stack {
    public static void main(String [] args){

    }
}
